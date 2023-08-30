/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author aryam
 */
public class main {
    private static String URL="jdbc:mysql://localhost:3306/prooop";
    private static String username="root";
    private static String password = "123456aryamSs";
    private static Connection con=null;
    public static void main(String[] args) {
        StartPage log=new StartPage();
        log.setVisible(true);
    }
    
 public static Connection CreateConnection(){
     try{
         con=DriverManager.getConnection(URL,username,password);
     }
     catch(SQLException ex){
         JOptionPane.showMessageDialog(null,ex.getMessage());
         
     }
     return con;
 }
}
