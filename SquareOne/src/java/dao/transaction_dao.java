/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import model.ItemModel;

/**
 *
 * @author mukul
 */
public interface transaction_dao {
    public ArrayList viewTransactions();
    public LinkedHashMap generateBill();
    public ArrayList generateCheckout(String username);
    public String createTransaction();
}
