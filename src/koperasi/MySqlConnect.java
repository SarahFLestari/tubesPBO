/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koperasi;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author MBP
 */
public class MySqlConnect {
    Connection conn = null ;
    public static Connection ConnectDB (){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Koperasi","root","");
            //JOptionPane.showMessageDialog(null,"tersambung ke database");
            return conn;
        }
        catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    }    
}
