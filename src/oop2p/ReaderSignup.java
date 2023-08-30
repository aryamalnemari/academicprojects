/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop2p;
import javax.swing.JOptionPane;
import java.util.ArrayList;


import java.util.ArrayList;
//import static oop2p.main.cart;
//import static oop2p.main.Reader;
//import static oop2p.main.readerView;

/**
 *
 * @author aryam
 */
public class ReaderSignup extends javax.swing.JFrame {

    boolean sign_up_flag;
    Reader reader= new Reader();
    public ReaderSignup() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        phone1 = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SimSun-ExtB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Reader Sign up ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 460, 70));

        jPanel3.setBackground(new java.awt.Color(253, 253, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Account Information");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, -1));

        jLabel8.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel8.setText("Username :");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        username.setBackground(new java.awt.Color(253, 253, 243));
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 110, -1));

        jLabel9.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel9.setText("Password :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        pass.setBackground(new java.awt.Color(253, 253, 243));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 90, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 460, 80));

        jPanel2.setBackground(new java.awt.Color(223, 238, 238));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel3.setText("First name:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, -1));

        Fname.setBackground(new java.awt.Color(253, 253, 243));
        Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FnameActionPerformed(evt);
            }
        });
        jPanel2.add(Fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 90, -1));

        jLabel4.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel4.setText("Last name :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 100, -1));

        Lname.setBackground(new java.awt.Color(253, 253, 243));
        jPanel2.add(Lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 100, -1));

        jLabel5.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel5.setText("Reader ID :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        Id.setBackground(new java.awt.Color(253, 253, 243));
        jPanel2.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 90, -1));

        jLabel6.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel6.setText("Gender : ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 70, -1));

        Gender.setBackground(new java.awt.Color(253, 253, 243));
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));
        jPanel2.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 460, 110));

        jPanel4.setBackground(new java.awt.Color(229, 229, 218));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Contact Information");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 220, 30));

        jLabel11.setFont(new java.awt.Font("SimSun", 0, 14)); // NOI18N
        jLabel11.setText("Email :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        email.setBackground(new java.awt.Color(253, 253, 243));
        jPanel4.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 180, -1));

        jLabel12.setFont(new java.awt.Font("SimSun", 0, 12)); // NOI18N
        jLabel12.setText("Phone number : ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        phone1.setBackground(new java.awt.Color(253, 253, 243));
        phone1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone1ActionPerformed(evt);
            }
        });
        jPanel4.add(phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 170, -1));

        signup.setBackground(new java.awt.Color(194, 194, 170));
        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel4.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        cancel.setBackground(new java.awt.Color(194, 194, 170));
        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel4.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 460, 170));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oop2p/biggerframe.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
    sign_up_flag = true;
        ArrayList<String> wrong = new ArrayList<>();
       char[] ph=phone1.getText().toCharArray();
       char[] fn=Fname.getText().toCharArray();
       char[] ln=Lname.getText().toCharArray();
       char[] rid=Id.getText().toCharArray();
        if (Fname.getText().equals("")) {
            wrong.add("First Name is Empty");
            sign_up_flag = false;
        }
        else{
            for(char c:fn){
                    if(!Character.isLetter(c)){
                        sign_up_flag=false;
                    wrong.add("First name should contains only  Letters");
                    break;
                    }}
        }
        
       
        if (Lname.getText().equals("")) {
            wrong.add("Last Name is Empty");
            sign_up_flag = false;
        }
        else{
            for(char c:ln){
                    if(!Character.isLetter(c)){
                        sign_up_flag=false;
                    wrong.add("last name should contains only  Letters");
                    break;
                    }}
        }
        

        if (email.getText().equals("")) {
            wrong.add("Email is Empty");
            sign_up_flag = false;
        } else {
            if (!((email.getText().contains("@"))&&(email.getText().endsWith(".com")))){ 
            sign_up_flag=false;
            
                wrong.add("Wrong formatted email");
        
            }}
        
        if (phone1.getText().equals("")) {
            wrong.add("phone number is Empty");
            sign_up_flag = false;
        } else if (!((phone1.getText().startsWith("0"))&&(phone1.getText().length() == 10))) {
               sign_up_flag = false;
                wrong.add("wrong phone number, start with 0 and has 10 number");}
                
            
        else{ for(char c:ph){
                    if(!Character.isDigit(c)){
                       sign_up_flag=false;
                    wrong.add("phone number should contains only numbers");
                    break;
                    }}
            
            
        }
         if (Id.getText().equals("")) {
            wrong.add("reader Id number is Empty");
            sign_up_flag = false;
         }else{
            if(! (reader.is_id_exist(Id.getText()) == 0)){
                  wrong.add("Id already exist");
                  sign_up_flag = false;
            }
         else for(char c:rid){
                    if(!Character.isDigit(c)){
                       sign_up_flag=false;
                    wrong.add("phone number should contains only numbers");
                    break;
                    }}}
        

        if (username.getText().equals("")) {
            wrong.add("username is Empty");
            sign_up_flag = false;
        }else{
            if(! (reader.is_username_exist(username.getText()) == 0)){
                  wrong.add("username already exist");
                  sign_up_flag = false;
            }
        }
        if (pass.getText().equals("")) {
            wrong.add("password is Empty");
            sign_up_flag = false;
        }
        else if(!(pass.getText().length()>=8)){
            wrong.add("password is weak");
            sign_up_flag = false;
        }
                
        if (sign_up_flag) {
            
            
             reader.insert_reader(Fname.getText(), Lname.getText(),  email.getText(),
                          Id.getText(), phone1.getText(), (String) Gender.getSelectedItem(),
                          username.getText(), pass.getText());
                  JFCart j=new JFCart();
                  j.setusername(username.getText());
                   JOptionPane.showMessageDialog(this, "Welcome To wise Books Library " + Fname.getText(), "Thank you", JOptionPane.PLAIN_MESSAGE);
         new JFCart().setVisible(true);
         this.setVisible(false);
         //readerView.setVisible(true);
         //cart.selectBook();
                  
        }
        else {
            String str = "Please fix the following:";
            for (int i = 0; i < wrong.size(); i++) {
                str += ("\n" + (1 + i) + " ." + wrong.get(i));
            }
            JOptionPane.showMessageDialog(this, str, "warning", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_signupActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
          StartPage s= new StartPage();
          s.setVisible(true);
          this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void phone1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone1ActionPerformed

    private void FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FnameActionPerformed

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
            java.util.logging.Logger.getLogger(ReaderSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReaderSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReaderSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReaderSignup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReaderSignup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Fname;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Lname;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phone1;
    private javax.swing.JButton signup;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
