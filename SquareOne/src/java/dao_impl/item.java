
package dao_impl;

import dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import model.ItemModel;
import model.TransactionModel;
import service.DatabaseConnection;


public class item implements item_dao
{
    
    Connection con;
    DatabaseConnection db;
    
      public  item()
        {
            db = new DatabaseConnection();
            con = db.startConection();
        }
    
    @Override
    public ArrayList<ItemModel> viewStock()
    {
        ArrayList al = new ArrayList();
        try 
        {
            PreparedStatement ps=con.prepareStatement("Select * from stock");
        
            //Step5: Execute the query
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            { 
                LinkedHashMap lhm = new LinkedHashMap();
                lhm.put("Sno" , rs.getString("sno"));
                lhm.put("Item_name",rs.getString("name"));
                lhm.put("Item_quantity",rs.getString("quantity"));
                lhm.put("Item_price",rs.getString("price"));
                lhm.put("tem_image",rs.getString("image"));
                lhm.put("Item_desc",rs.getString("description"));
                lhm.put("Item_visibility",rs.getString("visibility"));
                //String path = "C:/wamp64/www/picture/"+item_image;
                //String url = "http://localhost/picture/"+item_image;
            
            
            
            
                al.add(lhm);    
            }
            
        }
        catch(Exception ex)
        {
            
        }
                
            
        
        
        return al; 
    }
    
      
    
    @Override
    public String addItem(ItemModel itemmodel) 
    {
        try{                    
           
            //Step 3: Make the Query
           java.sql.PreparedStatement ps=con.prepareStatement("Insert into stock set name=?, quantity= ?,price=?, image= ?,description=?,visibility=?");
            
            ps.setString(1,itemmodel.getItem_name());
            ps.setString(2,itemmodel.getItem_quantity());
            ps.setString(3,itemmodel.getItem_price());
            ps.setString(4,itemmodel.getItem_image());
            ps.setString(5,itemmodel.getItem_desc());
            ps.setString(6,itemmodel.getItem_visibility());
            
            ps.executeUpdate();
            con.close();
            return "success";
            
            
    }
        catch(Exception ex)
        {
            return "fail";
        }
    }
    
    
    

    @Override
    public String updateStatus(ItemModel itemmodel) 
    {
        try{
            java.sql.PreparedStatement ps=con.prepareStatement("update stock set visibility=? where sno=?");
            ps.setString(1,itemmodel.getItem_visibility());
            ps.setInt(2,itemmodel.getSno());
            ps.executeUpdate();
            con.close();
            db.stopConnection();
            return "success";
        }
        catch(Exception ex)
        {
            return "fail";
        }
    }
    
    @Override
    public String updatePrice(ItemModel itemmodel)
    {
        try{
            java.sql.PreparedStatement ps=con.prepareStatement("update stock set price=? where sno=?");
            ps.setString(1,itemmodel.getItem_price());
            ps.setInt(2,itemmodel.getSno());
            ps.executeUpdate();
            con.close();
            db.stopConnection();
            return "success";
        }
        catch(Exception ex)
        {
            System.out.println("ex");
            return "fail";
        }
    }
    
    @Override
    public String updateQuantity(ItemModel itemmodel)
    {
        try{
            java.sql.PreparedStatement ps=con.prepareStatement("update stock set quantity=? where sno=?");
            ps.setString(1,itemmodel.getItem_quantity());
            ps.setInt(2,itemmodel.getSno());
            ps.executeUpdate();
            con.close();
            db.stopConnection();
            return "success";
        }
        catch(Exception ex)
        {
            System.out.println("ex");
            return "fail";
        }
    }
    
}
