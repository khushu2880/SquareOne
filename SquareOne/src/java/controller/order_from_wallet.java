/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.transaction;
import dao_impl.userAccount;
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
public class order_from_wallet extends HttpServlet {

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
                
                String username = (String) session.getAttribute("user_name");
                String billamt = request.getParameter("billamt");
                
                transaction tr = new transaction();
                ArrayList al = tr.generateCheckout(username);
                
                String result = tr.payViaWallet(username,billamt,al);
                String res_timestamp[] = result.split(";");
                if(res_timestamp.length == 2)
                {
                    result = res_timestamp[0];
                    String order_timestamp = res_timestamp[1];
                    
                    if(result.equalsIgnoreCase("success"))
                    {
                        userAccount uA = new userAccount();
                        String finalres =uA.emptyCart(username);
                        session.setAttribute("trans_id",order_timestamp);
                        RequestDispatcher rd = request.getRequestDispatcher("user/Order_bill.jsp");
                        
                        rd.forward(request, response);
                        
                    }
                    
                    
                
            
                }
                else{
                    System.out.println("Failed");
                }
        }
        }
        catch(Exception ex)
        {
            System.out.println("Exception in order_from_wallet:"+ex);
            
        }
    }


}
