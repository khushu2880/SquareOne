
package dao_impl;

import dao.*;
import java.sql.Connection;
import model.ItemModel;
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
