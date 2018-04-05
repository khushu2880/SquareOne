<%-- 
    Document   : Order Summary
    Created on : 14 Mar, 2018, 10:23:39 AM
    Author     : mukul
--%>

<%
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("..//admin.jsp");
    }
%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="../css/order_summary_styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <div id="bill_container">
            <div id="bill_head">
                <div id="main_square">Square One<br><Label id="bill_address">Chitkara University<br>Punjab</label></div>
                <div id="coffe_cont"><img id="bill_img" src="../images/bil_tq_logo.png" alt=""/></div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-xs-12">
                        <div class="text-center">
                            <i class="fa fa-search-plus pull-left icon"></i>
                            <h2>Invoice for purchase #33221</h2>
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-xs-12 col-md-3 col-lg-3 pull-left">
                                <div class="panel panel-default height">
                                    <div class="panel-heading">Billing Details</div>
                                    <div class="panel-body">
                                        <strong>David Peere:</strong><br>
                                        1111 Army Navy Drive<br>
                                        Arlington<br>
                                        VA<br>
                                        <strong>22 203</strong><br>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <h3 class="text-center"><strong>Order summary</strong></h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                <%
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
                                %>
                                        <table class="table table-condensed">
                                            <thead>
                                                <tr>
                                                    <td><strong>S No.</strong></td>
                                                    <td><strong>Item Name</strong></td>
                                                    <td class="text-center"><strong>Item Price</strong></td>
                                                    <td class="text-center"><strong>Item Quantity</strong></td>
                                                    <td class="text-right"><strong>Total</strong></td>
                                                </tr>
                                            </thead>
                                            <tbody>
                                <%
                                        for(String product_quant : productsarray)
                                        { 
                                            i++;
                                            String item[]=product_quant.split(":");
                                %>
                                                <tr>
                                                    <td><%=i%></td>
                                                    <td><%=item[name]%></td>
                                                    <td class="text-center"><%=item[item_price]%></td>
                                                    <td class="text-center"><%=item[quantity]%></td>
                                                    <td class="text-right"><%=(Integer.parseInt(item[item_price])*Integer.parseInt(item[quantity]))%></td>
                                                </tr>
                                <%    
                                        }
                                %>
                                                <tr>
                                                    <td class="highrow"></td>
                                                    <td class="highrow"></td>
                                                    <td class="highrow"></td>
                                                    <td class="highrow text-center"><strong>Total</strong></td>
                                                    <td class="highrow text-right"><%=bill_amount%></td>
                                                </tr>
                                             </tbody>
                                        </table>
                                <%
                                    }
                                    else
                                    {
                                        out.print("No Record Found");
                                    }
                                %>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>  
                
            
                    
        </div>
    </body>
</html>
