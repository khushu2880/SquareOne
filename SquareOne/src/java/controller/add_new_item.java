package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
            String item_visibility = request.getParameter("new_item_desc");
            item_visibility="1";
            Class.forName("com.mysql.jdbc.Driver");
                  
            //Step 2: Create the Connection
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");
                        
           
            //Step 3: Make the Query
            java.sql.PreparedStatement ps=con.prepareStatement("Insert into stock set name=?, quantity= ?,price=?, image= ?,description=?,visibility=?");
            
            ps.setString(1,item_name);
            ps.setString(2,item_quantity);
            ps.setString(3,item_price);
            ps.setString(4,item_image);
            ps.setString(5,item_desc);
            ps.setString(6,item_visibility);
            
            ps.executeUpdate();
            con.close();
            response.sendRedirect("admin/stock.jsp");
                       
        }
         catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}