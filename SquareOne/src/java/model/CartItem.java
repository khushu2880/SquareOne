/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author mukul
 */
public class CartItem {
    String username;
    String Item;
    String Item_Quant="";

    public String getItem_Quant() {
        return Item_Quant;
    }

    public void setItem_Quant(String Item_Quant) {
        this.Item_Quant = Item_Quant;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }
    
    public String hashtoItem_Quant(HashMap<String, Integer> hm)
    {
        
        String Itemquantencode = "";
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            Itemquantencode= Itemquantencode + pair.getKey().toString() + ":"+ pair.getValue().toString() + ";" ;
            it.remove();
        }
            
        return Itemquantencode;
            
    }
    
    
}
