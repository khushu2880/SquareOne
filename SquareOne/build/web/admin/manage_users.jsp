<%-- 
    Document   : manage_users
    Created on : 26 Mar, 2018, 1:16:37 PM
    Author     : mukul
--%>
<%

    if (session.getAttribute("user_name") == null || session.getAttribute("user_name").equals("")) {
        response.sendRedirect("../admin.jsp");
    }
    //System.out.print(session.getAttribute("user_name"));

%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manage Users</title>
        <link href="css/manage_users_styles.css" rel="stylesheet" type="text/css"/>
        <link href="css/tablecontainer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp" %>
        </header>
        <div id="container">
            <table id="view_table" cellspacing="15">
                <thead id="view_table_head">
                    <tr id="view_table_headrow">
                        <th class="view_user_table_headdata">S No.</th>
                        <th class="view_user_table_headdata">Username</th>
                        <th class="view_user_table_headdata">Name</th>
                        <th class="view_user_table_headdata">Employee ID</th>
                        <th class="view_user_table_headdata">Last Login</th>
                        <th class="view_user_table_headdata">Active</th>
                    </tr>
                </thead>
                <tbody id="view_table_body">
                    <c:forEach items="${list}" var="data">
                        <tr class="tablerow">
                            <td class="view_table_bodydata">${data.Table_row}</td>
                            <td class="view_table_bodydata">${data.Username}</td>
                            <td class="view_table_bodydata">${data.Name}</td>
                            <td class="view_table_bodydata">${data.Emp_id}</td>
                            <td class="view_table_bodydata">${data.Lastlogin}</td>
                            <td>Active</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    <div id="new_item_box">
        <Label id="new_item_label">New Item</Label>
        <form action="../add_new_item" method="post">
            <table id="new_item_table">
                <tr>
                    <td>Name</td>
                    <td>Quantity</td>
                    <td>Price</td>
                    <td>Image</td>
                </tr>
                <tr>
                    <td><input type="text" id="new_item_name" name="new_item"></td>
                    <td><input type="text" id="new_item_quantity" name="new_item_quantity" ></td>
                    <td><input type="text" id="new_item_price" name="new_item_price"></td>
                    <td><input type="file"></td>
                        
                </tr>
                <tr>
                    <td colspan="1"><span id="add_desc" onclick="add_desc()">Add Description</span></td>
                    <td colspan="2"><textarea id="desc_area" style="display: none" value="NULL" ></textarea></td>
                </tr>
                <tr>
                    <td colspan="4"><input type="submit" id="new_item_butt" value="Create"></td>
                </tr>
            </table>
            
        </form>
        
    </div>
    </body>
</html>
