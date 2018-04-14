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
import java.util.LinkedHashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mukul
 */
public class OrderSummary extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            transaction tr = new transaction();
            LinkedHashMap lhm;
            lhm = new LinkedHashMap();
            lhm =  tr.generateBill();
            request.setAttribute("list", lhm);
            System.out.println(lhm);
            RequestDispatcher rd = request.getRequestDispatcher("admin/stock.jsp");
            rd.forward(request, response);
            
            
        }
        catch(Exception ex)
        {
            System.out.println("ex"+ex);
            
        }
    }


}
