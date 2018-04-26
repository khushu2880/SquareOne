<%
    if (session.getAttribute("user_name") == null || session.getAttribute("user_name").equals("")) {
        response.sendRedirect("view_all");
    }
%>
<%@page import="java.sql.*"%>



<html>
    <head>
        <meta charset="utf-8">
        <title>Invoice</title>
        <link href="css/order_summary_styles.css" rel="stylesheet" type="text/css"/>

    </head>
    <%
        try {

            System.out.print("abc");
            String trans_id = session.getAttribute("trans_id").toString();
            
            Class.forName("com.mysql.jdbc.Driver");

            //Step 2: Create the Connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone", "root", "");
            //Step 3: Make the Query
            PreparedStatement ps = con.prepareStatement("Select * from transactions join user_data on transactions.card_id=user_data.card_id where order_id=?");
            ps.setString(1, trans_id);

            //Step5: Execute the query
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("fullname");
                String numb = rs.getString("mobnumber");
                String card_id = rs.getString("card_id");
                String date = rs.getString("date");
                String time = rs.getString("time");

                String bill_amount = rs.getString("amount");
                int i = 0, item_name_index = 0, price_index = 1, quantity_index = 2;
                String productsarray[] = (rs.getString("order_products")).split(";");
    %>

    <body>
        <header>
            <h1>Invoice</h1>

            <span><img alt="" src="images/bil_tq_logo.png"></span>
        </header>
        <article>
            <h1>Recipient</h1>
            <table class="meta">
                <tr>
                    <th><span>Invoice #</span></th>
                    <td><span><%=trans_id%></span></td>
                </tr>
                <tr>
                    <th><span>Date</span></th>
                    <td><span><%=date%></span></td>
                </tr>
                <tr>
                    <th><span >Time</span></th>
                    <td><span><%=time%></span></td>
                </tr>
            </table>
            <table class="inventory">
                <thead>
                    <tr>
                        <th style="width:40px;"><span >S No.</span></th>
                        <th><span >Item</span></th>
                        <th><span >Rate</span></th>
                        <th><span >Quantity</span></th>
                        <th><span >Price</span></th>
                    </tr>
                </thead>
                <tbody>
                <address>
                    <p><%=name%></p>
                    <p><%=card_id%></p>
                    <p>#address</p>
                    <p><%=numb%></p>
                </address>
                    <%
                        for (String product_quant : productsarray) {
                            i++;
                            String item[] = product_quant.split(":");
                    %>
                
                <tr>
                    <td><span><%=i%></span></td>
                    <td><span ><%=item[item_name_index]%></span></td>
                    <td><span data-prefix>&#8377;</span><span ><%=item[price_index]%></span></td>
                    <td><span ><%=item[quantity_index]%></span></td>
                    <td><span data-prefix>&#8377;</span><span><%=(Integer.parseInt(item[price_index]) * Integer.parseInt(item[quantity_index]))%></span></td>
                </tr>
                <%
                    }
                %>
                </tbody>
            </table>
            <table class="balance">
                <tr>
                    <th><span >Total</span></th>
                    <td><span data-prefix>&#8377;</span><span><%=bill_amount%></span></td>
                </tr>
                <tr>
                    <th><span >Amount Paid</span></th>
                    <td><span data-prefix>&#8377;</span><span ><%=bill_amount%></span></td>
                </tr>
            </table>
            <%
                    } else {
                        out.print("No Record Found");
                    }
                    con.close();
                } catch (Exception ex) {
                    System.out.println("ex" + ex);
                }
            %>
        </article>
        <aside>
            <h1><span >Additional Notes</span></h1>
        </aside>
    </body>
</html>
