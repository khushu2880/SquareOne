/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.adminAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mukul
 */
public class view_manage_users extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            adminAccount acc = new adminAccount();
            ArrayList al = new ArrayList();
            al =  acc.viewAccounts();
            
            request.setAttribute("list", al);
            System.out.println(al);
            
            RequestDispatcher rd = request.getRequestDispatcher("admin/manage_users.jsp");
            rd.forward(request, response);
            
        }
        catch(Exception ex)
        {
            System.out.println("ex");
            
        }
    }

   

}
