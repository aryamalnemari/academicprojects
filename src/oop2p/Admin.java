/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;
import java.io.File;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author aryam
 */
public class Admin extends User {
    Connection con;
    PreparedStatement st;
    ResultSet rs;
    Statement st2;
    Connection con3;
    PreparedStatement ps;
    ResultSet rs3;
    
    public static JFileChooser chooser;
    public static File file;
    public static String path;
    private double salary;
    private  String address;
   static boolean flag;
   public Admin(){
       super();
       salary=0.0;
       address="";
   }
    public Admin (String ID,String fname,String lname,String phonenum,String email,char gender,String username,String password,double salary,String address){
        super(ID,fname,lname,phonenum,email,gender,username,password);
        this.address=address;
        this.salary=0.0;
    }        
    
   public String getaddress(){
        return this.address;
    }
    
    public void setaddress(String address){
        this.address=address;}
     
   public double getsalary(){
       return salary;
   }
   
    public void setsalary(double salary){
        this.salary=salary;}
    
//    public void checkAdmin(String username,String password,JFrame login){
//        
//        try {
//            String q="select username,Passwords from admin where username='"+username+"'";
//            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prooop","root","your password");
//            st=con.prepareStatement(q);
//            rs=st.executeQuery();
//            while(rs.next()){
//                if(password.equals(rs.getString("Passwords"))){
//                    JOptionPane.showMessageDialog(null,"Welcome Back Admin:"+username);
//                    new AdminView().setVisible(true);
//                    login.setVisible(false);
//                }
//                else if(!password.equals(rs.getString("Passwords"))) {
//                JOptionPane.showMessageDialog(null,"You've entered the wrong Password, please try again","Failed to login",JOptionPane.ERROR_MESSAGE);
//                }
//             
//        }}
//        
//        catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,ex.getMessage());
//        }
//    }
    public String addCover(JLabel Bookcov){
//        try {
           
       
         chooser=new JFileChooser();
        chooser.showOpenDialog(null);
         file=chooser.getSelectedFile();
        //file=chooser.getSelectedFile();
        path=file.getAbsolutePath();

     //   System.out.print(path);
        Image im=Toolkit.getDefaultToolkit().createImage(path);
        im=im.getScaledInstance(61, 100, Image.SCALE_SMOOTH);
        ImageIcon i=new ImageIcon(im);
        Bookcov.setIcon(i);
        //if(id!=null){
//         PreparedStatement t=con.prepareStatement("update book_table set cover=? where bood_id=?");
//         t.setString(1,path.toString());
//         t.setString(2,String.valueOf(id));
       
//        } catch (SQLException e) {
//        JOptionPane.showMessageDialog(null,e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
//        }
     return path;
    }
    public void addBook(JTextField t,JTextField bi,JTextField y,JTextField s,JTextField b,JTextField ty,JTextField a,JTextField pr,JTextField rat,JLabel Bookcov,JTable bookTable,String path){
        try{
            PreparedStatement insertSt=con.prepareStatement("INSERT INTO books(booktitle,bookID,yaer,section,branch,typeofbook,autor,price,rating,icon) VALUES(?,?,?,?,?,?,?,?,?,?)");
            insertSt.setString(1,t.getText());
            insertSt.setString(2,bi.getText());
            insertSt.setInt(3,Integer.valueOf(y.getText()));
            insertSt.setString(4,s.getText());
            insertSt.setString(5,b.getText());
            insertSt.setString(6,ty.getText());
            insertSt.setString(7,a.getText());
            insertSt.setInt(8,Integer.valueOf(pr.getText()));
            insertSt.setInt(9,Integer.valueOf(rat.getText()));
            insertSt.setString(10,path);
            insertSt.executeUpdate();
            JOptionPane.showMessageDialog(null,"Book is Added!");
            fillTable(bookTable);
        } 
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERORR",JOptionPane.ERROR_MESSAGE); }
        catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),"ERORR",JOptionPane.ERROR_MESSAGE);
        }}
    public void deleteBook(JTextField t,JTextField bi,JTextField y,JTextField s,JTextField b,JTextField ty,JTextField a,JTextField pr,JTextField rat,JLabel Bookcov,JTable bookTable){
        try{
        int answer= JOptionPane.showConfirmDialog(null,"are you sure you want to delete this Book?","delete record",JOptionPane.YES_NO_OPTION);
             if(answer==JOptionPane.YES_OPTION)
             {
            String sql="delete from books where bookID=" +bi.getText();
            int rows=st2.executeUpdate(sql);
            if (rows==1)
                JOptionPane.showMessageDialog(null,"The book has been deleted successfully!");
            t.setText("");
            bi.setText("");
            y.setText("");
            s.setText("");
            b.setText("");
            ty.setText("");
            a.setText("");
            pr.setText("");
            rat.setText("");
            Bookcov.setIcon(null);
            fillTable(bookTable);
        }}
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
                }
    }
    public void updateBook(JTextField t,JTextField bi,JTextField y,JTextField s,JTextField b,JTextField ty,JTextField a,JTextField pr,JTextField rat,JTable bookTable){
        try{
            PreparedStatement updateSt;
            
         updateSt=con.prepareStatement("Update books set booktitle=?,yaer=?,section=?,branch=?,typeofbook=?,autor=?,price=?,rating=? where bookID=?");
            updateSt.setString(1,t.getText());
            updateSt.setInt(2,Integer.valueOf(y.getText()));
            updateSt.setString(3,s.getText());
            updateSt.setString(4,b.getText());
            updateSt.setString(5,ty.getText());
            updateSt.setString(6,a.getText());
            updateSt.setInt(7,Integer.valueOf(pr.getText()));
            updateSt.setInt(8,Integer.valueOf(rat.getText()));
            updateSt.setInt(9,Integer.valueOf(bi.getText()));
            
            

       
      //  path=file.getAbsolutePath();

      //  up.setString(8,);

   //     up.setString(8,addCover(cc));
        int updater=updateSt.executeUpdate();
        if(updater>0){
            JOptionPane.showMessageDialog(null, "The book has been updated successfully");
        }
        else{
       JOptionPane.showMessageDialog(null, "Book ID cannot be Updated");
        }
        fillTable(bookTable);
    }
       catch(SQLException e){
                  JOptionPane.showMessageDialog(null, e.getMessage());

               
                }
    }
    public void fillTable(JTable booktable){
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prooop","root","123456aryamSs");
            st2=con.createStatement();
            rs=st2.executeQuery("select * from books");
            booktable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }}
    public void booksinfo(JTextField t,JTextField bi,JTextField y,JTextField s,JTextField b,JTextField ty,JTextField a,JTextField pr,JTextField rat,JLabel Bookcov,JTable bookTable){
        try{
            int row=bookTable.getSelectedRow();
            String tableClickID=bookTable.getModel().getValueAt(row,1).toString();
            String sql="select * from books where bookID="+tableClickID;
            rs=st2.executeQuery(sql);
            rs.next();
            t.setText(rs.getString("booktitle"));
            bi.setText(rs.getString("bookID"));
            y.setText(rs.getString("yaer"));
            s.setText(rs.getString("section"));
            b.setText(rs.getString("branch"));
            ty.setText(rs.getString("typeofbook"));
            a.setText(rs.getString("autor"));
            pr.setText(rs.getString("price"));
            rat.setText(rs.getString("rating"));
            ImageIcon ico=new javax.swing.ImageIcon(getClass().getResource(rs.getString("icon")));
            Bookcov.setIcon(ico);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
    }
    public int ifbookexist(String id) {
           
            String query = "SELECT * FROM books WHERE bookID  = '" + id + "'";
            try {
                con3=main.CreateConnection();
                ps = con3.prepareStatement(query);
                rs3 = ps.executeQuery();
                if (rs3.next()) {
                    return 1; // it exists
                } else {
                    return 0; // does not exist
            }

            } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null , ex);
            }
            finally{
             if (rs3!=null){
             try{rs3.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}}
             if (ps!=null){
             try{ps.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}}
            if (con3!=null){
             try{con3.close();
             }catch(SQLException e){
                            JOptionPane.showMessageDialog(null, e.getMessage());}}}
            return -2;
         
        }
    

   
    
    @Override 
    public String toString(){
       return super.toString()+"address"+address+"salary"+salary;
    }
}
