package controller;

import dao_impl.userAccount;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UserModel;

/**
 *
 * @author mukul
 */
public class create_user extends HttpServlet {
    
       
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        
        
        
        try{
            
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            
                 
            
            
            
            
            UserModel usermodel = new UserModel();
            
            usermodel.setUsername(username);
            usermodel.setPass(password);
            usermodel.setEmail(email);
            usermodel.setPhone(phone);
            
                       
            userAccount uA = new userAccount();
            String status =  uA.new_user(usermodel);
            out.print(status);
            response.sendRedirect("login.jsp");
                     
        }
         catch(Exception ex)
        {
            out.println(ex);
        }
        
    
    }
    
}