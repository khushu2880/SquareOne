package controller;

import dao_impl.item;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ItemModel;

/**
 *
 * @author mukul
 */
public class add_new_item extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try{
            String item_name = request.getParameter("new_item");
            String item_quantity = request.getParameter("new_item_quantity");
            String item_price = request.getParameter("new_item_price");
            
            String item_image = request.getParameter("");
            item_image += "abc";
            String item_desc = request.getParameter("new_item_desc");
            String item_visibility = "1";
            
            ItemModel itemmodel = new ItemModel();
            itemmodel.setItem_name(item_name);
            itemmodel.setItem_quantity(item_quantity);
            itemmodel.setItem_price(item_price);
            itemmodel.setItem_image(item_image);
            itemmodel.setItem_desc(item_desc);
            itemmodel.setItem_visibility(item_visibility);
            
            item it = new item();
            String status =  it.addItem(itemmodel);
            out.print(status);
            response.sendRedirect("admin/stock.jsp");
                       
        }
         catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}