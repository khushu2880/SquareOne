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
}
