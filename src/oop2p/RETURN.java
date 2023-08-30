
package oop2p;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.util.Date;
///import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.time.*;
import java.sql.*;
import java.lang.String;




public class RETURN extends javax.swing.JFrame {
  
    private Connection conn;
    private Statement s;   
    private boolean conn_status;
    private PreparedStatement ps;
    private String URL = "jdbc:mysql://localhost:3306/prooop";
    private String Username = "root";
    private String Password = "123456aryamSs";
    ResultSet rs ;
    ResultSet rs1 ;
     public static String user;
    //static String id="7";


    public RETURN() {
        super("RETURN BOOK");
        dbConnaction();
        initComponents();
    }
          private void dbConnaction() {

        try {
            conn = DriverManager.getConnection(URL, Username, Password);
            conn_status = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
          public void setusername(String user){
           // uu.setText(u);
              this.user=user;
            }
    
         
 
     
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        billcomb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        book_name = new javax.swing.JLabel();
        Return = new javax.swing.JButton();
        return_date = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        rate = new javax.swing.JLabel();
        Rate = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("WISE BOOKS LIBRARY");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        billcomb.setBackground(new java.awt.Color(229, 229, 227));
        billcomb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billcombActionPerformed(evt);
            }
        });
        getContentPane().add(billcomb, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("RETURN BOOK");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jLabel4.setText("Reader bills :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        book_name.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        book_name.setText("Book Name:");
        getContentPane().add(book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        Return.setBackground(new java.awt.Color(194, 194, 170));
        Return.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        Return.setText("RETURN");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });
        getContentPane().add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        return_date.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        return_date.setText("Return Date:");
        getContentPane().add(return_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        title.setBackground(new java.awt.Color(229, 229, 227));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 130, -1));

        due.setBackground(new java.awt.Color(229, 229, 227));
        getContentPane().add(due, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 130, -1));

        rate.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        rate.setText("Rate:");
        getContentPane().add(rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        Rate.setBackground(new java.awt.Color(229, 229, 227));
        Rate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        Rate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RateItemStateChanged(evt);
            }
        });
        getContentPane().add(Rate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 130, -1));

        jButton1.setBackground(new java.awt.Color(194, 194, 170));
        jButton1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jPanel3.setBackground(new java.awt.Color(240, 240, 217));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cc.setBackground(new java.awt.Color(236, 236, 222));
        cc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 110));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 80, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop2p/99.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 460, 320));

        setBounds(0, 0, 383, 355);
    }// </editor-fold>//GEN-END:initComponents

    
    
   
    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        String book_id=title.getText();
        String ReturnDate=due.getText();
        String rating=(String) Rate.getSelectedItem();
        try{
            long millis=System.currentTimeMillis();
            java.sql.Date date=new java.sql.Date(millis);
            
            if(Date.valueOf(due.getText()).compareTo(date)>0||Date.valueOf(due.getText()).compareTo(date)==0){
        String query2="select * from books where booktitle='"+title.getText()+"'";
        Statement st2=conn.createStatement();
        rs=st2.executeQuery(query2);
            rs.next();
            PreparedStatement up2=conn.prepareStatement("update borrow_table set Return_date=? where Bill_no='"+billcomb.getSelectedItem()+"'");
            up2.setDate(1, date);
            up2.executeUpdate();
       PreparedStatement up3=conn.prepareStatement("update books set rating=? where booktitle='"+title.getText()+"'");
            up3.setString(1,rating);
            up3.executeUpdate();
       
            
                    JOptionPane.showMessageDialog(null,"Book Returned Successfuly! Thank you");
        }else{
                        JOptionPane.showMessageDialog(null,"You missed the due date,Please Contact us At:  -wiseBookslibaray@gmail.com- ");

            }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
       }
// String Book_Name=Book_name.getText();
     //  new login().u.getusername()
        // r.setusername();
        
        // System.out.print(new login().u.getusername());
         
        

        
        //Returnbook(Book_Name,book_id,ReturnDate,rating);
      
       

                     
    }//GEN-LAST:event_ReturnActionPerformed

    private void RateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RateItemStateChanged
    
    }//GEN-LAST:event_RateItemStateChanged

    private void billcombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billcombActionPerformed
    String bid;
        try{
           String query="select * from borrow_table where Bill_no='"+billcomb.getSelectedItem().toString()+"'";
                  s=conn.createStatement();
        rs=s.executeQuery(query);
            rs.next();
            bid=rs.getString("bookID");
             due.setText(rs.getDate("Due_date").toString());
            String query2="select * from books where bookID='"+bid+"'";
                 Statement st2=conn.createStatement();
        rs1=st2.executeQuery(query2);
                    rs1.next();
        title.setText(rs1.getString("booktitle"));
//        long millis=System.currentTimeMillis();
//        java.sql.Date date=new java.sql.Date(millis);
             
           ImageIcon i;
            i = new javax.swing.ImageIcon(getClass().getResource(rs1.getString("icon")));
            cc.setIcon(i);      
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
        e.printStackTrace();
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_billcombActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           JFCart j =new JFCart();
           j.setVisible(true);
           this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    


public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                    new RETURN().setVisible(true);
                            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Rate;
    private javax.swing.JButton Return;
    private javax.swing.JComboBox<String> billcomb;
    private javax.swing.JLabel book_name;
    private javax.swing.JLabel cc;
    private javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel rate;
    private javax.swing.JLabel return_date;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
    public void Returnbook(String Book_Name,  String book_id,String ReturnDate ,String rating)  {
            try{
            if(is_book_exist(book_id)==1){
              
            String RETURNED="RETURNED";
            
            String query ="UPDATE borrow_table SET "+"Check_book=? WHERE bookID=?";
            ps = conn.prepareStatement(query); 
             ps.setString(1,RETURNED);
            ps.setString(2,book_id);
           
            ps.executeUpdate();
          
              
                     JOptionPane.showMessageDialog(null,"Book Returned !");}
                  
               
            else {
                  JOptionPane.showMessageDialog(null, "The Book  is NOT  in Library Database!","Returning Book Error!", JOptionPane.ERROR_MESSAGE);
                }}

             catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null , ex);

            }}

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
      public void fillbill(String username) {
      
        try{
           // String query2="select * from reader where username='"+username+"'";

        String id="";

        Statement st2=conn.createStatement();
        rs=st2.executeQuery("select * from reader where username='"+username+"'");
            rs.next();
            id=rs.getString("readerID");
            System.out.println(rs.getString("readerID"));
        String query="Select * from borrow_table where readerID='"+id+"'";
        s=conn.createStatement();
        ResultSet rs2=s.executeQuery("Select * from borrow_table where Return_date is null AND readerID='"+id+"'");
        while(rs2.next()){
              billcomb.addItem(String.valueOf(rs2.getString("Bill_no")));
              
        }}
             
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
       }
    

//        try
//            
//       {  String query="select Bill_no FROM billcontents where readerID";
//          // conn = DriverManager.getConnection(URL , username, password);
//         
//         Statement stmt = conn.createStatement();
//         ResultSet result = stmt.executeQuery(query);
//             while (result.next()) {
//            String name=result.getString("booktitle");
//           // comboBox.addItem(name);
//            }
//        } 
//        catch (SQLException se) {
//            se.printStackTrace();
//       
//            }}

} } 


    


