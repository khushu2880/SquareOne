/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.transaction_dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import service.DatabaseConnection;

/**
 *
 * @author mukul
 */
public class transaction implements transaction_dao{
    Connection con;
    DatabaseConnection db;
    
    public  transaction()
    {
            db = new DatabaseConnection();
            con = db.startConection();
    }
    @Override
    public ArrayList viewTransactions()
    {
        ArrayList al = new ArrayList();
        try 
        {
            PreparedStatement ps=con.prepareStatement("Select * from transactions");
        
            //Step5: Execute the query
            ResultSet rs=ps.executeQuery();
            
            while(rs.next())
            {
                LinkedHashMap lhm = new LinkedHashMap();
                
                lhm.put("Trans_id",rs.getString("order_id"));
                lhm.put("Card_id",rs.getString("card_id"));
                lhm.put("Amount",rs.getString("amount"));
                lhm.put("Date",rs.getString("date"));
                lhm.put("Time",rs.getString("time"));

                al.add(lhm);

            }
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
        }
                     
        return al; 
    }
    
    @Override
    public LinkedHashMap generateBill()
    {
        LinkedHashMap lhm = new LinkedHashMap();
        System.out.print("JSTL needed to be added");
    //    request.getParameter("trans_id");
        return lhm;
    }
    
    
    
    @Override
    public String createTransaction()
    {
        return "Code not created";
    }
    
    
    @Override
    public ArrayList generateCheckout(String username){
        ArrayList al = new ArrayList();
        try{
            
        
        PreparedStatement ps = con.prepareStatement("Select * from users_carts where username=?");
        ps.setString(1, username);
        ResultSet rs= ps.executeQuery();
        if(rs.next())
        {
            int bill =0;
            String productsarray[] = (rs.getString("cart_items")).split(";");
            for (String product_quant : productsarray) {
                
                String item[] = product_quant.split(":");
                PreparedStatement itemsno_name = con.prepareStatement("Select * from stock where sno=?");
                itemsno_name.setInt(1,Integer.parseInt(item[0]));
                
                ResultSet itemdetail = itemsno_name.executeQuery();
                //System.out.println(rs2);
                if(itemdetail.next())
                {
                LinkedHashMap lhm = new LinkedHashMap();
                String url = "http://localhost/picture/"+itemdetail.getString("image");
                lhm.put("itemsno",item[0]);
                lhm.put("itemname", itemdetail.getString("name"));
                lhm.put("itemprice",itemdetail.getString("price"));
                lhm.put("itemimage",url);
                lhm.put("itemquantity", item[1]);
                
                bill+=(Integer.parseInt(item[1])*Integer.parseInt(itemdetail.getString("price")));
                al.add(lhm);
                }
                
                
                
        }
            LinkedHashMap lhm = new LinkedHashMap();
            lhm.put("bill",bill);
            al.add(lhm);
        
        return al;
        }
        else
                System.out.println("Data no found");
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
        }
        return al;
    }
         
}
