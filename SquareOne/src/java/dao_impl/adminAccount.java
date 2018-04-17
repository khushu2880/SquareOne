/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.adminAccount_dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import service.DatabaseConnection;

import java.util.LinkedHashMap;



/**
 *
 * @author mukul
 */
public class adminAccount implements adminAccount_dao
{
    Connection con;
    DatabaseConnection db;
    
      public  adminAccount()
        {
            db = new DatabaseConnection();
            con = db.startConection();
        }
    @Override
      public ArrayList viewAccounts()
      {
        ArrayList al = new ArrayList();
        
        try 
        {
            
            PreparedStatement ps=con.prepareStatement("Select * from admin_accounts join admin_data on admin_data.ID=admin_accounts.ID");
                    //Step5: Execute the query
                    ResultSet rs=ps.executeQuery();
                    
            int tabelrow = 0;
            
            while (rs.next()) 
            {
                tabelrow++;
                LinkedHashMap lhm = new LinkedHashMap();
                lhm.put("Table_row",tabelrow);
                lhm.put("Sno",rs.getInt("sno"));
                lhm.put("Username",rs.getString("ID"));
                lhm.put("Active",rs.getString("active"));
                lhm.put("Lastlogin",rs.getString("lastlogin"));
                lhm.put("Emp_id",rs.getString("emp_id"));
                lhm.put("Name",rs.getString("full_name"));
                al.add(lhm);

            }

          }
        catch(Exception ex)
        {
            System.err.println("ex"+ex);
        }  
          
          
          
          
          
          return al;
      }
}
