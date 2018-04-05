<%-- 
    Document   : manage_users
    Created on : 26 Mar, 2018, 1:16:37 PM
    Author     : mukul
--%>
<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("..//admin.jsp");
    }
    //System.out.print(session.getAttribute("user_name"));
    
%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
            <%
            
                try 
                {
         
            
                    Class.forName("com.mysql.jdbc.Driver");
           
                    //Step 2: Create the Connection
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");
           
                    //Step 3: Make the Query
                    PreparedStatement ps=con.prepareStatement("Select * from admin_accounts join admin_data on admin_data.ID=admin_accounts.ID");
                    //Step5: Execute the query
                    ResultSet rs=ps.executeQuery();
                       int tabelrow=1; 
                    while(rs.next())
                    {
                        
                        String sno = rs.getString("sno");
                        String username = rs.getString("ID");
                        if(username.equals(session.getAttribute("user_name").toString()))
                            continue;
                        
                        
                        String active = rs.getString("active");
                        String lastlogin = rs.getString("lastlogin");
                        String emp_id = rs.getString("emp_id");
                        String name = rs.getString("full_name");
            %>
                <tr>
                    <td><%=tabelrow++%></td>
                    <td><%=username%></td>
                    <td><%=name%></td>
                    <td><%=emp_id%></td>
                    <td><%=lastlogin%></td>
                    <td>Active</td>
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
        </table>
    </body>
</html>
