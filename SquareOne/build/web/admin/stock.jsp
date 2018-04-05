<%
    
    if(session.getAttribute("user_name")==null ||session.getAttribute("user_name").equals(""))
    {
        response.sendRedirect("..//admin.jsp");
    }
    
%>
<%@page import="java.sql.*"%>





<html>
<head>
    <title>Stock</title>
    <link rel="stylesheet" href="../css/stock_styles.css" type="text/css">
    <script src="js/script_1.9.js" type="text/javascript"></script>
</head>
<body>
    <header>
        <script>
            
        function AddFunc(sno)
        {
        document.getElementById('butt_add'+sno).style.display = 'none';
        document.getElementById('text_add'+sno).style.display = 'flex';
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
                document.getElementById('text_add'+sno).value='';
                document.getElementById('butt_add'+sno).style.display = 'flex';    
                document.getElementById('text_add'+sno).style.display = 'none';
            }
        }
        function update_price(e,sno)
        {
            if(e.keyCode===13)
            {
                document.getElementById('text_price'+sno).placeholder=document.getElementById('text_price'+sno).value;
                document.getElementById('text_price'+sno).value='';
                document.getElementById('text_price'+sno).readOnly= true;
            }
        }
        function change_visibilty_status(sno , status)
        {
          //  document.getElementById("visibility_img"+sno).src="../images/icons/visible_true.png";
         $.ajax({
            type: "POST",
            url: "",
            data: {sno: sno,status: status},
            success: function (result)
            {
                if (result.trim() === 'done') {
                   location.reload();
                } else {
                  //  document.getElementById('adm_validate').innerHTML = "UserName and Password Incorrect";
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
            <tr>
                <th>S No.</th>
                <th>Item</th>
                <th>Available(Qty)</th>
                <th>Add</th>
                <th>Price</th>
                <th>Visibility</th>
            </tr>
            <%
            
                try 
                {
         
            
                    Class.forName("com.mysql.jdbc.Driver");
           
                    //Step 2: Create the Connection
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root","");
           
                    //Step 3: Make the Query
                    PreparedStatement ps=con.prepareStatement("Select * from stock");
           
                    //Step5: Execute the query
                    ResultSet rs=ps.executeQuery();
                        
                    while(rs.next())
                    {
                        String sno = rs.getString("sno");
                        String item_name = rs.getString("name");
                        String item_quantity = rs.getString("quantity");
                        String item_price = rs.getString("price");
                        String item_image = rs.getString("image");
                        String item_desc = rs.getString("description");
                        String item_visibility = rs.getString("visibility");
                        



                        String path = "C:/wamp64/www/picture/"+item_image;
                        String url = "http://localhost/picture/"+item_image;
            %>
            <tr>
                <td><%=sno%></td>
                <td id="item_name<%=sno%>" class="item_name"><%=item_name%></td>
                <td id="item_quantity<%=sno%>" class="item_avail"><%=item_quantity%></td>
                <td><button id='butt_add<%=sno%>' class="butt_add" onclick="AddFunc('<%=sno%>')" value="add"><img src="../images/icons/add.png"></button>
                    <input id='text_add<%=sno%>' class="text_add" type="text" onKeydown="add_to_qty(event,'<%=sno%>')"></td>
                <td><input id="text_price<%=sno%>" class="text_price" type="text" onKeydown="update_price(event,'<%=sno%>')" readonly placeholder="<%=item_price%>"><Button class="butt_edit" onclick="editprice('<%=sno%>')"><img class="edit_price_icon" width="20px" src="../images\icons\edit.png"></button></td>
                <td>
                    <% if(item_visibility.equals("0")){ %>
                    <button id="visibility_button<%=sno%>" value="" class="visibility_button" onclick="change_visibilty_status(<%=sno%>,'1'); ">
                        <img  src="../images/icons/visible_false.png" id="visibility_img<%=sno%>" class="visibility_img">
                        <%}
                    else
                    { %>
                        <button id="visibility_button<%=sno%>" value="" class="visibility_button" onclick="change_visibilty_status(<%=sno%>,'0') ">
                        <img  src="../images/icons/visible_true.png" id="visibility_img<%=sno%>" class="visibility_img">
                        <%
                    }
                    
                    %>
                    </button>
            </tr>
            <%
           
                    }
                    con.close();
                    
            
            
            
            }
            catch(Exception ex)
        {
            out.println("Exception on ViewAll Record = "+ex);
        }

            %>
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
