package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class transactions_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");


    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("..//admin.jsp");
    }
    

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>TODO supply a title</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link href=\"transaction_styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div>\r\n");
      out.write("            <table id=\"transaction_table\">\r\n");
      out.write("                <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>Order ID</th>\r\n");
      out.write("                        <th>Card Holder Name</th>\r\n");
      out.write("                        <th>Order Amount</th>\r\n");
      out.write("                        <th>Time</th>\r\n");
      out.write("                        <th>Date</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    ");

                        try 
                        {
         
            
                            Class.forName("com.mysql.jdbc.Driver");

                            //Step 2: Create the Connection
                            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");

                            //Step 3: Make the Query
                            PreparedStatement ps=con.prepareStatement("Select * from transactions");

                            //Step5: Execute the query
                            ResultSet rs=ps.executeQuery();
                        
                            while(rs.next())
                            {
                                String trans_id = rs.getString("order_id");
                                String card_id = rs.getString("cardholder_id");
                                String amount = rs.getString("amount");
                                String date = rs.getString("date");
                                String time = rs.getString("time");
                                
                                
                    
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        \r\n");
      out.write("                        <td><a href=\"Order_Summary.jsp?trans_id=");
      out.print(trans_id);
      out.write('"');
      out.write('>');
      out.print(trans_id);
      out.write("</a></td>\r\n");
      out.write("                        <td><a href=\"account_detail\">");
      out.print(card_id);
      out.write("</a></td>\r\n");
      out.write("                        <td>");
      out.print(amount);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(time);
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(date);
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");

                            }
                            con.close();
                    
                        }
                        catch(Exception ex)
                        {
                            out.println("Exception on ViewAll Record = "+ex);
                        }

                    
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            </tbody>\r\n");
      out.write("                <tfoot>\r\n");
      out.write("                    <td colspan=\"6\"><label>Page:</label><a href=\"###self###\">1</a>\r\n");
      out.write("                        <a href=\"###last###\">2</a>\r\n");
      out.write("                        <label style=\"margin-left: 20px;\">Jump to:</label><input id=\"jump_page_no\" type=\"text\"></td>\r\n");
      out.write("                </tfoot>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
