
package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import model.ItemModel;




public interface item_dao 
{

  public String addItem(ItemModel itemmodel);
  public String updateStatus(ItemModel itemmodel);
  public String updatePrice(ItemModel itemmodel);  
  public String updateQuantity(ItemModel itemmodel);
  public ArrayList viewStock();
  public ArrayList userViewAll();
  public ArrayList userViewDrinks();
  public ArrayList userViewMeals();
  public ArrayList userViewSnacks();
  public LinkedHashMap detail(String sno);
}
