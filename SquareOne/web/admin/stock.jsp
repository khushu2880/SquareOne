<head>
    <title>Stock</title>
    <link rel="stylesheet" href="../css/stock_styles.css" type="text/css">
</head>
<body>
    <header>
        <script src="https://www.w3schools.com/lib/w3.js"></script>
        <div id="navbar" w3-include-html="navbar.html"></div>
        <script>
        w3.includeHTML();
        a=a.value;
        function AddFunc(butt_id,text_id){
        document.getElementById(butt_id).style.display = 'none';
        document.getElementById(text_id).style.display = 'flex';
        }
        function editprice()
        {
            document.getElementById('text_price').removeAttribute('readonly');
        }
        </script>
    </header>
    <div id="container">
        <table id="stock_table">
            <tr>
                <th>Item</th>
                <th>Available(Qty)</th>
                <th>Add</th>
                <th>Price</th>
                <th>Remove</th>
            </tr>
            <tr>
                <td id="item_name">Rice</td>
                <td id="item_avail">50</td>
                <td><Button id="butt_add" onclick="AddFunc(this.id,'text_add')"><img src="../images\icons\add.png"></button><input id="text_add" type="text"></td>
                <td><input id="text_price" type="text" readonly placeholder="100"><Button id="butt_edit" onclick="editprice(this.id)"><img id="edit_price_icon" width="20px" src="../images\icons\edit.png"></td>
                <td><button id="butt_remove"><img src="../images\icons\remove.png"></button></td>
            </tr>

        </table>
    </div>
    <div id"Add_item_box">
        <button id="add_item_button" onclick="" >Add Item</button>
        <button id="Update_stock" onclick="">Update</button>
    </div>

</body>
