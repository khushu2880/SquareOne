/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_impl;

import dao.transaction_dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import service.DatabaseConnection;

/**
 *
 * @author mukul
 */
public class transaction implements transaction_dao {

    Connection con;
    DatabaseConnection db;

    public transaction() {
        db = new DatabaseConnection();
        con = db.startConection();
    }

    @Override
    public ArrayList viewTransactions() {
        ArrayList al = new ArrayList();
        try {
            PreparedStatement ps = con.prepareStatement("Select * from transactions");

            //Step5: Execute the query
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                LinkedHashMap lhm = new LinkedHashMap();

                lhm.put("Trans_id", rs.getString("order_id"));
                lhm.put("Card_id", rs.getString("card_id"));
                lhm.put("Amount", rs.getString("amount"));
                lhm.put("Date", rs.getString("date"));
                lhm.put("Time", rs.getString("time"));

                al.add(lhm);

            }
        } catch (Exception ex) {
            System.out.println("exception in viewTransaction in transaction" + ex);
        }

        return al;
    }

    @Override
    public LinkedHashMap generateBill() {
        LinkedHashMap lhm = new LinkedHashMap();
        System.out.print("JSTL needed to be added");
        //    request.getParameter("trans_id");
        return lhm;
    }

    

    @Override
    public ArrayList generateCheckout(String username) {
        ArrayList al = new ArrayList();
        try {

            PreparedStatement ps = con.prepareStatement("Select * from users_carts where username=?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                int bill = 0;
                String productsarray[] = (rs.getString("cart_items")).split(";");
                for (String product_quant : productsarray) {

                    String item[] = product_quant.split(":");
                    PreparedStatement itemsno_name = con.prepareStatement("Select * from stock where sno=?");
                    itemsno_name.setInt(1, Integer.parseInt(item[0]));

                    ResultSet itemdetail = itemsno_name.executeQuery();
                    //System.out.println(rs2);
                    if (itemdetail.next()) {
                        LinkedHashMap lhm = new LinkedHashMap();
                        String url = "http://localhost/picture/" + itemdetail.getString("image");
                        lhm.put("itemsno", item[0]);
                        lhm.put("itemname", itemdetail.getString("name"));
                        lhm.put("itemprice", itemdetail.getString("price"));
                        lhm.put("itemimage", url);
                        lhm.put("itemquantity", item[1]);

                        bill += (Integer.parseInt(item[1]) * Integer.parseInt(itemdetail.getString("price")));
                        al.add(lhm);
                    }

                }
            LinkedHashMap lhm = new LinkedHashMap();    
            lhm.put("bill", bill);
            
            al.add(lhm);
            return al;
            } 
            else {
                               
                return al;
            }
            
            
        } catch (Exception ex) {
            System.out.println("Exception in generateCheckout in transaction" + ex);
            return al;
        }
        
    }
    
    @Override
    public String payViaWallet(String username, String billamt, ArrayList productlist) {
        
        String order_products = "";
        for (int i = 0; i < productlist.size() - 1; i++) {
            LinkedHashMap lhm = (LinkedHashMap) productlist.get(i);
            String itemname = (String) lhm.get("itemname");
            String itemprice = (String) lhm.get("itemprice");
            String itemQuant = (String) lhm.get("itemquantity");
            order_products += (itemname + ":" + itemprice + ":" + itemQuant + ";");
            System.out.println("order_products");
        }
        
        int billfromdb = Integer.parseInt(((LinkedHashMap)productlist.get(productlist.size() - 1)).get("bill").toString());
        if (Integer.parseInt(billamt) == billfromdb) {
            String timestamp = "";
            try {
                PreparedStatement ps3 = con.prepareStatement("select card_id from user_data where username = ?");
                ps3.setString(1, username);
                ResultSet rs3 = ps3.executeQuery();
                if (rs3.next()) {
                    
                    DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    DateFormat timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date datetime = new Date();
                    String card = rs3.getString("card_id");
                    PreparedStatement ps4 = con.prepareStatement("insert into transactions set card_id =? , username = ?,amount = ?,order_products=?,date = ?,time=?,order_id=?");
                    ps4.setString(1, card);
                    ps4.setString(2, username);
                    ps4.setInt(3, billfromdb);
                    ps4.setString(4, order_products);
                    ps4.setString(5, dateFormat.format(datetime));
                    ps4.setString(6, timeFormat.format(datetime));
                    ps4.setString(7, timeStamp.format(datetime));
                    ps4.executeUpdate();
                    timestamp = timeStamp.format(datetime);
                }
            } catch (Exception ex) {
                System.out.println("Exception in payViaWallet:" + ex);
                return "fail";
            }
            userAccount uA = new userAccount();
            String balance = uA.getBalance(username);
            int newBalance = (Integer.parseInt(balance) - billfromdb);
            return (uA.setBalance(username, newBalance) + ";"+timestamp);

        }
        return "fail";
    }
}
