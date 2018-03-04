
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mukul
 */
public class verify_admin_login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try(){
            String user_name = request.getParameter("email");
            String user_pass = request.getParameter("pass");
            out.println(user_name);
            out.println(user_name);
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}
