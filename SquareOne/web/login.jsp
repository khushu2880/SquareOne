<%-- 
    Document   : login
    Created on : 17 Apr, 2018, 10:08:27 PM
    Author     : mukul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>Sign In & Sign Up</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet" type="text/css" media="all" /> 
<!-- //font-awesome icons -->
<!-- js -->
<script src="js/jquery-1.11.1.min.js"></script>
<!-- //js -->
<link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
<!-- start-smoth-scrolling -->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<script type="text/javascript">
	jQuery(document).ready(function($) {
		$(".scroll").click(function(event){		
			event.preventDefault();
			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
		});
	});
        </script>
        <script>      
        
        
        function checkphone()
        {
            var phonereg = /^[0-9]{10}$/;
            var phone = document.getElementById("newphone").value;
            if(phonereg.test(phone))
            {
                document.getElementById("phonealertrow").style.display="none";
                $.ajax({
                        type: "POST",
                        url: "checkaccountavailability",
                        data: {"newphone":phone},
                        success: function (result)
                        {

                            alert(result);
                            if (result.trim() === 'success') {

                            } else {
                                //  Not able to change status";
                            }
                        }
                    });
            }
            else
            {
                document.getElementById("emailalertrow").style.display="";
            }
            
            
        }
        
        
        
        
        
        function checkusername()
        {
            var username = document.getElementById("newusername").value;
            if(username==="")
            {
                negativealert('#useralert');
                document.getElementById("stronguseralert").innerHTML="Oh Snap!";
                document.getElementById("usernamealert").innerHTML=" Choose a Username Please";
                document.getElementById("usernamealertrow").style.display="";
            }
            else{
                document.getElementById("usernamealertrow").style.display="none";
                $.ajax({
                        type: "POST",
                        url: "checkaccountavailability",
                        data: {"newusername":username},
                        success: function (result)
                        {
                            if (result.trim() === 'success') {
                                positivealert('#useralert');
                                document.getElementById("stronguseralert").innerHTML="Great! ";
                                document.getElementById("usernamealert").innerHTML=" Your username is kinda Unique!";
                                document.getElementById("usernamealertrow").style.display="";

                            } else {
                                negativealert('#useralert');
                                document.getElementById("usernamealert").innerHTML=" Username is already taken.";
                                document.getElementById("usernamealertrow").style.display="";
                            }
                        }
                    });
            }
        }
        
        function checkmatch(e)
            {
                
                var key = e.keyCode;
                if(key<=47 || key===91 || key===92 || key===93 || (key>=112 && key<=145))
                {
                    return 1;
                }
                
                var pass1 =document.getElementById("newpass").value;
                var pass2 =document.getElementById("newcpass").value;
                var index = pass1.indexOf(pass2);
                if(index===0){
                    
                    document.getElementById("passalertrow").style.display="none";
                }
                else{
                    negativealert('#passalert');
                    document.getElementById("strongpassalert").innerHTML="Oops! ";
                    document.getElementById("passwordalert").innerHTML=" Passwords Do not match";
                    document.getElementById("passalertrow").style.display="";
                    return 1;
                }
                
            }
        
        function finalpasscheck()
        {
            var pass1 =document.getElementById("newpass").value;
            var pass2 =document.getElementById("newcpass").value;
            if(pass1===pass2){
                    positivealert('#passalert');
                    document.getElementById("strongpassalert").innerHTML="Great! ";
                    document.getElementById("passwordalert").innerHTML=" Passwords Match!";
                    document.getElementById("passalertrow").style.display="";
                    return 0;
            }
        }
        
        
        function checkemail()
        {
            var emailreg = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$/;
            var email = document.getElementById("newemail").value;
            if(emailreg.test(email))
            {
                document.getElementById("emailalertrow").style.display="none";
                $.ajax({
                        type: "POST",
                        url: "checkaccountavailability",
                        data: {"newemail":email},
                        success: function (result)
                        {
                            if (result.trim() === 'success') { 
                            } else{
                                negativealert('#emailalert');
                                document.getElementById("strongemailalert").innerHTML="Oops! ";
                                document.getElementById("spanemailalert").innerHTML=" We already have account with this email";
                                document.getElementById("emailalertrow").style.display="";
                            }
                        }
                    });
            }
            else
            {
                negativealert("#emailalert");
                if( email===""){
                    document.getElementById("strongemailalert").innerHTML="Oh! Snap. ";
                    document.getElementById("spanemailalert").innerHTML=" Email can't be left blank";
                
                }
                else{
                    document.getElementById("strongemailalert").innerHTML="Oh! Snap. ";
                    document.getElementById("spanemailalert").innerHTML=" Enter a valid email address.";
                }
                document.getElementById("emailalertrow").style.display="";
            }
        }

        function checkphone()
        {
            var phonereg = /^[0-9]{10}$/;
            var phone = document.getElementById("newphone").value;
            if(phonereg.test(phone))
            {
                document.getElementById("phonealertrow").style.display="none";
                $.ajax({
                        type: "POST",
                        url: "checkaccountavailability",
                        data: {"newphone":phone},
                        success: function (result)
                        {

                            if (result.trim() === 'success') {
                            } else {
                                negativealert('#phonealert');
                                document.getElementById("strongphonealert").innerHTML="Shit! ";
                                document.getElementById("spanemailalert").innerHTML="This number is already linked to an account";
                                document.getElementById("emailalertrow").style.display="";
                            }
                        }
                    });
            }
            else
            {
                negativealert("#phonealert");
                if( email===""){
                    document.getElementById("strongphonealert").innerHTML="Oh! Your";
                    document.getElementById("spanephonealert").innerHTML="phone number is Important to us";
                
                }
                else{
                    document.getElementById("strongphonealert").innerHTML="Oh! NO. ";
                    document.getElementById("spanphonealert").innerHTML=" Enter a valid phone number.";
                }
                document.getElementById("phonealertrow").style.display="";
                
            }
            
            
        }
        
        function negativealert(alertid)
        {
            $(alertid).addClass('alert-danger').removeClass('alert-success');
        }
        
        function positivealert(alertid)
        {
            $(alertid).addClass('alert-success').removeClass('alert-danger');
        }
        
        
        
        
    
        
