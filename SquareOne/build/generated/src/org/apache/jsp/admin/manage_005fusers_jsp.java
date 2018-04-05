package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class manage_005fusers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin/navbar.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');

    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("..//admin.jsp");
    }
    //System.out.print(session.getAttribute("user_name"));
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/navbar_styles.css\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"bar\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("        <li><a href=\"stock.jsp\">Stock Manager</a></li>\r\n");
      out.write("        <li><a href=\"manage_users.jsp\">Users</a></li>\r\n");
      out.write("        <li><a href=\"feedback.html\">Feedback</a></li>\r\n");
      out.write("        <li><a href=\"transactions.jsp\">Transactions</a></li>\r\n");
      out.write("        <li><a href=\"account.html\">Account</a></li>\r\n");
      out.write("        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <th>S No.</th>\n");
      out.write("                <th>Username</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Employee ID</th>\n");
      out.write("                <th>Last Login</th>\n");
      out.write("                <th>Active</th>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("            ");

            
                try 
                {
         
            
                    Class.forName("com.mysql.jdbc.Driver");
           
                    //Step 2: Create the Connection
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");
           
                    //Step 3: Make the Query
                    PreparedStatement ps=con.prepareStatement("Select * from admin_accounts join admin_data on admin_data.ID=admin_accounts.ID where ID != ?");
                    ps.setString(1,session.getAttribute("user_name").toString());
                    //Step5: Execute the query
                    ResultSet rs=ps.executeQuery();
                        
                    while(rs.next())
                    {
                        
                        String sno = rs.getString("sno");
                        String username = rs.getString("ID");
                        if(username == session.getAttribute("user_name").toString())
                            continue;
                        String active = rs.getString("active");
                        String lastlogin = rs.getString("lastlogin");
                        String emp_id = rs.getString("emp_id");
                        String name = rs.getString("full_name");
            
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(sno);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(username);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(emp_id);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(lastlogin);
      out.write("</td>\n");
      out.write("                    <td>Active</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                    con.close();
                }
                catch(Exception ex)
                {
                    out.println("Exception on ViewAll Record = "+ex);
                }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
