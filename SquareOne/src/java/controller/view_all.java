/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.item;
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
public class view_all extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            item it = new item();
            ArrayList al = new ArrayList();
            al =  it.userViewAll();
            System.out.println("Here");
            request.setAttribute("list", al);
            System.out.println(al);
            RequestDispatcher rd = request.getRequestDispatcher("user/products.jsp");
            rd.forward(request, response);
                        
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            
        }
    }


}
