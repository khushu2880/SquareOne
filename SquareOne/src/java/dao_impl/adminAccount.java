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
public class adminAccount implements adminAccount_dao {

    Connection con;
    DatabaseConnection db;

    public adminAccount() {
        db = new DatabaseConnection();
        con = db.startConection();
    }

    @Override
    public LinkedHashMap getSelfAccountDetails(String username) {

        LinkedHashMap lhm = new LinkedHashMap();
        try {
            PreparedStatement ps = con.prepareStatement("Select * from admin_data where ID = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lhm.put("f_name", rs.getString("f_name"));
                lhm.put("l_name", rs.getString("l_name"));
                lhm.put("full_name", rs.getString("full_name"));
                lhm.put("id", rs.getString("ID"));
                lhm.put("username", rs.getString("username"));
                lhm.put("gender", rs.getString("gender"));
                lhm.put("emp_id", rs.getString("emp_id"));
                lhm.put("phnumber", rs.getString("number"));
                lhm.put("pic_name", rs.getString("pic"));
                lhm.put("birthdate", rs.getString("dob"));
                lhm.put("joiningdate", rs.getString("joining_date"));

            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }

        return lhm;
    }

    @Override
    public ArrayList viewAccounts() {
        ArrayList al = new ArrayList();

        try {

            PreparedStatement ps = con.prepareStatement("Select * from admin_accounts join admin_data on admin_data.ID=admin_accounts.ID");
            //Step5: Execute the query
            ResultSet rs = ps.executeQuery();

            int tabelrow = 0;

            while (rs.next()) {
                tabelrow++;
                LinkedHashMap lhm = new LinkedHashMap();
                lhm.put("Table_row", tabelrow);
                lhm.put("Sno", rs.getInt("sno"));
                lhm.put("Username", rs.getString("ID"));
                lhm.put("Active", rs.getString("active"));
                lhm.put("Lastlogin", rs.getString("lastlogin"));
                lhm.put("Emp_id", rs.getString("emp_id"));
                lhm.put("Name", rs.getString("full_name"));
                al.add(lhm);

            }

        } catch (Exception ex) {
            System.out.println("Exception" + ex);
        }
        return al;
    }
    @Override
    public String changePassword(String ID,String newpassword)
    {
        try{
        PreparedStatement ps = con.prepareStatement("UPDATE admin_accounts SET password = ? WHERE admin_accounts.ID = ?");
            ps.setString(1, newpassword);
            ps.setString(2, ID);
            ps.executeUpdate();
            return "success";
    }
        catch (Exception ex) {
            System.out.println("Exception" + ex);
            return "fail";
        }
    }
    
}
