
package controller;

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
public class verify_admin_login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try{
            String user_name = request.getParameter("email");
            String user_pass = request.getParameter("pass");
            
            Class.forName("com.mysql.jdbc.Driver");
                  
            //Step 2: Create the Connection
            Connection con;
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");
                        
           
            //Step 3: Make the Query
            java.sql.PreparedStatement ps=con.prepareStatement("SELECT password FROM admin_accounts WHERE ID = ? ;");
            ps.setString(1, user_name);
            ResultSet rs= ps.executeQuery();
            
            if(rs.next())
            {
                String cor_pass=rs.getString("password");
                if(!(user_pass.equals(cor_pass)))
                {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Password Incorrect');");
                    out.println("window.location= 'admin.jsp'");
                    out.println("</script>");
                }
                else
                {
                    HttpSession session = request.getSession();
                    session.setAttribute("user_name",user_name);
                    response.sendRedirect("admin/stock.jsp");
                }
            }
            else
            {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('User Not Found');");
                out.println("window.location= 'admin.jsp'");
                out.println("</script>");
                //response.sendRedirect("");
            }
            
           
            
           
            
            con.close();
            
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}
