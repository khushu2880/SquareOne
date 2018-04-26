<!DOCTYPE html>
<html>
    <head>
        <title>Description</title>
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
jQuery(document).ready(function ($) {
    $(".scroll").click(function (event) {
        event.preventDefault();
        $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
    });
});
        </script>
        <!-- start-smoth-scrolling -->
        <style>
		li
		{
			font-size:24px;
		}
		</style>
</head>

    <body>
        <!-- header -->
        <div class="agileits_header">
            <%@include file="user_header.jsp"%>
        </div>
        <!-- //header -->
        <!-- products-breadcrumb -->
        <div class="products-breadcrumb">
            <div class="container">
                <ul>
                    <li><i class="fa fa-home" aria-hidden="true"></i><a href="index.html">Home</a><span>|</span></li>
                    <li>${detail.Item_name}</li>
                </ul>
            </div>
        </div>
        <!-- //products-breadcrumb -->
        <!-- banner -->
        <div class="banner">
            <div class="w3l_banner_nav_left">
                <%@include file="user_navbar.jsp" %>
            </div>
            <div class="w3l_banner_nav_right">
                <!-- faq -->
                <div class="faq">
                    <h3 align="center">${detail.Item_name}</h3>
                    <div class="view view-tenth">
						<img src="${detail.Item_image}"/>
						<div class="mask">
                                                    <div style="margin-top: 100px;"><h2>Available</h2></div>
                                                    <div style="margin-top: 30px;"><h2>&#8377; ${detail.Item_price}</h2></div>
                                                    <div onclick="add_to_cart(${detail.sno})" style="margin-top: 30px;"><h2>Add to Cart</h2></div>
							
						</div>
					</div>
                    </div>
                    <div>
                        
                        <h1 align="center">DESCRIPTION</h1></br>
                    ${detail.Item_desc}


                    </div>
                    </div>
</body>
</html>