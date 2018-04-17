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
import model.ItemModel;
import model.TransactionModel;
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
    public ArrayList<ItemModel> viewTransactions()
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
    
    
}
