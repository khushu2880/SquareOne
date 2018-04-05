<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("..//admin.jsp");
    }
    
%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="transaction_styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div>
            <table id="transaction_table">
                <thead>
                    <tr>
                        <th>Order ID</th>
                        <th>Card Holder Name</th>
                        <th>Order Amount</th>
                        <th>Time</th>
                        <th>Date</th>
                    </tr>
                </thead>
                <tbody>
                    <%
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
                                
                                
                    %>
                    <tr>
                        
                        <td><a href="Order_Summary.jsp?trans_id=<%=trans_id%>"><%=trans_id%></a></td>
                        <td><a href="account_detail"><%=card_id%></a></td>
                        <td><%=amount%></td>
                        <td><%=time%></td>
                        <td><%=date%></td>
                    </tr>
                    <%
                            }
                            con.close();
                    
                        }
                        catch(Exception ex)
                        {
                            out.println("Exception on ViewAll Record = "+ex);
                        }

                    %>
                
            </tbody>
                <tfoot>
                    <td colspan="6"><label>Page:</label><a href="###self###">1</a>
                        <a href="###last###">2</a>
                        <label style="margin-left: 20px;">Jump to:</label><input id="jump_page_no" type="text"></td>
                </tfoot>
            </table>
        </div>
    </body>
</html>
