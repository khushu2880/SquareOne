
package dao;

import java.util.ArrayList;
import model.ItemModel;




public interface item_dao 
{

  public String addItem(ItemModel itemmodel);
  public String updateStatus(ItemModel itemmodel);
  public String updatePrice(ItemModel itemmodel);  
  public String updateQuantity(ItemModel itemmodel);
  public ArrayList viewStock();
}
