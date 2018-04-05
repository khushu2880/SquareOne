package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Order_005fSummary_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"../css/order_summary_styles.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
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
      out.write("        <li><a href=\"manage_users.html\">Users</a></li>\r\n");
      out.write("        <li><a href=\"feedback.html\">Feedback</a></li>\r\n");
      out.write("        <li><a href=\"transactions.jsp\">Transactions</a></li>\r\n");
      out.write("        <li><a href=\"account.html\">Account</a></li>\r\n");
      out.write("        <li><a href=\"logout.jsp\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("        <div id=\"bill_container\">\n");
      out.write("            <div id=\"bill_head\">\n");
      out.write("                <div id=\"main_square\">Square One<br><Label id=\"bill_address\">Chitkara University<br>Punjab</label></div>\n");
      out.write("                <div id=\"coffe_cont\"><img id=\"bill_img\" src=\"../images/bil_tq_logo.png\" alt=\"\"/></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xs-12\">\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <i class=\"fa fa-search-plus pull-left icon\"></i>\n");
      out.write("                            <h2>Invoice for purchase #33221</h2>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-xs-12 col-md-3 col-lg-3 pull-left\">\n");
      out.write("                                <div class=\"panel panel-default height\">\n");
      out.write("                                    <div class=\"panel-heading\">Billing Details</div>\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <strong>David Peere:</strong><br>\n");
      out.write("                                        1111 Army Navy Drive<br>\n");
      out.write("                                        Arlington<br>\n");
      out.write("                                        VA<br>\n");
      out.write("                                        <strong>22 203</strong><br>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\">\n");
      out.write("                                <h3 class=\"text-center\"><strong>Order summary</strong></h3>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel-body\">\n");
      out.write("                                <div class=\"table-responsive\">\n");
      out.write("                                ");

                                    String trans_id = request.getParameter("trans_id");
                                    Class.forName("com.mysql.jdbc.Driver");

                                    //Step 2: Create the Connection
                                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");

                                    //Step 3: Make the Query
                                    PreparedStatement ps=con.prepareStatement("Select * from transactions where order_id=?");
                                    ps.setString(1,trans_id);

                                    //Step5: Execute the query
                                    ResultSet rs=ps.executeQuery();
                                    if(rs.next())
                                    {
                                        String bill_amount = rs.getString("amount");
                                        int i=0,name = 0,item_price=1,quantity=2;
                                        String productsarray[] = (rs.getString("order_products")).split(";");
                                
      out.write("\n");
      out.write("                                        <table class=\"table table-condensed\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td><strong>S No.</strong></td>\n");
      out.write("                                                    <td><strong>Item Name</strong></td>\n");
      out.write("                                                    <td class=\"text-center\"><strong>Item Price</strong></td>\n");
      out.write("                                                    <td class=\"text-center\"><strong>Item Quantity</strong></td>\n");
      out.write("                                                    <td class=\"text-right\"><strong>Total</strong></td>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody>\n");
      out.write("                                ");

                                        for(String product_quant : productsarray)
                                        { 
                                            i++;
                                            String item[]=product_quant.split(":");
                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td>");
      out.print(i);
      out.write("</td>\n");
      out.write("                                                    <td>");
      out.print(item[name]);
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(item[item_price]);
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-center\">");
      out.print(item[quantity]);
      out.write("</td>\n");
      out.write("                                                    <td class=\"text-right\">");
      out.print((Integer.parseInt(item[item_price])*Integer.parseInt(item[quantity])));
      out.write("</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                ");
    
                                        }
                                
      out.write("\n");
      out.write("                                                <tr>\n");
      out.write("                                                    <td class=\"highrow\"></td>\n");
      out.write("                                                    <td class=\"highrow\"></td>\n");
      out.write("                                                    <td class=\"highrow\"></td>\n");
      out.write("                                                    <td class=\"highrow text-center\"><strong>Total</strong></td>\n");
      out.write("                                                    <td class=\"highrow text-right\">");
      out.print(bill_amount);
      out.write("</td>\n");
      out.write("                                                </tr>\n");
      out.write("                                             </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                ");

                                    }
                                    else
                                    {
                                        out.print("No Record Found");
                                    }
                                
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("                \n");
      out.write("            \n");
      out.write("                    \n");
      out.write("        </div>\n");
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
