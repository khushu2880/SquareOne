/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.adminAccount;
import dao_impl.item;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.ItemModel;

/**
 *
 * @author mukul
 */
public class admin_change_pass extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            HttpSession session = request.getSession();
            if (session.getAttribute("user_name") == null || session.getAttribute("user_name").equals("")) {
                response.sendRedirect("admin.jsp");
            }
            String ID= session.getAttribute("user_name").toString();
            
            String newpassword = request.getParameter("newpassword");
            
            
            
                                          
            adminAccount aA = new adminAccount();
            String status =  aA.changePassword(ID, newpassword);
            out.print(status);
            
            
            
            
            
            
            
        }
        catch(Exception ex)
        {
            
            
        }
    }


}
