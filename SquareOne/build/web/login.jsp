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
<!-- start-smoth-scrolling -->
</head>
	
<body>
<!-- header -->
	<div class="agileits_header">
            <%@include file="user/user_header.jsp"%>
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
                                                <input type="text" class="form-control" name="username" placeholder="username" required aria-describedby="sizing-addon1">
                                                <input type="password" class="form-control" name="password" placeholder="password" required aria-describedby="sizing-addon1">
                                                <button onclick="submit" class="form-control" ><span class="label label-success">Login</span></button>
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
                                                    <td colspan="2"><input type="text" class="form-control" name="username" placeholder="username" required /></td>
                                                </tr>
                                                <tr>
                                                    <td><input type="password" class="form-control" name="password" placeholder="Password" required/></td>
                                                    <td><input type="password" class="form-control" name="cpassword" placeholder="Confirm Password" required/></td>
                                                </tr>
                                                <tr >
                                                    <td colspan="2"><!--<span class="input-group-addon" id="basic-addon1">Email</span>-->
                                                    <input type="email" class="form-control" name="email" placeholder="Email Address" /></td>
                                                </tr>
                                                <tr><td colspan="2"><input type="text" class="form-control" name="phone" placeholder="Phone Number" required/></td></tr>
                                                <tr ><td class="list-group-item form-control">Birth date:</td>
                                                    <td><input class="form-control" type="date" name="dob" /></td>
                                                </tr>
                                                <tr>
                                                    <td class="list-group-item form-control">Gender</td>
                                                    <td>
                                                        <select class="form-control" name="gender"><option>Not Specified</option><option>Male</option><option>Female</option></select>
                                                    </td>
                                                </tr>
                                                <tr><td colspan="2"><button onclick="submit" class="form-control" ><span class="label label-success">Register</span></button></td></tr>
                                                            
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