/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aryam
 */
public class Reader extends User {
   
    private int rating;
    private Connection conn;
    private boolean conn_status;
    private PreparedStatement ps;
    //Connection con=main.CreateConnection();
   private static String URL="jdbc:mysql://localhost:3306/prooop";
    private static String username="root";
    private static String password = "123456aryamSs";
    ResultSet rs = null;
   // static String id="5";

    public Reader(){
        super();
          conn_status = false;
        dbConnaction();
    }
       public Reader (String ID,String fname,String lname,String phonenum,String email,char gender,int rating, String username,String password){
        super(ID,fname,lname,phonenum,email,gender,username,password);
        this.rating=rating;
      
    }        
           public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
     private void dbConnaction() {

        try {
            conn = DriverManager.getConnection(URL , username, password);
            conn_status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }
        
        public int is_id_exist(String id) {
        if (conn_status == true) {
            String query = "SELECT * FROM Reader WHERE readerID  = '" + id + "'";
            try {
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    return 1; // it exists
                } else {
                    return 0; // does not exist
                }

            } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null , ex);
            }
            return -2; // something wrong happen.
        } else {
            return -1; // it is not connected to the database.
        }}
     
     
        
          public int is_username_exist(String username) {
        if (conn_status == true) {
            String query = "SELECT * FROM Reader WHERE username  = '" + username + "'";
            try {
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    return 1; // it exists
                } else {
                    return 0; // does not exist
                }

            } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null , ex);
            }
            return -2; // something wrong happen.
        } else {
            return -1; // it is not connected to the database.
        }

    }
 
                  
     
      public boolean insert_reader(String Fname, String Lname, String email, String readerID, String phoneNumber,String Gender, String username, String pass) {
        if (conn_status == true && is_username_exist(username)==0) {
            PreparedStatement ps;
            
            /*String data ,gender = null;
            data = "'" + Fname + "'" + ","
                    + "'" + Lname + "'" + ","
                    + "'" + email + "'" + ","
                    + "'" + readerID +","
                    + "'" + gender.valueOf(Gender) +","
                    + "'" + username + "'" + ","
                    + "'" + pass + "'";*/
             

       String query = "INSERT INTO reader (Fname, Lname, email, readerID,Gender,username,Passwords)"
                    + "values (?,?,?,?,?,?,? )";
            String query1 ="INSERT INTO readerphone (readerID, phonenum) values (?,?)";
            try {

            ps = conn.prepareStatement(query);
            ps.setString(1,Fname);
            ps.setString(2,Lname);
            ps.setString(3,email);
            ps.setString(4,readerID);
            ps.setString(5,Gender);
            ps.setString(6,username);
            ps.setString(7,pass);
                ps.executeUpdate();
            ps = conn.prepareStatement(query1);
            ps.setString(1,readerID);
            ps.setString(2,phoneNumber);
               ps.executeUpdate();
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null , ex);
            }

            return true;
        } else {
            return false;
        }}
    

    public void Returnbook(String Book_Name,  String book_id,String ReturnDate ,String rating){
            try{
                if(is_book_exist(book_id)==1){
                   
                    conn = DriverManager.getConnection( URL, username, password);                  
                    rs= ps.executeQuery("SELECT books FROM prooop");

           // String query = "UPDATE books(booktitle,bookID,ReturnDate ,rating) SET (?,?,?,?)";
            String query = "UPDATE books(booktitle,bookID ,rating) SET (?,?,?,?)";

            ps = conn.prepareStatement(query);       
            ps.setString(1,Book_Name);
            ps.setString(2,book_id);
          //  ps.setString(3,ReturnDate);
            ps.setString(9,rating);
               ps.executeUpdate();
                     JOptionPane.showMessageDialog(null,"Book Returned !");
                  
                } else {
                  JOptionPane.showMessageDialog(null, "The Book  is NOT  in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null , ex);

            }
}
        public int is_book_exist(String book_id) {
        if (conn_status == true) {
            String query = "SELECT * FROM books WHERE bookID= " + book_id + "";
            try {
                ps = conn.prepareStatement(query);
                rs = ps.executeQuery();
                if (rs.next()) {
                    return 1; // it exists
                } else {
                    return 0; // does not exist
                }

            } catch (SQLException ex) {
               
            }
            return -2; // something wrong happen.
        } else {
            return -1; // it is not connected to the database.
        }

    }   
    
}
    
        
       
