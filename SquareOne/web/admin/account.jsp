<%-- 
    Document   : account.jsp
    Created on : 1 Apr, 2018, 3:20:55 PM
    Author     : mukul
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("admin.jsp");
    }
%>
        

<html>
    <head>
        <title>Account</title>
        <link href="css/manage_users_styles.css" rel="stylesheet" type="text/css"/>
        <link href="css/tablecontainer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
        <%
            String ID= session.getAttribute("user_name").toString();
            try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                //Step 2: Create the Connection
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");

                //Step 3: Make the Query
                PreparedStatement ps=con.prepareStatement("Select * from admin_data where ID=?");

                ps.setString(1,ID);
                ResultSet rs=ps.executeQuery();
                String f_name;
                String full_name;
                String gender;
                String emp_id;
                String number;
                String phnumber;
                String pic_name;
                String Birthdate;
                if(rs.next())
                {
                    f_name = rs.getString("f_name");
                    full_name = rs.getString("full_name");
                    gender = rs.getString("gender");
                    emp_id = rs.getString("emp_id");
                    number = rs.getString("number");
                    phnumber = rs.getString("number");
                    pic_name = rs.getString("pic");
                    Birthdate = rs.getString("dob");
        %>
        <div id="container">
            <div id="profile_head"><label><%=full_name%></label></div>
            <br>
            <div id="profile_left"></div>
            <div id="profile_right"></div>
            
        </div>
        <%

               }
            }
            catch(Exception ex)
            {
                out.print(ex);
            }
        %>
    </body>
</html>
