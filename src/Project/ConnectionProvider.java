/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
//import Project.ConnectionProvider;

/**
 *
 * @author Suyash
 */
public class ConnectionProvider {
    public static Connection getCon()
   {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","1234567");
           return con;
       }
       catch(Exception e)
       {
           System.out.println(e);
           return null;
       }   
   }
    
     public static void main(String args[]){
        
    }
}
