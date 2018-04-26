package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/user/user_header.jsp");
    _jspx_dependants.add("/user/user_navbar.jsp");
    _jspx_dependants.add("/user/user_footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
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

      out.write("<!--\n");
      out.write("author: W3layouts\n");
      out.write("author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>FAQ</title>\n");
      out.write("        <!-- for-mobile-apps -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- //for-mobile-apps -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- font-awesome icons -->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /> \n");
      out.write("        <!-- //font-awesome icons -->\n");
      out.write("        <!-- js -->\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <!-- //js -->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("        <!-- start-smoth-scrolling -->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- start-smoth-scrolling -->\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <div class=\"agileits_header\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"user/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"w3l_offers\">\n");
      out.write("            <a href=\"products.jsp\">Products</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3l_search\">\n");
      out.write("            <form action=\"#\" method=\"post\">\n");
      out.write("                <input type=\"text\" name=\"Product\" value=\"Search a product...\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {\n");
      out.write("                                            this.value = 'Search a product...';\n");
      out.write("                                        }\" required=\"\">\n");
      out.write("                <input type=\"submit\" value=\" \">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"product_list_header\">  \n");
      out.write("            \n");
      out.write("            <button onclick=\"view_cart()\" style=\"background-color: transparent;border: none;height: 30px;padding-top: 7px;\">\n");
      out.write("                <div style=\"padding: 5px;border: 1px solid greenyellow;color: white; height: 35px;\">View Your cart <img src=\"images/cart.png\" alt=\"\"/></div></button>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3l_header_right\">\n");
      out.write("            <ul>\n");
      out.write("                <li class=\"dropdown profile_details_drop\">\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i><span class=\"caret\"></span></a>\n");
      out.write("                    <div class=\"mega-dropdown-menu\">\n");
      out.write("                        <div class=\"w3ls_vegetables\">\n");
      out.write("                            <ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("                                <li>");
 session = request.getSession();
      out.write("\n");
      out.write("                                    <a href=\"user_profile\">");
      out.print(session.getAttribute("user_name"));
      out.write("</a></li>\n");
      out.write("                                <li><a href=\"logout\">Logout</a></li> \n");
      out.write("                            </ul>\n");
      out.write("                        </div>                  \n");
      out.write("                    </div>\t\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3l_header_right1\">\n");
      out.write("            <h2><a href=\"mail.jsp\">Contact Us</a></h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"clearfix\"> </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- script-for sticky-nav -->\n");
      out.write("    <script>\n");
      out.write("    function view_cart()\n");
      out.write("    {\n");
      out.write("        $('#minicart').show();\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function hide_cart()\n");
      out.write("    {\n");
      out.write("        $('#minicart').hide();\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        $(document).ready(function () {\n");
      out.write("            var navoffeset = $(\".agileits_header\").offset().top;\n");
      out.write("            $(window).scroll(function () {\n");
      out.write("                var scrollpos = $(window).scrollTop();\n");
      out.write("                if (scrollpos >= navoffeset) {\n");
      out.write("                    $(\".agileits_header\").addClass(\"fixed\");\n");
      out.write("                } else {\n");
      out.write("                    $(\".agileits_header\").removeClass(\"fixed\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        function add_to_cart(sno)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"POST\",\n");
      out.write("                    url: \"add_item_cart\",\n");
      out.write("                    data: {sno: sno},\n");
      out.write("                    success: function (result)\n");
      out.write("                    {\n");
      out.write("                        alert(result);\n");
      out.write("                        if (result.trim() === 'success') {\n");
      out.write("                            document.location.reload();\n");
      out.write("                        } else {\n");
      out.write("                            alert(\"Sorry We were not able to process your request!\");\n");
      out.write("                            \n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        function checkout()\n");
      out.write("        {\n");
      out.write("            \n");
      out.write("\n");
      out.write("            document.location.href=\"/SquareOne/checkout\";\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("                \n");
      out.write("    </script>\n");
      out.write("    <!-- //script-for sticky-nav -->\n");
      out.write("    <div class=\"logo_products\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"w3ls_logo_products_left\">\n");
      out.write("                <h1><a href=\"products.jsp\">Square One</a></h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3ls_logo_products_left1\">\n");
      out.write("                <ul class=\"special_items\">\n");
      out.write("                    <li><a href=\"about\">About Us</a><i>/</i></li>\n");
      out.write("                    <li><a href=\"view_all\">Products</a><i>/</i></li>\n");
      out.write("                    <li><a href=\"myorders.jsp\">My Orders</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3ls_logo_products_left1\">\n");
      out.write("                <ul class=\"phone_email\">\n");
      out.write("                    <li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>123 456 7890</li>\n");
      out.write("                    <li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"mailto:store@grocery.com\">contact@square1.com</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("        </div>\n");
      out.write("        <div id='minicart'>\n");
      out.write("            <button type=\"button\" onclick=\"hide_cart()\" class=\"minicart-closer\">×</button>\n");
      out.write("            \n");
      out.write("                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        \n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- //header -->\n");
      out.write("        <!-- products-breadcrumb -->\n");
      out.write("        <div class=\"products-breadcrumb\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><i class=\"fa fa-home\" aria-hidden=\"true\"></i><a href=\"index.html\">Home</a><span>|</span></li>\n");
      out.write("                    <li>FAQ's</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //products-breadcrumb -->\n");
      out.write("        <!-- banner -->\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <div class=\"w3l_banner_nav_left\">\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Nav Bar</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!-- //for-mobile-apps -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /> \n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar nav_bottom\">\n");
      out.write("\t\t\t <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("\t\t\t  <div class=\"navbar-header nav_2\">\n");
      out.write("\t\t\t\t  <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span>\n");
      out.write("\t\t\t\t  </button>\n");
      out.write("\t\t\t   </div> \n");
      out.write("\t\t\t   <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("\t\t\t\t<div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav nav_1\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"view_all\">All</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"view_meal\">Meals</a></li>\n");
      out.write("                                                <li><a href=\"view_drinks\">Bevereges</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"view_snacks\">Snacks</a></li>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t </div><!-- /.navbar-collapse -->\n");
      out.write("\t\t\t</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3l_banner_nav_right\">\n");
      out.write("                <!-- faq -->\n");
      out.write("                <div class=\"faq\">\n");
      out.write("                    <h3>User Settings</h3>\n");
      out.write("                    <div class=\"panel-group w3l_panel_group_faq\" id=\"accordion\" role=\"tablist\" aria-multiselectable=\"true\">\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingOne\">\n");
      out.write("                                <h4 class=\"panel-title asd\">\n");
      out.write("                                    <a class=\"pa_italic\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseOne\" aria-expanded=\"true\" aria-controls=\"collapseOne\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span><i class=\"glyphicon glyphicon-minus\" aria-hidden=\"true\"></i>Show Details\n");
      out.write("                                    </a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseOne\" class=\"panel-collapse collapse in\" role=\"tabpanel\" aria-labelledby=\"headingOne\">\n");
      out.write("                                <div class=\"panel-body panel_text\">\n");
      out.write("                                    <center><table cellspacing=5px>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Name:  </td><td> name of the user</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>User Name:  </td><td> id of the user</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Email:  </td><td>user's Email</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>DOB:  </td><td>user's DOB</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Gender:  </td><td>user's Gender</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td>Mobile Number:  </td><td>user's Number</td>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </table></center>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingTwo\">\n");
      out.write("                                <h4 class=\"panel-title asd\">\n");
      out.write("                                    <a class=\"pa_italic collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseTwo\" aria-expanded=\"false\" aria-controls=\"collapseTwo\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span><i class=\"glyphicon glyphicon-minus\" aria-hidden=\"true\"></i>Change Password\n");
      out.write("                                    </a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseTwo\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingTwo\">\n");
      out.write("                                <div class=\"panel-body panel_text\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr><td><input style=\"padding:0;background-color:none;color:green;border:2px solid green;\" type=\"password\" placeholder=\"Current Password\"></td></tr>\n");
      out.write("                                        <tr><td><input style=\"padding:0;background-color:none;color:green;border:2px solid green;\"type=\"password\" placeholder=\"New-Password\"></td></tr>\n");
      out.write("                                        <tr><td><input style=\"padding:0;background-color:none;color:green;border:2px solid green;\"type=\"password\" placeholder=\"Retype New-Password\"></td></tr>\n");
      out.write("                                        <tr><td><button style=\"padding:0;background-color:green;color:white;border:2px solid green;height:auto;width:auto;\">Change Password</button></td></tr>\n");
      out.write("                                    </table>\t\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel panel-default\">\n");
      out.write("                            <div class=\"panel-heading\" role=\"tab\" id=\"headingThree\">\n");
      out.write("                                <h4 class=\"panel-title asd\">\n");
      out.write("                                    <a class=\"pa_italic collapsed\" role=\"button\" data-toggle=\"collapse\" data-parent=\"#accordion\" href=\"#collapseThree\" aria-expanded=\"false\" aria-controls=\"collapseThree\">\n");
      out.write("                                        <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span><i class=\"glyphicon glyphicon-minus\" aria-hidden=\"true\"></i>Change Details\n");
      out.write("                                    </a>\n");
      out.write("                                </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"panel-collapse collapse\" role=\"tabpanel\" aria-labelledby=\"headingThree\">\n");
      out.write("                                <div class=\"panel-body panel_text\">\n");
      out.write("                                    <table>\n");
      out.write("                                        <tr><td>\n");
      out.write("                                                <select style=\"height:33px;padding:0;background-color:none;color:green;border:2px solid green;\">\n");
      out.write("                                                    <option value=\"name\">Name</option>\n");
      out.write("                                                    <option value=\"email\">Email</option>\n");
      out.write("                                                    <option value=\"MOB\">Mobile Number</option>\n");
      out.write("                                                    <option value=\"gender\">Gender</option>\n");
      out.write("                                                    <option value=\"dob\">DOB</option>\n");
      out.write("                                                </select>\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <input style=\"padding:0;background-color:none;color:green;border:2px solid green;\" type=\"text\" placeholder=\"New Value\">\n");
      out.write("                                            </td>\n");
      out.write("                                            <td>\n");
      out.write("                                                <button style=\"padding:0;background-color:green;color:white;border:2px solid green;height:auto;width:auto;\">Change Value</button>\n");
      out.write("                                            </td></tr>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                <!-- //faq -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //banner -->\n");
      out.write("        <!-- footer -->\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Footer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("                <h3>information</h3>\n");
      out.write("                <ul class=\"w3_footer_grid_list\">\n");
      out.write("                    <li><a href=\"about\">About Us</a></li>\n");
      out.write("                    <li><a href=\"view_all\">Products</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("                <h3>policy info</h3>\n");
      out.write("                <ul class=\"w3_footer_grid_list\">\n");
      out.write("                    <li><a href=\"faqs\">FAQ</a></li>\n");
      out.write("                    <li><a href=\"privacy.jsp\">privacy policy</a></li>\n");
      out.write("                    <li><a href=\"privacy.jsp\">terms of use</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("                <h3>what in stores</h3>\n");
      out.write("                <ul class=\"w3_footer_grid_list\">\n");
      out.write("                    <li><a href=\"view_all\">Items</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-3 w3_footer_grid\">\n");
      out.write("                <h3>twitter posts</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"> </div>\n");
      out.write("            <div class=\"agile_footer_grids\">\n");
      out.write("                <div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\n");
      out.write("                    <div class=\"w3_footer_grid_bottom\">\n");
      out.write("                        <h4>100% secure payments</h4>\n");
      out.write("                        <img src=\"images/card.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\n");
      out.write("                    <div class=\"w3_footer_grid_bottom\">\n");
      out.write("                        <h5>connect with us</h5>\n");
      out.write("                        <ul class=\"agileits_social_icons\">\n");
      out.write("                            <li><a href=\"https://www.facebook.com/\" class=\"facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"https://twitter.com/login?lang=en\" class=\"twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"https://plus.google.com/discover\" class=\"google\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                            <li><a href=\"https://www.instagram.com/?hl=en\" class=\"instagram\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clearfix\"> </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- //footer -->\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".dropdown\").hover(\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).slideDown(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                        },\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).slideUp(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- here stars scrolling icon -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                /*\n");
      out.write("                 var defaults = {\n");
      out.write("                 containerID: 'toTop', // fading element id\n");
      out.write("                 containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                 scrollSpeed: 1200,\n");
      out.write("                 easingType: 'linear' \n");
      out.write("                 };\n");
      out.write("                 */\n");
      out.write("\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //here ends scrolling icon -->\n");
      out.write("        <script src=\"js/minicart.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            paypal.minicart.render();\n");
      out.write("\n");
      out.write("            paypal.minicart.cart.on('checkout', function (evt) {\n");
      out.write("                var items = this.items(),\n");
      out.write("                        len = items.length,\n");
      out.write("                        total = 0,\n");
      out.write("                        i;\n");
      out.write("\n");
      out.write("                // Count the number of each item in the cart\n");
      out.write("                for (i = 0; i < len; i++) {\n");
      out.write("                    total += items[i].get('quantity');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (total < 3) {\n");
      out.write("                    alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');\n");
      out.write("                    evt.preventDefault();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    \n");
        out.write("                    ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                    \n");
        out.write("                    \n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty cart}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <ul id=\"list\">\n");
        out.write("                        <li>\n");
        out.write("                            <div style=\"font-size: 22px;padding-bottom: 20px;text-align: center;\">Your Shopping Cart is Empty</div>\n");
        out.write("                        </li>\n");
        out.write("                        </ul>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <ul id=\"list\">\n");
        out.write("                        ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        </ul>\n");
        out.write("        <div id=\"cartfoot\" class=\"minicart-footer\">\n");
        out.write("            <div class=\"minicart-subtotal\">\n");
        out.write("                Total: &#8377; ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart[fn:length(cart)-1].bill}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("           \n");
        out.write("            </div>            \n");
        out.write("            <button class=\"minicart-submit label-primary\" onclick=\"checkout()\" type=\"button\" >Check Out</button>\n");
        out.write("        \n");
        out.write("        </div>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cart}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setVarStatus("status");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${! status.last}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                <li class=\"minicart-item minicart-item-changed\">\n");
        out.write("                <div class=\"mini minicart-details-name\">\n");
        out.write("                    <a class=\" minicart-name sfont\" href=\"\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.itemname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                \n");
        out.write("                </div>\n");
        out.write("                    \n");
        out.write("                    \n");
        out.write("                    <div class=\"mini minicart-details-quantity\">\n");
        out.write("                        <input readonly class=\"minicart-quantity sfont\" data-minicart-idx=\"0\" name=\"quantity_1\" type=\"text\" pattern=\"[0-9]*\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.itemquantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" autocomplete=\"off\">\n");
        out.write("                    </div>\n");
        out.write("                    <div class=\"mini minicart-details-remove\">\n");
        out.write("                        <button type=\"button\" class=\"minicart-remove sfont\" data-minicart-idx=\"0\">×</button> \n");
        out.write("                    </div>            \n");
        out.write("                    <div class=\"mini minicart-details-price\">\n");
        out.write("                        <span class=\"minicart-price sfont\">&#8377;");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.itemprice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>            \n");
        out.write("                    </div>\n");
        out.write("                </li>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
