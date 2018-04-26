package controller;

import dao_impl.userAccount;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.CartItem;
import org.apache.commons.fileupload.FileItem;

/**
 *
 * @author mukul
 */
public class add_item_cart extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        
        
              
        
        try{
            
            HttpSession session= request.getSession();
            if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
            {
                response.sendRedirect("login.jsp");
            }
            else
            {
                
                CartItem ci = new CartItem();
                ci.setUsername(session.getAttribute("user_name").toString());
                ci.setItem(request.getParameter("sno"));
                System.out.println(ci.getItem());
                System.out.println(ci.getUsername());
                
                userAccount uA = new userAccount();
                String status =uA.addItemToCart(ci);
                out.print(status);
                
                                
            }
            
    
        
            
                     
        }
         catch(Exception ex)
        {
            out.println("add_item_cart:do post"+ex);
        }
        
    
    }
    
}