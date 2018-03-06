<html>
<head>
    <title>Stock</title>
    <link rel="stylesheet" href="../css/stock_styles.css" type="text/css">
</head>
<body>
    <header>
        <script>
        function AddFunc(butt_id,text_add_ID){
        document.getElementById(butt_id).style.display = 'none';
        document.getElementById(text_add_ID).style.display = 'flex';
        }
        function editprice(text_price_ID)
        {
            document.getElementById(text_price_ID).removeAttribute('readonly');
        }
        function add_to_qty(e,text_add_ID,item_avail_ID,butt_add_ID)
        {
            
            if(e.keyCode===13)
            {
                var avail= parseInt(document.getElementById(item_avail_ID).innerHTML);
                avail += parseInt(document.getElementById(text_add_ID).value);
                document.getElementById(item_avail_ID).innerHTML=avail;
                document.getElementById(text_add_ID).value='';
                document.getElementById(butt_add_ID).style.display = 'flex';    
                document.getElementById(text_add_ID).style.display = 'none';
            }
        }
        function update_price(e,text_price_ID)
        {
            if(e.keyCode===13)
            {
                document.getElementById(text_price_ID).placeholder=document.getElementById(text_price_ID).value;
                document.getElementById(text_price_ID).value='';
                document.getElementById(text_price_ID).readOnly= true;
            }
        }
        </script>
        <%@include file="navbar.jsp" %>
    </header>
    <div id="container">
        <table id="stock_table">
            <tr>
                <th>Item</th>
                <th>Available(Qty)</th>
                <th>Add</th>
                <th>Price</th>
                <th>Remove</th>
                <th>Visibility</th>
            </tr>
            <tr>
                <td id="item_name">Rice</td>
                <td id="item_avail">50</td>
                <td><Button id="butt_add" onclick="AddFunc(this.id,'text_add')"><img src="../images\icons\add.png"></button>
                    <input id="text_add" type="text" onKeydown="add_to_qty(event,this.id,'item_avail','butt_add')" ></td>
                <td><input id="text_price" type="text" onKeydown="update_price(event,'text_price')" readonly value="100"><Button id="butt_edit" onclick="editprice('text_price')"><img id="edit_price_icon" width="20px" src="../images\icons\edit.png"></button></td>
                <td><button id="butt_remove"><img src="../images\icons\remove.png"></button></td>
                <td><button id="visibility_button"><img src="../images\icons\visibile_true.png"></button>
            </tr>
        </table>
    </div>
    <div id"Add_item_box">
        <button id="add_item_button" onclick="" >Add Item</button>
        <button id="Update_stock" onclick="">Update</button>
    </div>

</body>
</html>
