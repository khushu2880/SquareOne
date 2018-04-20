/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.transaction;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mukul
 */
public class checkout extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try{
            
            HttpSession session= request.getSession();
            if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
            {
                response.sendRedirect("login.jsp");
            }
            else
            {
                
                String username = session.getAttribute("user_name").toString();
                ArrayList ai=new ArrayList();
                transaction tr = new transaction();
                ai = tr.generateCheckout(username);
                request.setAttribute("list", ai);
                System.out.println(ai);
                RequestDispatcher rd = request.getRequestDispatcher("user/checkout.jsp");
                rd.forward(request, response);
            
        }
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            
        }
    }


}
