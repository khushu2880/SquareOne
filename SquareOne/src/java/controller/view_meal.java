/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.item;
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
public class view_meal extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            HttpSession session= request.getSession();
            if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
            {
                response.sendRedirect("login.jsp");
            }
            String username = session.getAttribute("user_name").toString();
            item it = new item();
            ArrayList al = new ArrayList();
            al =  it.userViewMeals();
            request.setAttribute("list", al);
            System.out.println(al);
                       
            //Getting Cart Items
            ArrayList cartlist = new ArrayList();
            transaction tr = new transaction();
            cartlist = tr.generateCheckout(username);
            request.setAttribute("cart", cartlist);
            RequestDispatcher rd = request.getRequestDispatcher("user/meal.jsp");
            rd.forward(request, response);
                        
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            
        }
    }


}
