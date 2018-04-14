<%-- 
    Document   : manage_users
    Created on : 26 Mar, 2018, 1:16:37 PM
    Author     : mukul
--%>
<%

    if (session.getAttribute("user_name") == null || session.getAttribute("user_name").equals("")) {
        response.sendRedirect("admin.jsp");
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
        <title>JSP Page</title>

    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <table>
            <thead>
            <th>S No.</th>
            <th>Username</th>
            <th>Name</th>
            <th>Employee ID</th>
            <th>Last Login</th>
            <th>Active</th>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="data">
                <tr>
                    <td>${data.Tabelrow}</td>
                    <td>${data.Username}</td>
                    <td>${data.Name}</td>
                    <td>${data.Emp_id}</td>
                    <td>${data.Lastlogin}</td>
                    <td>Active</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
