/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login_s;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author Admin
 */
public class javaconnect {

     Connection conn;
     public static Connection ConnecrDB(){
         try
         {
             Class.forName("org.sqlite.JDBC");
             Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\loginjava\\RoomNew.sqlite");
             return conn;
         }
         catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
             return null;
         }
     
     }
    
}
