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
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aryam
 */
public class Books {
    
    
    private String bookID;
    private String booktitle;
    private String section;
    private String branch;
    private String typeofbook;
    private String autor;
    private int price;
    private int rating;
    private int year;
    private String edition;
    private String status;
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement ps;
    private boolean con_status;
    private DefaultTableModel tableModel;
    private static String URL="jdbc:mysql://localhost:3306/prooop";
    private static String username="root";
    private static String password = "123456aryamSs";
    private String query = "SELECT type FROM bill";



    public Books(String bookID, String booktitle, String section, String branch, String typeofbook, String autor, int price, int rating, int year , String edition ,String status) {
        this.bookID = bookID;
        this.booktitle = booktitle;
        this.section = section;
        this.branch = branch;
        this.typeofbook = typeofbook;
        this.autor = autor;
        this.price = price;
        this.rating = rating;
        this.year = year;
        this.edition=edition;
        this.status=status;    
    }
       Books book;
    
  



    public Books getbook() {
        return book;
    }


    public void setbook(Books book) {
        this.book = book;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public void setTypeofbook(String typeofbook) {
        this.typeofbook = typeofbook;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBookID() {
        return bookID;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getSection() {
        return section;
    }

    public String getBranch() {
        return branch;
    }

    public String getTypeofbook() {
        return typeofbook;
    }

    public String getAutor() {
        return autor;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
    
    public String getEdition() {
        return edition;
    }

    public String getStatus() {
        return status;
    }

/*    public double getTotalPrice() {
 
        double totalPrice = 0;

         for(int i=0 ;i<table1.getColumnCount();i++){
            
            totalPrice += book.getPrice();
        }
     

        return totalPrice;
    }*/
    
    public Object[] getbookInfo() {
          if( book !=null){
              return new Object[]{book.getBookID(),book.getBooktitle(),book.getPrice()}; 
           }else{
               return null;
           }
    }
    public void showAllBooks(JPanel p ){
        
    }
    
    public void updatestatus(String Return_date, String borrow_date,String book_id) {
       if(Return_date=="" && borrow_date=="" ) 
       {
           try
       {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prooop" , username, password);
            st=con.createStatement();
            String sql = "USE bill "+"UPDATE type "+"SET bought WHERE bookID= " + book_id + "";
            st.executeUpdate(sql);
            rs=st.executeQuery(query);
            rs.close();
       }
           catch(SQLException e)
           {e.printStackTrace();}
       }
       else 
       {
           try
       {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/prooop" , username, password);
            st=con.createStatement();
            String sql =  "USE bill "+"UPDATE type "+"SET bought WHERE bookID= " + book_id + "";
            st.executeUpdate(sql);
            rs=st.executeQuery(query);
            rs.close();
       }
            catch(SQLException e)
           {e.printStackTrace();}
       
       
       }
    }
        public int is_book_exist(String book_id) {
        if (con_status == true) {
            String query = "SELECT * FROM books WHERE bookID= " + book_id + "";
            try {
                ps = con.prepareStatement(query);
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

