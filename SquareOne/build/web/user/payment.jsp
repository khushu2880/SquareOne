<%-- 
    Document   : payment
    Created on : 17 Apr, 2018, 9:51:16 PM
    Author     : mukul
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html>
    <head>
        <title>Payment</title>
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

        <link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>

    </head>

    <body>
        <script>
            
            
            function alertlowbalance()
            {
                $("#balance_amt").addClass("alert alert-danger");
                var alert = "    Your Balance is low.. Add Money to continue";
                document.getElementById("balance_amt").innerHTML+= alert;
            }
        </script>
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
                    <li>Payment</li>
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
                <!-- payment -->
                <div class="privacy about">
                    <h3>Pay<span>ment</span></h3>

                    <div class="checkout-right">
                        <!--Horizontal Tab-->
                        <div id="parentHorizontalTab">
                            <ul class="resp-tabs-list hor_1">
                                <li>Pay from Wallet</li>
                                <li>Cash on counter (COC)</li>
                                <li>Credit/Debit</li>
                                <li>Netbanking</li>
                                
                            </ul>
                            <div class="resp-tabs-container hor_1">
                                <div>
                                <div class="vertical_post" style="height: 150px;">
                                    <table>
                                        <tr >
                                        <td class="payment_td"><h4>Wallet Balance</h4></td>
                                        <td id="balance_amt" class="payment_td" ><h4>&#8377;  ${balance}</h4></td>
                                        <td class="payment_td"><h1><button id="addmoneybutt" class="payment_button label label-primary"><h1>Add Money</h1></button></h1></td>
                                    </tr>
                                        
                                    <tr>
                                        <td class="payment_td" ><h4>Amount to Pay</h4></td>
                                        <td class="payment_td" ><h4>&#8377;  ${billamt}</h4></td>
                                        <td class="payment_td"><button id="paymoneybutt" onclick="payviawallet()" class="payment_button label label-success" ><h1>Pay</h1></button></td>
                                    </tr>
                                    </table>
                                </div>
                                </div>
                                <div>
                                    <div class="vertical_post ">
                                        <label class="anim">
                                            <h3>Pay at Counter: &nbsp; &#8377;  ${billamt}</h3>
                                                    <button style="background-color: rgb(105, 167, 78);height: 50px;border-radius: 5px;width: 200px;">Place Order</button>
                                                </label>
                                    </div>
                                </div>
                                <div>
                                    <form action="#" method="post" class="creditly-card-form agileinfo_form">
                                        <section class="creditly-wrapper wthree, w3_agileits_wrapper">
                                            <div class="credit-card-wrapper">
                                                <div class="first-row form-group">
                                                    <div class="controls">
                                                        <label class="control-label">Name on Card</label>
                                                        <input class="billing-address-name form-control" style="text-transform: uppercase" type="text" name="name" placeholder="NAME NAME">
                                                    </div>
                                                    <div class="w3_agileits_card_number_grids">
                                                        <div class="w3_agileits_card_number_grid_left">
                                                            <div class="controls">
                                                                <label class="control-label">Card Number</label>
                                                                <input class="number credit-card-number form-control" type="text" name="number"
                                                                       inputmode="numeric" autocomplete="cc-number" autocompletetype="cc-number" x-autocompletetype="cc-number"
                                                                       placeholder="&#149;&#149;&#149;&#149; &#149;&#149;&#149;&#149; &#149;&#149;&#149;&#149; &#149;&#149;&#149;&#149;">
                                                            </div>
                                                        </div>
                                                        <div class="w3_agileits_card_number_grid_right">
                                                            <div class="controls">
                                                                <label class="control-label">CVV</label>
                                                                <input class="security-code form-control"Â·
                                                                       inputmode="numeric"
                                                                       type="text" name="security-code"
                                                                       placeholder="&#149;&#149;&#149;">
                                                            </div>
                                                        </div>
                                                        <div class="clear"> </div>
                                                    </div>
                                                    <div class="controls">
                                                        <label class="control-label">Expiration Date</label>
                                                        <input class="expiration-month-and-year form-control" type="text" name="expiration-month-and-year" placeholder="MM / YY">
                                                    </div>
                                                </div>
                                                <button class="submit"><span>Make a payment </span></button>
                                            </div>
                                        </section>
                                    </form>

                                </div>
                                <div>
                                    <div class="vertical_post">
                                        <form action="#" method="post">
                                            <h5>Select From Popular Banks</h5>
                                            <div class="swit-radio">								
                                                <div class="check_box_one"> <div class="radio_one"> <label><input type="radio" name="radio" checked=""><i></i>Syndicate Bank</label> </div></div>
                                                <div class="check_box_one"> <div class="radio_one"> <label><input type="radio" name="radio"><i></i>Bank of Baroda</label> </div></div>
                                                <div class="check_box_one"> <div class="radio_one"> <label><input type="radio" name="radio"><i></i>Canara Bank</label> </div></div>	
                                                <div class="check_box_one"> <div class="radio_one"> <label><input type="radio" name="radio"><i></i>ICICI Bank</label> </div></div>	
                                                <div class="check_box_one"> <div class="radio_one"> <label><input type="radio" name="radio"><i></i>State Bank Of India</label> </div></div>		
                                                <div class="clearfix"></div>
                                            </div>
                                            <h5>Or SELECT OTHER BANK</h5>
                                            <div class="section_room_pay">
                                                <select class="year"><option value="">=== Other Banks ===</option><option value="ALB-NA">Allahabad Bank NetBanking</option><option value="ADB-NA">Andhra Bank</option><option value="BBK-NA">Bank of Bahrain and Kuwait NetBanking</option><option value="BBC-NA">Bank of Baroda Corporate NetBanking</option><option value="BBR-NA">Bank of Baroda Retail NetBanking</option><option value="BOI-NA">Bank of India NetBanking</option><option value="BOM-NA">Bank of Maharashtra NetBanking</option><option value="CSB-NA">Catholic Syrian Bank NetBanking</option><option value="CBI-NA">Central Bank of India</option><option value="CUB-NA">City Union Bank NetBanking</option><option value="CRP-NA">Corporation Bank</option><option value="DBK-NA">Deutsche Bank NetBanking</option><option value="DCB-NA">Development Credit Bank</option><option value="DC2-NA">Development Credit Bank - Corporate</option><option value="DLB-NA">Dhanlaxmi Bank NetBanking</option><option value="FBK-NA">Federal Bank NetBanking</option><option value="IDS-NA">Indusind Bank NetBanking</option><option value="IOB-NA">Indian Overseas Bank</option><option value="ING-NA">ING Vysya Bank (now Kotak)</option><option value="JKB-NA">Jammu and Kashmir NetBanking</option><option value="JSB-NA">Janata Sahakari Bank Limited</option><option value="KBL-NA">Karnataka Bank NetBanking</option><option value="KVB-NA">Karur Vysya Bank NetBanking</option><option value="LVR-NA">Lakshmi Vilas Bank NetBanking</option><option value="OBC-NA">Oriental Bank of Commerce NetBanking</option><option value="CPN-NA">PNB Corporate NetBanking</option><option value="PNB-NA">PNB NetBanking</option><option value="RSD-DIRECT">Rajasthan State Co-operative Bank-Debit Card</option><option value="RBS-NA">RBS (The Royal Bank of Scotland)</option><option value="SWB-NA">Saraswat Bank NetBanking</option><option value="SBJ-NA">SB Bikaner and Jaipur NetBanking</option><option value="SBH-NA">SB Hyderabad NetBanking</option><option value="SBM-NA">SB Mysore NetBanking</option><option value="SBT-NA">SB Travancore NetBanking</option><option value="SVC-NA">Shamrao Vitthal Co-operative Bank</option><option value="SIB-NA">South Indian Bank NetBanking</option><option value="SBP-NA">State Bank of Patiala NetBanking</option><option value="SYD-NA">Syndicate Bank NetBanking</option><option value="TNC-NA">Tamil Nadu State Co-operative Bank NetBanking</option><option value="UCO-NA">UCO Bank NetBanking</option><option value="UBI-NA">Union Bank NetBanking</option><option value="UNI-NA">United Bank of India NetBanking</option><option value="VJB-NA">Vijaya Bank NetBanking</option></select>
                                            </div>
                                            <input type="submit" value="PAY NOW">
                                        </form>
                                    </div>
                                </div>
                                <div>
                                    <div id="tab4" class="tab-grid" style="display: block;">
                                        <div class="row">

                                        </div>

                                    </div>
                                </div>

                            </div>
                        </div>

                        <!--Plug-in Initialisation-->

                        <!-- // Pay -->

                    </div>

                </div>
                <!-- //payment -->
            </div>
            <div class="clearfix"></div>
        </div>
        <!-- //banner -->


        <!-- footer -->
        <div class="footer">
            <%@include file="user_footer.jsp"%>
        </div>
        <!-- //footer -->
        <!-- js -->
        <script src="js/jquery-1.11.1.min.js"></script>
        <!-- easy-responsive-tabs -->    
        <link rel="stylesheet" type="text/css" href="css/easy-responsive-tabs.css " />
        <script src="js/easyResponsiveTabs.js"></script>
        <!-- //easy-responsive-tabs --> 
        <script type="text/javascript">
