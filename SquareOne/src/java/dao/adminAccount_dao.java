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
public interface adminAccount_dao {
    public LinkedHashMap getSelfAccountDetails(String username); 
    public ArrayList viewAccounts();
    public String changePassword(String ID,String newpassword);
    
}
