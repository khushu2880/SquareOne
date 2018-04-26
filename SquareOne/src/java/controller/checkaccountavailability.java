
package controller;

import dao_impl.userAccount;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mukul
 */
public class checkaccountavailability extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try{
            
            userAccount uA = new userAccount();
            if(request.getParameterMap().containsKey("newemail"))
            {
                System.out.print(request.getParameter("newemail"));
                out.print(uA.checkAvailability("email", request.getParameter("newemail")));
            }
            if(request.getParameterMap().containsKey("newphone"))
            {
                out.print(uA.checkAvailability("phnum", request.getParameter("newphone")));
            }
            if(request.getParameterMap().containsKey("newusername"))
            {
                out.print(uA.checkAvailability("username", request.getParameter("newusername")));
                
            }
            
            
            //        response.sendRedirect("user/about.jsp");
        
                //response.sendRedirect("");
            }
        catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}
