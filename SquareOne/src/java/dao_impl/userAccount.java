/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.userAccount_dao;
import java.sql.Connection;
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
           java.sql.PreparedStatement ps=con.prepareStatement("Insert into user_accounts set username=?, password= ? , email=?,phnum= ?");
            
            ps.setString(1,usermodel.getUsername());
            ps.setString(2,usermodel.getPass());
            ps.setString(3,usermodel.getEmail());
            ps.setString(4,usermodel.getPhone());
            ps.executeUpdate();
            con.close();
            return "success";
            
            
    }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            return "fail";
            
        }
    }
}
