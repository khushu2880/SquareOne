/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.CartItem;
import model.UserModel;

public interface userAccount_dao {
    public String new_user(UserModel usermodel);
    public String addItemToCart(CartItem cartitem);
}
