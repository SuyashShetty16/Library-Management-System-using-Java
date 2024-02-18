/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Suyash
 */
public class tables {
    public static void main(String[] args)
    {
        Connection con=null;
        Statement st=null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table seat(tableNo varchar(10),type varchar(200),table_seat varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table customer(id int,name varchar(200),mobileNumber varchar(20),nationality varchar(200),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkIn varchar(50),tableNo varchar(10),seat varchar(200),type varchar(200),pricePerHour int(10),numberOfHours int(10),totalAmount varchar(200),checkout varchar(50))");
            JOptionPane.showMessageDialog(null,"Table created Successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        finally
        {
           try
        {
            con.close();
            st.close();
        }
        catch(Exception e)
        {} 
        }
    }
    
}
