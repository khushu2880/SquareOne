<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("admin.jsp");
    }
    
%>
<%@page import="java.sql.*"%>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/transaction_styles.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
                <%@include file="navbar.jsp" %>
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

                    <c:forEach items="${list}" var="data">
                        <tr>
                            <td><a href="admin/Order_Summary.jsp?trans_id=${data.Trans_id}"> ${data.Trans_id}</a></td>
                            <td><a href="account_detail"> ${data.Card_id}</a></td>
                            <td>${data.Amount}</td>
                            <td>${data.Time}</td>
                            <td>${data.Date}</td>
                        </tr>        
                    </c:forEach>



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
