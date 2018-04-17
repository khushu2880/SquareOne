<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%

    if (session.getAttribute("user_name") == null || session.getAttribute("user_name").equals("")) {
        response.sendRedirect("admin.jsp");
    }

%>
<%@page import="java.sql.*"%>





<html>
    <head>
        <title>Stock Manager</title>
        <link rel="stylesheet" href="css/stock_styles.css" type="text/css">
        <link href="css/tablecontainer.css" rel="stylesheet" type="text/css"/>
        <script src="admin/js/script_1.9.js" type="text/javascript"></script>
    </head>
    <body>
        <script>

            function AddFunc(sno)
            {
                document.getElementById('butt_add' + sno).style.display = 'none';
                document.getElementById('text_add' + sno).style.display = 'flex';
            }

            function updateitem()
            {

            }

            function editprice(sno)
            {
                document.getElementById('text_price' + sno).removeAttribute('readonly');
            }
            function add_to_qty(e, sno)
            {
                if (e.keyCode === 13)
                {
                    var avail = parseInt(document.getElementById('item_quantity' + sno).innerHTML);
                    avail += parseInt(document.getElementById('text_add' + sno).value);
                    document.getElementById('item_quantity' + sno).innerHTML = avail;

                    $.ajax({
                        type: "POST",
                        url: "update_itemquantity",
                        data: {sno: sno, qty: avail},
                        success: function (result)
                        {

                            alert(result);
                            if (result.trim() === 'success') {

                            } else {
                                //  Not able to change status";
                            }
                        }
                    });

                    document.getElementById('text_add' + sno).value = '';
                    document.getElementById('butt_add' + sno).style.display = 'flex';
                    document.getElementById('text_add' + sno).style.display = 'none';
                }
            }
            function update_price(e, sno)
            {
                if (e.keyCode === 13)
                {
                    var new_price = document.getElementById('text_price' + sno).value;
                    document.getElementById('text_price' + sno).placeholder = new_price;


                    $.ajax({
                        type: "POST",
                        url: "update_itemprice",
                        data: {sno: sno, price: new_price},
                        success: function (result)
                        {

                            alert(result);
                            if (result.trim() === 'success') {

                            } else {
                                //  Not able to change status";
                            }
                        }
                    });

                    document.getElementById('text_price' + sno).value = '';
                    document.getElementById('text_price' + sno).readOnly = true;
                }

            }
            function change_visibilty_status(sno, status)
            {


                $.ajax({
                    type: "POST",
                    url: "update_itemstatus",
                    data: {sno: sno, status: status},
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

        <header>
            <%@include file="navbar.jsp" %>
        </header>
        <div id="container">
            <table id="view_table" cellspacing="15">
                <thead id="view_table_head">
                    <tr id="view_table_headrow">
                        <th class="view_stock_table_headdata">S No.</th>
                        <th class="view_stock_table_headdata">Item</th>
                        <th class="view_stock_table_headdata">Available(Qty)</th>
                        <th class="view_stock_table_headdata">Add</th>
                        <th class="view_stock_table_headdata">Price</th>
                        <th class="view_stock_table_headdata">Visibility</th>
                    </tr>
                </thead>
                <tbody id="view_table_body">
                    <c:forEach items="${list}" var="data">
                        <tr class="view_table_bodyrow">
                            <td class="view_table_bodydata">${data.Sno}</td>
                            <td  id="item_name${data.Sno}" class="view_table_bodydata ">${data.Item_name}</td>
                            <td  id="item_quantity${data.Sno}" class="view_table_bodydata item_avail">${data.Item_quantity}</td>
                            <td class="view_table_bodydata"><button id='butt_add${data.Sno}' class="view_table_bodydata butt_add" onclick="AddFunc('${data.Sno}')" value="add"><img src="images/icons/add.png"></button>
                                <input id='text_add${data.Sno}' class="text_add" type="text" onKeydown="add_to_qty(event, '${data.Sno}')"></td>
                            <td class="view_table_bodydata"><input id="text_price${data.Sno}" class=" text_price" type="text" onKeydown="update_price(event, '${data.Sno}')" readonly placeholder="${data.Item_price}"><Button class="butt_edit" onclick="editprice('${data.Sno}')"><img class="edit_price_icon" width="20px" src="images\icons\edit.png"></button></td>
                            <td><center>
                                <c:choose>
                                    <c:when test="${data.Item_visibility==0}" >

                                        <button id="view_table_bodydata visibility_button${data.Sno}" value="" class="visibility_button" onclick="change_visibilty_status(${data.Sno}, '1');
                                                ">
                                            <img  src="images/icons/visible_false.png" id="visibility_img${data.Sno}" class="visibility_img"></button>
                                        </c:when>
                                        <c:otherwise >

                                        <button id="view_table_bodydata visibility_button${data.Sno}" value="" class="visibility_button" onclick="change_visibilty_status(${data.Sno}, '0')">
                                            <img  src="images/icons/visible_true.png" id="visibility_img${data.Sno}" class="visibility_img"></button>
                                        </c:otherwise>

                                </c:choose>
                    </center>




                        </tr>   
                    </c:forEach>


                </tbody>
            </table>
        </div>
        <div id="new_item_box">
            <Label id="new_item_label">New Item</Label>
            <form action="add_new_item" method="post" enctype="multipart/form-data">
                <table id="new_item_table">
                    <thead id="new_item_thead">
                        <tr id="new_item_headrow">
                            <td>Name</td>
                            <td>Quantity</td>
                            <td>Price</td>
                            <td>Image</td>
                        </tr>
                    <thead>
                        <tr class="newitemrow" id="new_item_fieldrow1">
                            <td><input type="text" required id="new_item_name" name="n_item"></td>
                            <td><input type="text" required id="new_item_quantity" name="n_item_quantity" ></td>
                            <td><input type="text" required id="new_item_price" name="n_item_price"></td>
                            <td><input type="file" name="file"></td>

                        </tr>
                        <tr class="newitemrow" id="new_item_fieldrow2">
                            <td colspan="1"><span id="add_desc" onclick="add_desc()">Add Description</span></td>
                            <td colspan="2"><textarea id="desc_area" style="display: none" value="NULL" name="description"></textarea></td>
                            <td><select name="category">
                                    <option value="other">Select Category</option>
                                    <option value="snack">Snack</option>
                                    <option value="beverage">Beverage</option>
                                    <option value="meal">Meal</option>
                                    <option value="other">Other</option>
                                </select></td>
                        </tr>
                        
                        <tr class="newitemrow" id="new_item_buttonrow">
                            <td colspan="4"><input type="submit" id="new_item_butt" value="Create"></td>
                        </tr>
                </table>

            </form>

        </div>

    </body>
</html>
