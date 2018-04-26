<%-- 
    Document   : user_header
    Created on : 17 Apr, 2018, 10:01:59 PM
    Author     : mukul
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("login.jsp");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="user/css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <div class="w3l_offers">
            <a href="products.jsp">Products</a>
        </div>
        <div class="w3l_search">
            <form action="#" method="post">
                <input type="text" name="Product" value="Search a product..." onfocus="this.value = '';" onblur="if (this.value == '') {
                                            this.value = 'Search a product...';
                                        }" required="">
                <input type="submit" value=" ">
            </form>
        </div>
        <div class="product_list_header">  
            
            <button onclick="view_cart()" style="background-color: transparent;border: none;height: 30px;padding-top: 7px;">
                <div style="padding: 5px;border: 1px solid greenyellow;color: white; height: 35px;">View Your cart <img src="images/cart.png" alt=""/></div></button>
            
            
        </div>
        <div class="w3l_header_right">
            <ul>
                <li class="dropdown profile_details_drop">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user" aria-hidden="true"></i><span class="caret"></span></a>
                    <div class="mega-dropdown-menu">
                        <div class="w3ls_vegetables">
                            <ul class="dropdown-menu drp-mnu">
                                <li><% session = request.getSession();%>
                                    <a href="user_profile"><%=session.getAttribute("user_name")%></a></li>
                                <li><a href="user_logout">Logout</a></li> 
                            </ul>
                        </div>                  
                    </div>	
                </li>
            </ul>
        </div>
        <div class="w3l_header_right1">
            <h2><a href="mail.jsp">Contact Us</a></h2>
        </div>
        <div class="clearfix"> </div>
    </div>
    <!-- script-for sticky-nav -->
    <script>
    function view_cart()
    {
        $('#minicart').show();
    }
    
    function hide_cart()
    {
        $('#minicart').hide();
    }
    
    
    
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
        
        function add_to_cart(sno)
            {


                $.ajax({
                    type: "POST",
                    url: "add_item_cart",
                    data: {sno: sno},
                    success: function (result)
                    {
                        alert(result);
                        if (result.trim() === 'success') {
                            document.location.reload();
                        } else {
                            alert("Sorry We were not able to process your request!");
                            
                        }
                    }
                });

            }
        function checkout()
        {
            

            document.location.href="/SquareOne/checkout";


        }
                
    </script>
    <!-- //script-for sticky-nav -->
    <div class="logo_products">
        <div class="container">
            <div class="w3ls_logo_products_left">
                <h1><a href="products.jsp">Square One</a></h1>
            </div>
            <div class="w3ls_logo_products_left1">
                <ul class="special_items">
                    <li><a href="about">About Us</a><i>/</i></li>
                    <li><a href="view_all">Products</a><i>/</i></li>
                    <li><a href="myorders.jsp">My Orders</a></li>
                </ul>
            </div>
            <div class="w3ls_logo_products_left1">
                <ul class="phone_email">
                    <li><i class="fa fa-phone" aria-hidden="true"></i>123 456 7890</li>
                    <li><i class="fa fa-envelope-o" aria-hidden="true"></i><a href="mailto:store@grocery.com">contact@square1.com</a></li>
                </ul>
            </div>
            <div class="clearfix"> </div>
        </div>
        <div id='minicart'>
            <button type="button" onclick="hide_cart()" class="minicart-closer">×</button>
            
                <c:choose>
                    <c:when test="${empty cart}">
                        <ul id="list">
                        <li>
                            <div style="font-size: 22px;padding-bottom: 20px;text-align: center;">Your Shopping Cart is Empty</div>
                        </li>
                        </ul>
                    </c:when>
                    
                    <c:otherwise>
                        <ul id="list">
                        <c:forEach items="${cart}" var="item" varStatus="status">
                <c:if test="${! status.last}">
                <li class="minicart-item minicart-item-changed">
                <div class="mini minicart-details-name">
                    <a class=" minicart-name sfont" href="itemdetail?itemsno=${item.itemsno}">${item.itemname}</a>
                
                </div>
                    
                    
                    <div class="mini minicart-details-quantity">
                        <input readonly class="minicart-quantity sfont" data-minicart-idx="0" name="quantity_1" type="text" pattern="[0-9]*" value="${item.itemquantity}" autocomplete="off">
                    </div>
                    <div class="mini minicart-details-remove">
                        <button type="button" class="minicart-remove sfont" data-minicart-idx="0">×</button> 
                    </div>            
                    <div class="mini minicart-details-price">
                        <span class="minicart-price sfont">&#8377;${item.itemprice}</span>            
                    </div>
                </li>
                </c:if>
            </c:forEach>
                        </ul>
        <div id="cartfoot" class="minicart-footer">
            <div class="minicart-subtotal">
                Total: &#8377; ${cart[fn:length(cart)-1].bill}           
            </div>            
            <button class="minicart-submit label-primary" onclick="checkout()" type="button" >Check Out</button>
        
        </div>
                    </c:otherwise>
                    
                    
                </c:choose>
            
            
        
</div>
</div>
</body>
</html>
