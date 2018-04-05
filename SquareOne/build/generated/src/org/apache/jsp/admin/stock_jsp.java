package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class stock_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Stock</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/stock_styles.css\" type=\"text/css\">\r\n");
      out.write("    <script src=\"js/script_1.9.js\" type=\"text/javascript\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <script>\r\n");
      out.write("            \r\n");
      out.write("        function AddFunc(sno)\r\n");
      out.write("        {\r\n");
      out.write("        document.getElementById('butt_add'+sno).style.display = 'none';\r\n");
      out.write("        document.getElementById('text_add'+sno).style.display = 'flex';\r\n");
      out.write("        }\r\n");
      out.write("        function editprice(sno)\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById('text_price'+sno).removeAttribute('readonly');\r\n");
      out.write("        }\r\n");
      out.write("        function add_to_qty(e,sno)\r\n");
      out.write("        {\r\n");
      out.write("            if(e.keyCode===13)\r\n");
      out.write("            {\r\n");
      out.write("                var avail= parseInt(document.getElementById('item_quantity'+sno).innerHTML);\r\n");
      out.write("                avail += parseInt(document.getElementById('text_add'+sno).value);\r\n");
      out.write("                document.getElementById('item_quantity'+sno).innerHTML=avail;\r\n");
      out.write("                document.getElementById('text_add'+sno).value='';\r\n");
      out.write("                document.getElementById('butt_add'+sno).style.display = 'flex';    \r\n");
      out.write("                document.getElementById('text_add'+sno).style.display = 'none';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function update_price(e,sno)\r\n");
      out.write("        {\r\n");
      out.write("            if(e.keyCode===13)\r\n");
      out.write("            {\r\n");
      out.write("                document.getElementById('text_price'+sno).placeholder=document.getElementById('text_price'+sno).value;\r\n");
      out.write("                document.getElementById('text_price'+sno).value='';\r\n");
      out.write("                document.getElementById('text_price'+sno).readOnly= true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function change_visibilty_status(sno , status)\r\n");
      out.write("        {\r\n");
      out.write("          //  document.getElementById(\"visibility_img\"+sno).src=\"../images/icons/visible_true.png\";\r\n");
      out.write("         $.ajax({\r\n");
      out.write("            type: \"POST\",\r\n");
      out.write("            url: \"\",\r\n");
      out.write("            data: {sno: sno,status: status},\r\n");
      out.write("            success: function (result)\r\n");
      out.write("            {\r\n");
      out.write("                if (result.trim() === 'done') {\r\n");
      out.write("                   location.reload();\r\n");
      out.write("                } else {\r\n");
      out.write("                  //  document.getElementById('adm_validate').innerHTML = \"UserName and Password Incorrect\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        function add_desc()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById('desc_area').style.display = 'flex';\r\n");
      out.write("        }\r\n");
      out.write("        </script>\r\n");
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
      out.write("        <li><a href=\"users.html\">Users</a></li>\r\n");
      out.write("        <li><a href=\"feedback.html\">Feedback</a></li>\r\n");
      out.write("        <li><a href=\"transactions.jsp\">Transactions</a></li>\r\n");
      out.write("        <li><a href=\"account.html\">Account</a></li>\r\n");
      out.write("        <li><a href=\"Logout.html\">Logout</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    </header>\r\n");
      out.write("    <div id=\"container\">\r\n");
      out.write("        <table id=\"stock_table\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>S No.</th>\r\n");
      out.write("                <th>Item</th>\r\n");
      out.write("                <th>Available(Qty)</th>\r\n");
      out.write("                <th>Add</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                <th>Visibility</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

            
                try 
                {
         
            
                    Class.forName("com.mysql.jdbc.Driver");
           
                    //Step 2: Create the Connection
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");
           
                    //Step 3: Make the Query
                    PreparedStatement ps=con.prepareStatement("Select * from stock");
           
                    //Step5: Execute the query
                    ResultSet rs=ps.executeQuery();
                        
                    while(rs.next())
                    {
                        String sno = rs.getString("sno");
                        String item_name = rs.getString("name");
                        String item_quantity = rs.getString("quantity");
                        String item_price = rs.getString("price");
                        String item_image = rs.getString("image");
                        String item_desc = rs.getString("description");
                        String item_visibility = rs.getString("visibility");
                        



                        String path = "C:/wamp64/www/picture/"+item_image;
                        String url = "http://localhost/picture/"+item_image;
            
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>");
      out.print(sno);
      out.write("</td>\r\n");
      out.write("                <td id=\"item_name");
      out.print(sno);
      out.write("\" class=\"item_name\">");
      out.print(item_name);
      out.write("</td>\r\n");
      out.write("                <td id=\"item_quantity");
      out.print(sno);
      out.write("\" class=\"item_avail\">");
      out.print(item_quantity);
      out.write("</td>\r\n");
      out.write("                <td><button id='butt_add");
      out.print(sno);
      out.write("' class=\"butt_add\" onclick=\"AddFunc('");
      out.print(sno);
      out.write("')\" value=\"add\"><img src=\"../images/icons/add.png\"></button>\r\n");
      out.write("                    <input id='text_add");
      out.print(sno);
      out.write("' class=\"text_add\" type=\"text\" onKeydown=\"add_to_qty(event,'");
      out.print(sno);
      out.write("')\"></td>\r\n");
      out.write("                <td><input id=\"text_price");
      out.print(sno);
      out.write("\" class=\"text_price\" type=\"text\" onKeydown=\"update_price(event,'");
      out.print(sno);
      out.write("')\" readonly placeholder=\"");
      out.print(item_price);
      out.write("\"><Button class=\"butt_edit\" onclick=\"editprice('");
      out.print(sno);
      out.write("')\"><img class=\"edit_price_icon\" width=\"20px\" src=\"../images\\icons\\edit.png\"></button></td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    ");
 if(item_visibility.equals("0")){ 
      out.write("\r\n");
      out.write("                    <button id=\"visibility_button");
      out.print(sno);
      out.write("\" value=\"\" class=\"visibility_button\" onclick=\"change_visibilty_status(");
      out.print(sno);
      out.write(",'1'); \">\r\n");
      out.write("                        <img  src=\"../images/icons/visible_false.png\" id=\"visibility_img");
      out.print(sno);
      out.write("\" class=\"visibility_img\">\r\n");
      out.write("                        ");
}
                    else
                    { 
      out.write("\r\n");
      out.write("                        <button id=\"visibility_button");
      out.print(sno);
      out.write("\" value=\"\" class=\"visibility_button\" onclick=\"change_visibilty_status(");
      out.print(sno);
      out.write(",'0') \">\r\n");
      out.write("                        <img  src=\"../images/icons/visible_true.png\" id=\"visibility_img");
      out.print(sno);
      out.write("\" class=\"visibility_img\">\r\n");
      out.write("                        ");

                    }
                    
                    
      out.write("\r\n");
      out.write("                    </button>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

           
                    }
                    con.close();
                    
            
            
            
            }
            catch(Exception ex)
        {
            out.println("Exception on ViewAll Record = "+ex);
        }

            
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"new_item_box\">\r\n");
      out.write("        <Label id=\"new_item_label\">New Item</Label>\r\n");
      out.write("        <form action=\"../add_new_item\" method=\"post\">\r\n");
      out.write("            <table id=\"new_item_table\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Name</td>\r\n");
      out.write("                    <td>Quantity</td>\r\n");
      out.write("                    <td>Price</td>\r\n");
      out.write("                    <td>Image</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td><input type=\"text\" id=\"new_item_name\" name=\"new_item\"></td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"new_item_quantity\" name=\"new_item_quantity\" ></td>\r\n");
      out.write("                    <td><input type=\"text\" id=\"new_item_price\" name=\"new_item_price\"></td>\r\n");
      out.write("                    <td><input type=\"file\"></td>\r\n");
      out.write("                        \r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"1\"><span id=\"add_desc\" onclick=\"add_desc()\">Add Description</span></td>\r\n");
      out.write("                    <td colspan=\"2\"><textarea id=\"desc_area\" style=\"display: none\" value=\"NULL\" ></textarea></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"4\"><input type=\"submit\" id=\"new_item_butt\" value=\"Create\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
