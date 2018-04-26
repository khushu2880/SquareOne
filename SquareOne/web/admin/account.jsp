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
        <link href="css/adminprofile_styles.css" rel="stylesheet" type="text/css"/>
        <script src="admin/js/script_1.9.js" type="text/javascript"></script>
    </head>
    <body>
        <script>
            function checkmatch(e)
            {
                var key = e.keyCode;
                if(key<=47 || key===91 || key===92 || key===93 || (key>=112 && key<=145))
                {
                    return 1;
                }
                
                
                var pass1 =document.getElementById("new_pass").value;
                var pass2 =document.getElementById("confirm_new_pass").value;
                var index = pass1.indexOf(pass2);
                if(index!==0)
                    alert("password do not match");
                    return 0;
                
            }
            function send()
            {
                var pass1 =document.getElementById("new_pass").value;
                var pass2 =document.getElementById("confirm_new_pass").value;
                if(pass1===pass2)
                {
                    $.ajax({
                        type: "POST",
                        url: "admin_change_pass",
                        data: {newpassword: pass1},
                        success: function (result)
                        {

                            alert(result);
                            if (result.trim() === 'success') {

                            } else {
                                
                            }
                        }
                    });
                }
            }
        </script>
        <header><%@include file="navbar.jsp" %></header>
        
        <div id="profile">
            <div id="profilehead">Account Details</div>  
            <div id="profilebody">
                <div id="profile_left">
                    <div id="fullname">${details.full_name}</div>
                    <div><image src="profile.pic" onerror="this.src='images/default_admin.jpg'" height="250" width="250" /></div>
                    <div id="profile_left_details">
                        <div class="det"><label>Member Since: </label><span>2018/02/16</span></div>
                        <div class="det"><label>Employee ID : </label><span>${details.emp_id}</span></div>
                    </div>
                </div>
                <div id="profile_right">
                    <div id="changepassdiv">
                        <fieldset>
                            <legend>Change Password</legend>
                            <div class="pass"><input type="password" id="new_pass" placeholder="New Password" required=""></div>
                            <div class="pass" style="padding-left: 50px"><input type="password" required="" id="confirm_new_pass" onkeyup="checkmatch(event)" placeholder="Re-enter your password"></div>
                            <div class="pass" onclick="send()"><button>Change</button></div>
                        </fieldset>
                    </div>
                    <div id="aboutdiv">
                        <fieldset>
                            <legend>About</legend>
                            <div class="abouttable" style="margin-right: 60px;" >
                                <table>
                                    <tr>
                                        <th>First Name:</th>
                                        <td>${details.f_name}</td>
                                    </tr>
                                    <tr>
                                        <th>User Name:</th>
                                        <td>${details.username}</td>
                                    </tr>
                                    <tr>
                                        <th>Gender:</th>
                                        <td>${details.gender}</td>
                                    </tr>
                                    <tr>
                                        <th>Phone Number:</th>
                                        <td>${details.phnumber}</td>
                                    </tr>
                                </table>
                            </div>
                            <div>
                                <table class="abouttable">
                                    <tr>
                                    <th>Last Name:</th>
                                        <td>${details.l_name}</td>
                                    </tr>
                                    <tr><th>Email:</th>
                                        <td>${details.id}</td>
                                    </tr>
                                    <tr>
                                        <th>Employee ID:</th>
                                        <td>${details.emp_id}</td>
                                    </tr>
                                    <tr>
                                        <th>Birth Date:</th>
                                        <td>${details.birthdate}</td>
                                    </tr>
                                </table>
                            </div>
                        </fieldset>
                    </div>
                </div>
            </div>
            
            
        </div>
               
    </body>
</html>
