/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop2p;
import java.awt.List;
import static oop2p.main.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.awt.PopupMenu;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.sql.ResultSetMetaData;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import oop2p.Books;
import oop2p.Reader;






/**
 *
 * @author Deema Alfaleh
 */
public class JFCart extends javax.swing.JFrame {
// Connection con=main.CreateConnection();
    private Connection conn;
    private Connection con2=main.CreateConnection();
    private Statement st;
    private PreparedStatement ps;
    private PreparedStatement pst;
    ResultSet rs;
    BorrowdBill b=new BorrowdBill();
    BoughtBill bo=new BoughtBill();
    private boolean con_status;
    private DefaultTableModel tableModel;
    private static String URL="jdbc:mysql://localhost:3306/prooop";
    private static String username="root";
    private static String password = "123456aryamSs";
    public static double pd = 0.0;
    public static String user;
    
 ///////////////////////////////////DefaultTableModel table ;
    double totalPrice=0.0 ;
   
    public JFCart() {
       // this.table = new DefaultTableModel();
        initComponents();
         showAllBooks();
         selectBook();
        //table.setNumRows(1);
        
     
        tableModel = (DefaultTableModel) table.getModel();
        tableModel.setNumRows(0);
    
             dbConnaction();
        }
    public void setusername(String user){
           // uu.setText(u);
              this.user=user;
            }
    