</script>
<!-- start-smoth-scrolling -->
</head>
	
<body>
<!-- header -->
	<div class="agileits_header">
            
	</div>
<!-- //header -->
<!-- products-breadcrumb -->
	<div class="products-breadcrumb">
		<div class="container">
			<ul>
				<li><i class="fa fa-home" aria-hidden="true"></i><a href="index.html">Home</a><span>|</span></li>
				<li>Sign In</li>
			</ul>
		</div>
	</div>
<!-- //products-breadcrumb -->
<!-- banner -->
	<div class="banner">
            <div class="w3l_banner_nav_left">
                <div style="margin-top:20px;margin-left: 20px;">
                    <img src="images/sq1.jpeg" alt="" style="left: 30px" height="400" width="700">
		</div>
                
            </div>
		<div class="w3l_banner_nav_right">
<!-- login -->
		<div class="w3_login">
			<h3>Sign In</h3>
			<div class="login_module">
				<div class="module form-module">
				    <div class="form signin">
                                        <h2>Login to your account</h2><br>
					<form action="user_login_verify" method="post">
                                            <div class="input-group input-group-lg" style="display: block">
                                                <input type="text" class="form-control" name="username" placeholder="Username" required aria-describedby="sizing-addon1">
                                                <input type="password" class="form-control" name="password" placeholder="Password" required aria-describedby="sizing-addon1">
                                                <button onclick="submit" class="form-control label label-success" ><h4 style="font-size:22px;" >Login</h4></button>
                                            </div>
                                            
                                          <div class="cta"><a href="#">Forgot your password?</a></div>
					</form>
                                    </div><br>
                                    <div class="toggle"><h4>Click here to Sign Up?</h4></div>
                                    <div class="form signup" style="display: none;">
                                        <h2>Create an account</h2><br>
					<form action="create_user" method="post">
                                            <table cellspacing="10px">
                                                <tr>
                                                    <td><input type="text" placeholder="First Name" class="form-control" name="fname"></td>
                                                    <td><input type="text" placeholder="Last Name" class="form-control" name="lname"></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="2"><input type="text" onblur="checkusername()" id="newusername" class="form-control" name="username" placeholder="Username" required /></td>
                                                </tr>
                                                <tr id="usernamealertrow" style="display: none">
                                                    <td colspan="2">
                                                        <div id="useralert" class="alert alert-danger" role="alert">
                                                            <strong id="stronguseralert" ></strong><span id="usernamealert"></span>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr>
                                                    <td><input type="password" id="newpass"  class="form-control" name="password" placeholder="Password" required/></td>
                                                    <td><input type="password" id="newcpass" onkeyup="checkmatch(event)" onblur="finalpasscheck()" class="form-control" name="cpassword" placeholder="Confirm Password" required/></td>
                                                </tr>
                                                <tr id="passalertrow" style="display:none;">
                                                    <td colspan="2">
                                                        <div id="passalert" class="alert alert-danger" role="alert">
                                                            <strong id="strongpassalert"></strong><span id="passwordalert"></span>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr >
                                                    <td colspan="2"><!--<span class="input-group-addon" id="basic-addon1">Email</span>-->
                                                        <input type="text" id="newemail" onblur="checkemail()" class="form-control" name="email" placeholder="Email Address" /></td>
                                                </tr>
                                                <tr id='emailalertrow' style="display: none;">
                                                    <td colspan="2">
                                                        <div id="emailalert" class="alert alert-danger" role="alert">
                                                            <strong id="strongemailalert">O</strong><span id='spanemailalert'></span>
                                                        </div>
                                                    </td>
                                                </tr>
                                                <tr><td colspan="2"><input type="text" id="newphone" onblur="checkphone()" class="form-control" name="phone" placeholder="Phone Number" required/></td></tr>
                                                <tr id="phonealertrow" style="display:none">
                                                    <td colspan="2">
                                                        <div id="phonealert" class="alert alert-danger" role="alert">
                                                            <strong id="strongphonealert"></strong><span id='spanphonealert'></span>
                                                        </div>
                                                </tr>
                                                <tr ><td class="list-group-item form-control">Birth date:</td>
                                                    <td><input class="form-control" type="date" name="dob" /></td>
                                                </tr>
                                                <tr>
                                                    <td class="list-group-item form-control">Gender</td>
                                                    <td>
                                                        <select class="form-control" name="gender"><option>Not Specified</option><option>Male</option><option>Female</option></select>
                                                    </td>
                                                </tr>
                                                <tr><td colspan="2"><button onclick="submit" class="form-control label label-success" ><h4><span class="label label-success">Register</span></h4></button></td></tr>
                                                            
                                            </table>
                                        </form>
                                    </div>
				</div>
			</div>
			<script>
				$('.toggle').click(function(){
				  // Switches the Icon
				  $(this).children('i').toggleClass('');
				  // Switches the forms  
				  $('.signup').animate({
					height: "toggle",
					'padding-top': 'toggle',
					'padding-bottom': 'toggle',
					opacity: "toggle"
				  }, "slow");
                                  $('.signin').animate({
					height: "toggle",
					'padding-top': 'toggle',
					'padding-bottom': 'toggle',
					opacity: "toggle"
				  }, "slow");
                                  $(this).animate({
					height: "toggle",
					'padding-top': 'toggle',
					'padding-bottom': 'toggle',
					opacity: "toggle"
				  }, "slow");
				});
			</script>
		</div>
<!-- //login -->
		</div>
		<div class="clearfix"></div>
	</div>
<!-- //banner -->
<!-- footer -->
	<div class="footer">
            <%@include file="user/user_footer.jsp"%>
        </div>
<!-- //footer -->
<!-- Bootstrap Core JavaScript -->
<script src="js/bootstrap.min.js"></script>
<script>
$(document).ready(function(){
    $(".dropdown").hover(            
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideDown("fast");
            $(this).toggleClass('open');        
        },
        function() {
            $('.dropdown-menu', this).stop( true, true ).slideUp("fast");
            $(this).toggleClass('open');       
        }
    );
});
</script>
<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			*/
								
			$().UItoTop({ easingType: 'easeOutQuart' });
								
			});
	</script>
<!-- //here ends scrolling icon -->
<script src="js/minicart.js"></script>
<script>
		paypal.minicart.render();

		paypal.minicart.cart.on('checkout', function (evt) {
			var items = this.items(),
				len = items.length,
				total = 0,
				i;

			// Count the number of each item in the cart
			for (i = 0; i < len; i++) {
				total += items[i].get('quantity');
			}

			if (total < 3) {
				alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
				evt.preventDefault();
			}
		});

	</script>
</body>
</html>