$(document).ready(function () {
    //Horizontal Tab
    $('#parentHorizontalTab').easyResponsiveTabs({
        type: 'default', //Types: default, vertical, accordion
        width: 'auto', //auto or any width like 600px
        fit: true, // 100% fit in a container
        tabidentify: 'hor_1', // The tab groups identifier
        activate: function (event) { // Callback function if tab is switched
            var $tab = $(this);
            var $info = $('#nested-tabInfo');
            var $name = $('span', $info);
            $name.text($tab.text());
            $info.show();
        }
    });
});
        </script>
        <!-- credit-card -->
        <script type="text/javascript" src="js/creditly.js"></script>
        <link rel="stylesheet" href="css/creditly.css" type="text/css" media="all" />

        <script type="text/javascript">
$(function () {
    var creditly = Creditly.initialize(
            '.creditly-wrapper .expiration-month-and-year',
            '.creditly-wrapper .credit-card-number',
            '.creditly-wrapper .security-code',
            '.creditly-wrapper .card-type');

    $(".creditly-card-form .submit").click(function (e) {
        e.preventDefault();
        var output = creditly.validate();
        if (output) {
            // Your validated credit card output
            console.log(output);
        }
    });
});
        </script>
        <!-- //credit-card -->

        <!-- //js -->
        <!-- script-for sticky-nav -->
        <script>
            $(document).ready(function () {
                var navoffeset = $(".agileits_header").offset().top;
                $(window).scroll(function () {
                    var scrollpos = $(window).scrollTop();
                    if (scrollpos >= navoffeset) {
                        $(".agileits_header").addClass("fixed");
                    } else {
                        $(".agileits_header").removeClass("fixed");
                    }
                });

            });
        </script>
        <!-- //script-for sticky-nav -->
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
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".dropdown").hover(
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                            $(this).toggleClass('open');
                        },
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                            $(this).toggleClass('open');
                        }
                );
            });
        </script>
        
        <script>
            if(${balance}<${billamt})
            {
                $( "#paymoneybutt" ).removeClass( "label-success" ).addClass( "label-warning" );
                $( "#paymoneybutt" ).attr("onclick","alertlowbalance()");
            }
        </script>
        
        
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */

                $().UItoTop({easingType: 'easeOutQuart'});

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
        
        <script>
            function payviawallet()
            {
                document.location.href="/SquareOne/order_from_wallet?billamt=${billamt}";
            }
        </script>
        
        
    </body>
</html>