/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author mukul
 */
public interface transaction_dao {
    public ArrayList viewTransactions();
    public LinkedHashMap generateBill();
  
}
