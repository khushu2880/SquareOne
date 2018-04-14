<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("admin.jsp");
    }
    
%>
<%@page import="java.sql.*"%>





<html>
<head>
    <title>Stock</title>
    <link rel="stylesheet" href="css/stock_styles.css" type="text/css">
    <script src="admin/js/script_1.9.js" type="text/javascript"></script>
</head>
<body>
    <header>
        <script>
            
        function AddFunc(sno)
        {
        document.getElementById('butt_add'+sno).style.display = 'none';
        document.getElementById('text_add'+sno).style.display = 'flex';
        }
        
        function updateitem()
        {
            
        }
    
        function editprice(sno)
        {
            document.getElementById('text_price'+sno).removeAttribute('readonly');
        }
        function add_to_qty(e,sno)
        {
            if(e.keyCode===13)
            {
                var avail= parseInt(document.getElementById('item_quantity'+sno).innerHTML);
                avail += parseInt(document.getElementById('text_add'+sno).value);
                document.getElementById('item_quantity'+sno).innerHTML=avail;
                
                $.ajax({
                    type: "POST",
                    url: "update_itemquantity",
                    data: {sno: sno,qty: avail},
                    success: function (result)
                    {
                        
                        alert(result);
                        if (result.trim() === 'success') {
                           
                        } else {
                          //  Not able to change status";
                        }
                    }
                });
                                               
                document.getElementById('text_add'+sno).value='';
                document.getElementById('butt_add'+sno).style.display = 'flex';    
                document.getElementById('text_add'+sno).style.display = 'none';
            }
        }
        function update_price(e,sno)
        {
            if(e.keyCode===13)
            {
                var new_price =document.getElementById('text_price'+sno).value;
                document.getElementById('text_price'+sno).placeholder = new_price;
                
                
                $.ajax({
                    type: "POST",
                    url: "update_itemprice",
                    data: {sno: sno,price: new_price},
                    success: function (result)
                    {
                        
                        alert(result);
                        if (result.trim() === 'success') {
                           
                        } else {
                          //  Not able to change status";
                        }
                    }
                });
                
                document.getElementById('text_price'+sno).value='';
                document.getElementById('text_price'+sno).readOnly= true;
            }
            
        }
        function change_visibilty_status(sno , status)
        {
            
            
        $.ajax({
            type: "POST",
            url: "update_itemstatus",
            data: {sno: sno,status: status},
            success: function (result)
            {
                 alert(result);
                if (result.trim() === 'success') {
                   location.reload();
                } else {
                  //  Not able to change status";
                }
            }
        });
            
        }
        function add_desc()
        {
            document.getElementById('desc_area').style.display = 'flex';
        }
        </script>
        <%@include file="navbar.jsp" %>
    </header>
    <div id="container">
        <table id="stock_table">
            <thead>
                <th>S No.</th>
                <th>Item</th>
                <th>Available(Qty)</th>
                <th>Add</th>
                <th>Price</th>
                <th>Visibility</th>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="data">
                    <tr>
                        <td>${data.Sno}</td>
                        <td id="item_name${data.Sno}" class="item_name">${data.Item_name}</td>
                        <td id="item_quantity${data.Sno}" class="item_avail">${data.Item_quantity}</td>
                        <td><button id='butt_add${data.Sno}' class="butt_add" onclick="AddFunc('${data.Sno}')" value="add"><img src="images/icons/add.png"></button>
                            <input id='text_add${data.Sno}' class="text_add" type="text" onKeydown="add_to_qty(event,'${data.Sno}')"></td>
                        <td><input id="text_price${data.Sno}" class="text_price" type="text" onKeydown="update_price(event,'${data.Sno}')" readonly placeholder="${data.Item_price}"><Button class="butt_edit" onclick="editprice('${data.Sno}')"><img class="edit_price_icon" width="20px" src="images\icons\edit.png"></button></td>
                        <td>
                            <c:choose>
                                <c:when test="${data.Item_visibility==0}" >
                                    
                                    <button id="visibility_button${data.Sno}" value="" class="visibility_button" onclick="change_visibilty_status(${data.Sno},'1'); ">
                                        <img  src="images/icons/visible_false.png" id="visibility_img${data.Sno}" class="visibility_img"></button>
                                    </c:when>
                                <c:otherwise >

                                    <button id="visibility_button${data.Sno}" value="" class="visibility_button" onclick="change_visibilty_status(${data.Sno},'0') ">
                                        <img  src="images/icons/visible_true.png" id="visibility_img${data.Sno}" class="visibility_img"></button>
                                </c:otherwise>
                                    
                                </c:choose>




                    </tr>   
                </c:forEach>


            </tbody>
        </table>
    </div>
    <div id="new_item_box">
        <Label id="new_item_label">New Item</Label>
        <form action="../add_new_item" method="post">
            <table id="new_item_table">
                <tr>
                    <td>Name</td>
                    <td>Quantity</td>
                    <td>Price</td>
                    <td>Image</td>
                </tr>
                <tr>
                    <td><input type="text" id="new_item_name" name="new_item"></td>
                    <td><input type="text" id="new_item_quantity" name="new_item_quantity" ></td>
                    <td><input type="text" id="new_item_price" name="new_item_price"></td>
                    <td><input type="file"></td>
                        
                </tr>
                <tr>
                    <td colspan="1"><span id="add_desc" onclick="add_desc()">Add Description</span></td>
                    <td colspan="2"><textarea id="desc_area" style="display: none" value="NULL" ></textarea></td>
                </tr>
                <tr>
                    <td colspan="4"><input type="submit" id="new_item_butt" value="Create"></td>
                </tr>
            </table>
            
        </form>
        
    </div>

</body>
</html>
