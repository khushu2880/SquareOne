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
        <title>Transaction History</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/transaction_styles.css" rel="stylesheet" type="text/css"/>
        <link href="css/tablecontainer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp" %>
        </header>
        <div id="container" style="overflow-y: auto;">
            <table id="view_table" cellspacing="15">
                <thead id="view_table_head">
                    <tr id="view_table_headrow">
                        <th class="tr1 view_trans_table_headdata">Order ID</th>
                        <th class="tr1 view_trans_table_headdata"> Card Holder Name</th>
                        <th class="tr1 view_trans_table_headdata">Order Amount</th>
                        <th class="tr1 view_trans_table_headdata">Time</th>
                        <th class="tr1 view_trans_table_headdata">Date</th>
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
