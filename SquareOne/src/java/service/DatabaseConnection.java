
package service;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    
    Connection con;
public DatabaseConnection() {
    
    
    
}
    
    
    
    public  Connection startConection()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/squareone","root",""); 
        }
           catch(Exception ex)
           {
               
           }
     return con;    
    }
    
    public void stopConnection()
    {
        try
        {
        con.close();
    }
    
           catch(Exception ex)
           {
               
           }
    
}
}
