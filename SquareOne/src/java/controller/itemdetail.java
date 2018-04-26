/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.item;
import java.io.IOException;
import java.io.PrintWriter;
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
public class itemdetail extends HttpServlet {

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
                String itemsno = request.getParameter("itemsno");
                                
                item it = new item();
                request.setAttribute("detail",it.detail(itemsno));
                        
                
                RequestDispatcher rd = request.getRequestDispatcher("user/productdetail.jsp");
                
                rd.forward(request, response);
            
        }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in Payment:"+ex);
            
        }
    }


}
