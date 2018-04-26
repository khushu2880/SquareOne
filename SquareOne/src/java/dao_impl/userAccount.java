/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.userAccount_dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
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
            java.sql.PreparedStatement ps=con.prepareStatement("Insert into user_accounts set username=?,email=?, phnum= ?, password= ?,active=1 ");
            
            ps.setString(1,usermodel.getUsername());
            ps.setString(2,usermodel.getEmail());
            ps.setString(3,usermodel.getPhone());
            ps.setString(4,usermodel.getPass());
            
            ps.executeUpdate();
            java.sql.PreparedStatement ps1=con.prepareStatement("INSERT INTO user_data set username =?,firstname=?,lastname=? ,dob=?,gender=?,email=?,mobnumber =?");
            ps1.setString(1,usermodel.getUsername());
            ps1.setString(2,usermodel.getFname());
            ps1.setString(3,usermodel.getLname());
            ps1.setString(4,usermodel.getDateofbirth());
            ps1.setString(5,usermodel.getGender());
            ps1.setString(6,usermodel.getEmail());
            ps1.setString(7,usermodel.getPhone());
            ps1.executeUpdate();
            
                           
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
        java.sql.PreparedStatement ps=con.prepareStatement("select cart_items from users_carts where username =?");
        ps.setString(1, cartitem.getUsername());
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
            //String cart = rs.getString("cart_items");
            //System.out.println("cart = "+ cart);
            HashMap<String, Integer> hm = new HashMap();
            if(rs.getString("cart_items") == "")
            {
                System.out.println("not empty");
                hm.put((cartitem.getItem()),1);
            }
            else
            {
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
                    hm.put(cartitem.getItem(),1);
                }
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
        return "success";
        
        }
        catch(Exception ex)
        {
            System.out.println("ex in addItemToCart in User Account Page= "+ex);
            return "fail";
        }
        
        
        
    }
    
     @Override
    public String checkAvailability(String parameter,String value)
    {
        try{
            java.sql.PreparedStatement ps=con.prepareStatement("Select * from user_accounts where "+parameter+"=?");
            ps.setString(1, value);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                return "fail";
            }
            else
            {
                return "success";
            }
            
        }
        catch(Exception ex)
        {
            System.out.println("Exception: "+ex);
            return "Fail";
        }
    }
    
    @Override
    public String getBalance(String username) {
        try {
            System.out.println(username);
            java.sql.PreparedStatement ps = con.prepareStatement("Select balance from user_data where username = ? ");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString("balance");
            }
            else
            {
                return "No Data Found";
            }

        } catch (Exception ex) {
            System.out.println("Exception in getBalance in userAccount:" + ex);
            return "fail";
        }
    }
    
    @Override
    public String setBalance(String username, int newbalance) {
        try {
            java.sql.PreparedStatement ps = con.prepareStatement("Update user_data set balance= ? where username= ? ");
            ps.setInt(1, newbalance);
            ps.setString(2, username);
            ps.executeUpdate();
            return "success";

        } catch (Exception ex) {
            System.out.println("Exception in setBalance in userAccount:" + ex);
            return "Exception in setBalance in userAccount";
        }
    }
    
     @Override
    public String emptyCart(String username)
    {
        try{
        java.sql.PreparedStatement ps=con.prepareStatement("DELETE FROM users_carts where username =?");
        ps.setString(1, username);
        ps.executeUpdate();
        return "success";
        }
        catch(Exception ex)
        {
            System.out.println("Exception in userAccount in empty cart"+ex);
            return "fail";
        }
    }
     @Override
    public LinkedHashMap getSelfAccountDetails(String username)
    {
        LinkedHashMap lhm = new LinkedHashMap();
        try {
            PreparedStatement ps = con.prepareStatement("Select * from user_data where username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lhm.put("full_name", rs.getString("fullname"));
                lhm.put("username", rs.getString("username"));
                lhm.put("email", rs.getString("email"));
                lhm.put("birthdate", rs.getString("dob"));
                lhm.put("gender", rs.getString("gender"));
                lhm.put("mobnumber", rs.getString("mobnumber"));
                
            }
        } catch (Exception ex) {
            System.out.println("Exception in userAccount in getSelfAccountDetails: " + ex);
        }

        return lhm;
    }
}