        //public String getReturnDate(){String reDate= Return_date.getText(); 
    //return reDate;}
    //public String getBorrowDate(){String boDate= borrow_date.getText(); 
    //return boDate;}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        p = new java.awt.Panel();
        combo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        Confirm_order = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        totl = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p.setBackground(new java.awt.Color(250, 250, 241));
        p.setLayout(new java.awt.GridLayout(4, 3, 2, 2));
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 440, 450));

        combo.setBackground(new java.awt.Color(245, 245, 235));
        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Books", "Study Books", "Other Books", "" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel1.add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel3.setText(" Category:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("BOOKS");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Serif", 0, 8)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 0));
        jLabel13.setText("THE WISE BOOK LIBRARY");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop2p/99.png"))); // NOI18N
        jScrollPane1.setViewportView(jLabel1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 620));

        jPanel3.setBackground(new java.awt.Color(234, 240, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop2p/0000.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, 90));

        ADD.setBackground(new java.awt.Color(242, 242, 235));
        ADD.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        ADD.setText("Add To Cart");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel3.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, -1));

        delete.setBackground(new java.awt.Color(242, 242, 235));
        delete.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        delete.setText("Delete from cart");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 120, -1));

        Confirm_order.setBackground(new java.awt.Color(242, 242, 235));
        Confirm_order.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        Confirm_order.setText("Confirm Order");
        Confirm_order.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Confirm_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_orderActionPerformed(evt);
            }
        });
        jPanel3.add(Confirm_order, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 130, 40));
        Confirm_order.setBackground(new java.awt.Color(255, 255, 247));

        table.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book name", "ID", "Price"
            }
        ));
        jScrollPane2.setViewportView(table);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 230, 100));

        jLabel21.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel21.setText("For Returning a book : ");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));

        jButton4.setBackground(new java.awt.Color(234, 240, 240));
        jButton4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton4.setText("Return");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, -1, 20));

        totl.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel3.add(totl, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 90, 20));

        comboBox.setBackground(new java.awt.Color(242, 242, 235));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 170, -1));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel4.setText("Total Price:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jComboBox2.setBackground(new java.awt.Color(242, 242, 235));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card", "Borrow" }));
        jComboBox2.setSelectedIndex(-1);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 150, -1));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jLabel5.setText("Payment:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, -1));

        jButton1.setBackground(new java.awt.Color(234, 240, 240));
        jButton1.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton1.setText("Exit");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 70, -1));

        jButton2.setBackground(new java.awt.Color(234, 240, 240));
        jButton2.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        jButton2.setText("Logout");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 70, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 260, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void Confirm_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_orderActionPerformed
       String payment_method = (String) jComboBox2.getSelectedItem(); 
       BorrowdBill bill_borrow = new BorrowdBill();
       card card=new card();
       
       JFCart book= new JFCart();
       if(table.getRowCount()<1){
             JOptionPane.showMessageDialog(null,"Please Select items","Error",JOptionPane.ERROR_MESSAGE);
       }
       else{
         if(jComboBox2.getSelectedItem()=="Cash"){
     
           bycash(user);
           bo.setVisible(true);
           this.setVisible(false);           
       }
        else if(jComboBox2.getSelectedItem()=="Card"){
                 bycard(user);
                card.setVisible(true);
               this.setVisible(false);}
         
         else if(jComboBox2.getSelectedItem()=="Borrow"){
            borrow(user);
            this.setVisible(false);}
         else{
           JOptionPane.showMessageDialog(null,"Please Select How You Want To Pay","Error",JOptionPane.ERROR_MESSAGE); 
                    }
       }
         
        
       
     // updatestatus();
    }//GEN-LAST:event_Confirm_orderActionPerformed
     private void dbConnaction() {

        try {
            conn = DriverManager.getConnection(URL , username, password);
            con_status = true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }
     
     public int is_book_exist(String book_id) {
        if (con_status == true) {
            String query = "SELECT * FROM books WHERE bookID= " +comboBox.getSelectedItem()  + "";
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

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {                                    
//GEN-FIRST:event_ADDActionPerformed
        DefaultTableModel mod = (DefaultTableModel) table.getModel();
        String selectedItem = (String) comboBox.getSelectedItem();
//String sql = "SELECT book_id, Title, Price FROM Book_table WHERE Book_table.Title = ?";
       String sql = "select booktitle,bookID,price FROM books WHERE booktitle=?";
       try (PreparedStatement pst = conn.prepareStatement(sql)) {
 
              pst.setString(1, selectedItem);
          try (ResultSet rs1 = pst.executeQuery()) {
           while (rs1.next()) {
           Object[] rowData = {rs1.getString("booktitle"), rs1.getInt("bookID"), rs1.getDouble("price")};
           mod.addRow(rowData);
     double total = 0;
      for (int i = 0; i < table.getRowCount(); i++) {
          Object value = table.getValueAt(i, 2);
        if (value != null) {
        total += ((Double) value).doubleValue();
        totl.setText(""+total);
                }
        }
    }

              }
          } catch (SQLException ex) {
               ex.printStackTrace();
}
//        String Search = (String) jComboBox1.getSelectedItem();
//        String book_name = Search;
//
//        try {
//            String query = "select booktitle,bookID,price FROM books WHERE booktitle=" + "'" + book_name + "'";
//            // String query2="select price FROM books WHERE booktitle="+"'"+book_name+"'";
//            conn = DriverManager.getConnection(URL, username, password);
//            st = conn.createStatement();
//            rs = st.executeQuery(query);
//            // rs = st.executeQuery(query2);
//
//            while (rs.next()) {
//                String bookname = rs.getString("booktitle");
//                String bookid = rs.getString("bookID");
//                String Price = rs.getString("price");
//                int p = rs.getInt("price");
//                String Data[] = { bookname, bookid, Price };
//                tableModel = (DefaultTableModel) table.getModel();
//                tableModel.addRow(Data);
//                pd += p;
//                price.setText(String.valueOf(pd));
//            }
//           
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
   
    }

  /* public double getTotalPrice() {
 
  int totalPrice = 0;
  String Search = (String) jComboBox1.getSelectedItem();
  String query2="select price FROM books WHERE booktitle="+"'"+Search+"'";
        try {
            conn = DriverManager.getConnection(URL , username, password);
            st= conn.createStatement();
            rs = st.executeQuery(query);
             while(rs.next()){
             int Price=rs.getInt("price");
             totalPrice =totalPrice+Price ;
             
             }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(JFCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
       

        return totalPrice;
    
    }//GEN-LAST:event_ADDActionPerformed
*/
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      // GEN-FIRST:event_deleteActionPerformed
      if(table.getSelectedRowCount()==0){
          JOptionPane.showMessageDialog(null,"Please Select the item you want to delete","Error",JOptionPane.ERROR_MESSAGE);
      }
      if (table.getSelectedRow() != -1) {
            // remove selected row from the model
            ((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
            double total = 0;
            for (int i = 0; i < table.getRowCount(); i++) {
                Object value = table.getValueAt(i, 2);
                if (value != null) {
                    total += ((Double) value).doubleValue();
                }
            }
            totl.setText(String.valueOf(total));
        }
      
   

    }//GEN-LAST:event_deleteActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
         String book_type = (String) combo.getSelectedItem();   
        if(book_type.equals("Study Books"))   {
            showStudyBooks();
        }  
         if(book_type.equals("Other Books")) {
             showotherBooks();
         }  
          if(book_type.equals("All Books")) {
             showAllBooks();
         }   
            
            
        
        
    }//GEN-LAST:event_comboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         RETURN R= new RETURN();
         R.fillbill(user);
         this.setVisible(false);
         R.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
    
     
    }//GEN-LAST:event_comboBoxActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(table.getRowCount()>1){
         
        
        if(jComboBox2.getSelectedItem()=="Borrow"){
            JOptionPane.showMessageDialog(null,"You Can Only Borrow one Book MAX.","Warning",JOptionPane.WARNING_MESSAGE);
            for(int i =table.getRowCount()-1;i>0;i--){
               ((DefaultTableModel)table.getModel()).removeRow(i);}
               double total = 0;
               for (int i = 0; i < table.getRowCount(); i++) {
                Object value = table.getValueAt(i, 2);
                if (value != null) {
                    total += ((Double) value).doubleValue();
                }
            }
            totl.setText(String.valueOf(total));
            }} 
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           JFrame frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to Exit?","Exit",
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            new login().setVisible(true);
            this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton Confirm_order;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel p;
    private javax.swing.JTable table;
    private javax.swing.JLabel totl;
    // End of variables declaration//GEN-END:variables
   public void showAllBooks(){
      try{
          p.removeAll();
          p.revalidate();
          p.repaint();
          p.setLayout(new java.awt.GridLayout(3,3,2,2));
                String query="select * from books";
           conn = DriverManager.getConnection(URL , username, password);

            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(query);
            int rows=0;
            rs.last();
            rows=rs.getRow();
            JLabel[]books=new JLabel[rows];
            rs.beforeFirst();
            while(rs.next()){
            for(int i=0;i<1;i++){
            books[i]=new JLabel(rs.getString("booktitle")+"("+rs.getString("price")+"$"+")",new javax.swing.ImageIcon(getClass().getResource(rs.getString("icon"))),SwingConstants.LEFT);
               books[i].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
               books[i].setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
               books[i].setMinimumSize(new java.awt.Dimension(500, 120));
               books[i].setMaximumSize(new java.awt.Dimension(500, 120));
               books[i].setPreferredSize(new java.awt.Dimension(500, 120));
               books[i].setFont(new java.awt.Font("Verdana Pro Cond",0, 12));
               p.add(books[i]);
   
        }}}
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }  
    }


    private void updatestatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
   public void selectBook() {
      
      

        try
       {  String query="select booktitle FROM books";
           conn = DriverManager.getConnection(URL , username, password);
         
         Statement stmt = conn.createStatement();
         ResultSet result = stmt.executeQuery(query);
             while (result.next()) {
            String name=result.getString("booktitle");
            comboBox.addItem(name);
            }
        } 
        catch (SQLException se) {
            se.printStackTrace();
       
            }}
     public void showStudyBooks(){
      try{
          p.removeAll();
          p.revalidate();
          p.repaint();
          p.setLayout(new java.awt.GridLayout(3,3,2,2));
          String type_of_book="study books";
                String query="select * from books where typeofbook="+"'"+type_of_book+"'";
           conn = DriverManager.getConnection(URL , username, password);

            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(query);
            int rows=0;
            rs.last();
            rows=rs.getRow();
            JLabel[]books=new JLabel[rows];
            rs.beforeFirst();
            while(rs.next()){
            for(int i=0;i<1;i++){
            books[i]=new JLabel(rs.getString("booktitle")+"("+rs.getString("price")+"$"+")",new javax.swing.ImageIcon(getClass().getResource(rs.getString("icon"))),SwingConstants.LEFT);
               books[i].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
               books[i].setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
               books[i].setMinimumSize(new java.awt.Dimension(500, 120));
               books[i].setMaximumSize(new java.awt.Dimension(500, 120));
               books[i].setPreferredSize(new java.awt.Dimension(500, 120));
               books[i].setFont(new java.awt.Font("Verdana Pro Cond",0, 12));
               p.add(books[i]);
   
        }}}
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }  
    }
      public void showotherBooks(){
      try{
          p.removeAll();
          p.revalidate();
          p.repaint();
          p.setLayout(new java.awt.GridLayout(3,3,2,2));
          String type_of_book="other books";
                String query="select * from books WHERE typeofbook="+"'"+type_of_book+"'";
           conn = DriverManager.getConnection(URL , username, password);

            st=conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            rs=st.executeQuery(query);
            int rows=0;
            rs.last();
            rows=rs.getRow();
            JLabel[]books=new JLabel[rows];
            rs.beforeFirst();
            while(rs.next()){
            for(int i=0;i<1;i++){
            books[i]=new JLabel(rs.getString("booktitle")+"("+rs.getString("price")+"$"+")",new javax.swing.ImageIcon(getClass().getResource(rs.getString("icon"))),SwingConstants.LEFT);
               books[i].setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
               books[i].setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
               books[i].setMinimumSize(new java.awt.Dimension(500, 120));
               books[i].setMaximumSize(new java.awt.Dimension(500, 120));
               books[i].setPreferredSize(new java.awt.Dimension(500, 120));
               books[i].setFont(new java.awt.Font("Verdana Pro Cond",0, 12));
               p.add(books[i]);
   
        }}}
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }  
    }
        
      public void borrow(String username){
          try{
        Random r=new Random();
        int x=r.nextInt(5000,9000);
        
        String query2="select * from reader where username='"+username+"'";

        int id=0;
        String book_id=table.getModel().getValueAt(0,1).toString();  
        String book=table.getModel().getValueAt(0,0).toString();  
        String pricee=table.getModel().getValueAt(0,2).toString();  

        Statement st2=conn.createStatement();
        rs=st2.executeQuery(query2);
            rs.next();
            rs.getString("readerID");
            System.out.println(rs.getString("readerID"));
           
        long millis=System.currentTimeMillis();
        java.sql.Date date=new java.sql.Date(millis);
        String query="INSERT into borrow_table(Bill_no,bookID,readerID,Return_date,Borrow_date) VALUES(?,?,?,?,?)";
       
       
        pst=conn.prepareStatement(query);
        pst.setInt(1,x);
        pst.setString(2,book_id);
        pst.setString(3,rs.getString("readerID"));
        pst.setString(4,null);
        pst.setString(5,date.toString());
        pst.executeUpdate();
    //    int bno=bill.getBillNo();
    //
        Statement st3=conn.createStatement();
        ResultSet rs3=st3.executeQuery("Select * from borrow_table");
        while(rs3.next()){
          System.out.println(rs3.getString("Bill_no"));
        }
        b.BorrowBill(x,book,"Borrow bill", date,totl.getText(),pricee);
        b.setVisible(true);
        this.setVisible(false);
                
       
        }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }}
      public void bycard(String username){
        try{
        Random r=new Random();
        int x=r.nextInt(3000,4001);
        String query2="select * from reader where username='"+username+"'";
                System.out.println(user);
                 Statement st2=conn.createStatement();
        rs=st2.executeQuery(query2);
            rs.next();
            rs.getString("readerID");

        int id=0;
         String query="INSERT into buy_table(readerID,Bill_no,Price,Payment_method,purchase_date) VALUES(?,?,?,?,?)";
                 long millis=System.currentTimeMillis();

                java.sql.Date date=new java.sql.Date(millis);

       
        PreparedStatement pst1=conn.prepareStatement(query);
        pst1.setString(1,rs.getString("readerID"));
        pst1.setInt(2,x);
        pst1.setDouble(3,Double.valueOf(totl.getText()));
        pst1.setString(4,"Card");
        pst1.setDate(5,date);
                                pst1.executeUpdate();

         

       
           
            PreparedStatement pst2=conn.prepareStatement("INSERT into billcontents(bookID,Bill_no) VALUES(?,?)");
           
            for (int i =0; i< table.getRowCount() ; i++) {
                //pst2.setInt(1,i+5);
                pst2.setInt(1,Integer.valueOf(table.getModel().getValueAt(i,1).toString()));
                pst2.setInt(2, x);
                pst2.executeUpdate();
                

     }
        String book_id=table.getModel().getValueAt(0,1).toString();  
        String book=table.getModel().getValueAt(0,0).toString();  
        String pricee=table.getModel().getValueAt(0,2).toString();
   
       
        this.setVisible(false);
        new card().setbillno(x,totl.getText());
        }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }}

      
      
      public void bycash(String username){
        try{
        Random r=new Random();
        int x=r.nextInt(3000,4001);
        String query2="select * from reader where username='"+username+"'";
                System.out.println(user);
                 Statement st2=conn.createStatement();
        rs=st2.executeQuery(query2);
            rs.next();
            rs.getString("readerID");

        int id=0;
         String query="INSERT into buy_table(readerID,Bill_no,Price,Payment_method,purchase_date) VALUES(?,?,?,?,?)";
                 long millis=System.currentTimeMillis();

                java.sql.Date date=new java.sql.Date(millis);

       
        PreparedStatement pst1=conn.prepareStatement(query);
        pst1.setString(1,rs.getString("readerID"));
        pst1.setInt(2,x);
        pst1.setDouble(3,Double.valueOf(totl.getText()));
        pst1.setString(4,"Cash");
        pst1.setDate(5,date);
                                pst1.executeUpdate();

         

       
           
            PreparedStatement pst2=conn.prepareStatement("INSERT into billcontents(bookID,Bill_no) VALUES(?,?)");
           
            for (int i =0; i< table.getRowCount() ; i++) {
                //pst2.setInt(1,i+5);
                pst2.setInt(1,Integer.valueOf(table.getModel().getValueAt(i,1).toString()));
                pst2.setInt(2, x);
                pst2.executeUpdate();
                

     }
        String book_id=table.getModel().getValueAt(0,1).toString();  
        String book=table.getModel().getValueAt(0,0).toString();  
        String pricee=table.getModel().getValueAt(0,2).toString();
   
       
        this.setVisible(false);
        bo.BoughtBill(x);
        }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,e.getMessage());
    }}
}
     
