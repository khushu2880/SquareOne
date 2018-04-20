/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.userAccount_dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import model.CartItem;
import model.UserModel;
import service.DatabaseConnection;


public class userAccount implements userAccount_dao
{
     Connection con;
    DatabaseConnection db;
    
      public  userAccount()
        {
            db = new DatabaseConnection();
            con = db.startConection();
        }
       
    @Override
    public String new_user(UserModel usermodel)
    {
        try{                    
           
            //Step 3: Make the Query
           java.sql.PreparedStatement ps=con.prepareStatement("Insert into user_accounts set firstname=?,username=?, password= ? , email=?,phnum= ?");
            
            ps.setString(1,usermodel.getUsername());
            ps.setString(2,usermodel.getPass());
            ps.setString(3,usermodel.getEmail());
            ps.setString(4,usermodel.getPhone());
            ps.executeUpdate();
            java.sql.PreparedStatement ps1=con.prepareStatement("INSERT INTO `user_data` (`sno`, `username`, `firstname`, `lastname`, `dob`, `gender`, `email`, `mobnumber`) VALUES (NULL, ?, ?, ?, ?, ?,?,?)");
            ps1.setString(1,usermodel.getUsername());
            ps1.setString(2,usermodel.getFname());
            ps1.setString(3,usermodel.getLname());
            ps1.setString(4,usermodel.getDateofbirth());
            ps1.setString(5,usermodel.getGender());
            ps1.setString(6,usermodel.getEmail());
            ps1.setString(7,usermodel.getPhone());
            
                           
            con.close();
            return "success";
            
            
    }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            return "fail";
            
        }
    }
     @Override
    public String addItemToCart(CartItem cartitem){
        try{
        java.sql.PreparedStatement ps=con.prepareStatement("select * from users_carts where username =?");
        ps.setString(1, cartitem.getUsername());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            HashMap<String, Integer> hm = new HashMap();
        
            String productsarray[] = (rs.getString("cart_items")).split(";");
            for (String product_quant : productsarray)
            {
                String item[] = product_quant.split(":");
                hm.put(item[0],Integer.parseInt(item[1]));
            }
            if(hm.containsKey(cartitem.getItem()))
            {
                int quantity = hm.get(cartitem.getItem());
                quantity = quantity+1;
                hm.put(cartitem.getItem(),quantity);
            }
            else
            {
                hm.put((cartitem.getItem()),1);
            }
            java.sql.PreparedStatement ps2=con.prepareStatement("Update users_carts set cart_items=? where username =?");
            ps2.setString(1, cartitem.hashtoItem_Quant(hm));
            ps2.setString(2, cartitem.getUsername());
            ps2.executeUpdate();
            con.close();
        }
        else
        {
            HashMap<String, Integer> hm = new HashMap();
            hm.put(cartitem.getItem(),1);
            java.sql.PreparedStatement ps2=con.prepareStatement("Insert into users_carts set username =?,cart_items=?" );
            ps2.setString(1, cartitem.getUsername());
            ps2.setString(2, cartitem.hashtoItem_Quant(hm));
            
            ps2.executeUpdate();
            con.close();
        }
               
        con.close();
        return "Successfully Added";
        
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            return "fail";
        }
        
        
        
    }
    
}
