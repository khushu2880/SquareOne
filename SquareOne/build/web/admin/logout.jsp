<%-- 
    Document   : logout
    Created on : 28 Mar, 2018, 9:36:49 PM
    Author     : mukul
--%>

<%
if (session != null)
    session.invalidate();
response.sendRedirect("../admin.jsp");
%>

