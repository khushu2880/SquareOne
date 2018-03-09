package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Stock</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/stock_styles.css\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <script>\r\n");
      out.write("        function AddFunc(butt_id,text_add_ID)\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(butt_id).style.display = 'none';\r\n");
      out.write("            document.getElementById(text_add_ID).style.display = 'flex';\r\n");
      out.write("        }\r\n");
      out.write("        function editprice(text_price_ID)\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(text_price_ID).removeAttribute('readonly');\r\n");
      out.write("        }\r\n");
      out.write("        function add_to_qty(e,text_add_ID,item_avail_ID,butt_add_ID)\r\n");
      out.write("        {\r\n");
      out.write("            if(e.keyCode===13)\r\n");
      out.write("            {\r\n");
      out.write("                var avail= parseInt(document.getElementById(item_avail_ID).innerHTML);\r\n");
      out.write("                avail += parseInt(document.getElementById(text_add_ID).value);\r\n");
      out.write("                document.getElementById(item_avail_ID).innerHTML=avail;\r\n");
      out.write("                document.getElementById(text_add_ID).value='';\r\n");
      out.write("                document.getElementById(butt_add_ID).style.display = 'flex';    \r\n");
      out.write("                document.getElementById(text_add_ID).style.display = 'none';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function update_price(e,text_price_ID)\r\n");
      out.write("        {\r\n");
      out.write("            if(e.keyCode===13)\r\n");
      out.write("            {\r\n");
      out.write("                document.getElementById(text_price_ID).placeholder=document.getElementById(text_price_ID).value;\r\n");
      out.write("                document.getElementById(text_price_ID).value='';\r\n");
      out.write("                document.getElementById(text_price_ID).readOnly= true;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        function change_visibilty_status()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById(\"visibility_img\").src=\"../images/icons/visible_true.png\";\r\n");
      out.write("        }\r\n");
      out.write("               \r\n");
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
      out.write("        <li><a href=\"stock.html\">Stock Manager</a></li>\r\n");
      out.write("        <li><a href=\"users.html\">Users</a></li>\r\n");
      out.write("        <li><a href=\"feedback.html\">Feedback</a></li>\r\n");
      out.write("        <li><a href=\"transactions.html\">Transactions</a></li>\r\n");
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
      out.write("                <th>Item</th>\r\n");
      out.write("                <th>Available(Qty)</th>\r\n");
      out.write("                <th>Add</th>\r\n");
      out.write("                <th>Price</th>\r\n");
      out.write("                <th>Remove</th>\r\n");
      out.write("                <th>Visibility</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td id=\"item_name\">Rice</td>\r\n");
      out.write("                <td id=\"item_avail\">50</td>\r\n");
      out.write("                <td><Button id=\"butt_add\" onclick=\"AddFunc(this.id,'text_add')\"><img src=\"../images/icons/add.png\"></button>\r\n");
      out.write("                    <input id=\"text_add\" type=\"text\" onKeydown=\"add_to_qty(event,this.id,'item_avail','butt_add')\" ></td>\r\n");
      out.write("                <td><input id=\"text_price\" type=\"text\" onKeydown=\"update_price(event,'text_price')\" readonly value=\"100\"><Button id=\"butt_edit\" onclick=\"editprice('text_price')\"><img id=\"edit_price_icon\" width=\"20px\" src=\"../images\\icons\\edit.png\"></button></td>\r\n");
      out.write("                <td><button id=\"butt_remove\"><img src=\"../images/icons/remove.png\"></button></td>\r\n");
      out.write("                <td><button id=\"visibility_button\" onclick=\"change_visibilty_status() \"><img  src=\"../images/icons/visible_false.png\" id=\"visibility_img\"></button>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"new_item_box\">\r\n");
      out.write("        <button id=\"new_item_button\" onclick=\"\" >Add Item</button>\r\n");
      out.write("        <table id=\"new_item_table\">\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>Name</td>\r\n");
      out.write("                <td>Quantity</td>\r\n");
      out.write("                <td>Price</td>\r\n");
      out.write("                <td>Image</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td><input type=\"text\" id=\"new_item_name\"></td>\r\n");
      out.write("                <td><input type=\"text\" id=\"new_item_quantity\"></td>\r\n");
      out.write("                <td><input type=\"text\" id=\"new_item_price\"></td>\r\n");
      out.write("                <td><input type=\"image\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </table>\r\n");
      out.write("        <button id=\"Update_stock\" onclick=\"\">Update</button>\r\n");
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
