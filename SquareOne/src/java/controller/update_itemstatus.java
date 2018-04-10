/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao_impl.item;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ItemModel;

/**
 *
 * @author mukul
 */
public class update_itemstatus extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            int SNO = Integer.parseInt(request.getParameter("sno"));
            String STATUS = request.getParameter("status");
                        
            ItemModel itemmodel = new ItemModel();
            itemmodel.setSno(SNO);
            
            itemmodel.setItem_visibility(STATUS);
            
            item it = new item();
            String status =  it.updateStatus(itemmodel);
            out.print(status);
            
            
            
            
            
            
            
        }
        catch(Exception ex)
        {
            
            
        }
    }


}
