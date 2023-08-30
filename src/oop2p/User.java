/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author aryam
 */
public class User {
    public static String ID;
    private String fname;
    private String lname;
    private String phonenum;
    private String email;
    public char gender;
    public static String username;
    private String password;
    Connection con=main.CreateConnection();
    Statement s;
    ResultSet rs;
    PreparedStatement st;
    ResultSet rs2;
    public User(){
        ID="";
        fname="";
        lname="";
       phonenum="";
       email="";
       gender='0';
        username="";
        password="";
    }
    public User(String ID,String fname,String lname,String phonenum,String email,char gender,String username,String password){
        this.ID=ID;
        this.fname=fname;
        this.lname=lname;
        this.phonenum=phonenum;
        this.email=email;
        this.gender=gender;
        this.username=username;
        this.password=password;
}
    public String getID(){
        return this.ID;
    }
    
    public void setID(String ID){
        this.ID=ID;}
     
   public String getfname(){
       return fname;
   }
   
    public void setfname(String fname){
        this.fname=fname;}
   
    public String getlname(){
       return lname;
   }
   
    public void setlname(String lname){
        this.lname=lname;
}
    public String getphonenum(){
       return phonenum;
   }
   
    public void setphonenum(String phonenum){
        this.phonenum=phonenum;}
    
    public String getemail(){
       return email;
   }
   
    public void setemail(String email){
        this.email=email;}
    
    public void setgender(char gender){
        this.gender=gender;
    }
    
   public String getusername(){
       return username;
   }
   
    public void setusername(String username){
        this.username=username;}
   
    public String getpassword(){
       return password;
   }
   
    public void setpassword(String password){
        this.password=password;}

    public void Roletype(String username,String pass,String role,JFrame login){
    try{
           if(role.equals("Admin")){
        String query="select username from admin";
        Boolean found=false;
            s=con.createStatement();
            rs=s.executeQuery(query);
            while(rs.next()){
            if(username.equals(rs.getString("username"))){
            found=true;
           
            String q="select username,Passwords from admin where username='"+username+"'";
            st=con.prepareStatement(q);
            rs2=st.executeQuery();
            while(rs2.next()){
            if(pass.equals(rs2.getString("Passwords"))){
                    JOptionPane.showMessageDialog(null,"Welcome Back Admin:"+username);
                    new AdminView().setVisible(true);
                    login.setVisible(false);
            }
            else if(!pass.equals(rs2.getString("Passwords"))){
                JOptionPane.showMessageDialog(null,"You've entered wrong information, please try again","Failed to login",JOptionPane.ERROR_MESSAGE);
                }} break;}
            if(!username.equals(rs.getString("username"))){
                found=false;

            }}
            if(!found){
            JOptionPane.showMessageDialog(null,"You've entered wrong information, please try again","Failed to login",JOptionPane.ERROR_MESSAGE);

            }}
        if(role.equals("Reader")){
        String query="select username from reader";
        Boolean found=false;
            s=con.createStatement();
            rs=s.executeQuery(query);
            while(rs.next()){
            if(username.equals(rs.getString("username"))){
            found=true;
           
            String q="select username,Passwords from reader where username='"+username+"'";
            st=con.prepareStatement(q);
            rs2=st.executeQuery();
            while(rs2.next()){
            if(pass.equals(rs2.getString("Passwords"))){
                    JOptionPane.showMessageDialog(null,"Welcome Back Reader:"+username);
                    new JFCart().setVisible(true);
                    login.setVisible(false);
            }
            else if(!pass.equals(rs2.getString("Passwords"))){
                JOptionPane.showMessageDialog(null,"You've entered wrong information, please try again","Failed to login",JOptionPane.ERROR_MESSAGE);
                }} break;}
            if(!username.equals(rs.getString("username"))){
                found=false;

            }}
            if(!found){
            JOptionPane.showMessageDialog(null,"You've entered wrong information, please try again","Failed to login",JOptionPane.ERROR_MESSAGE);

            }}}
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
   
    }
    @Override
    public String toString(){
        return"first name:"+fname+"last name:"+lname+"phone number:"+phonenum+"Email:"+email+"Gender"+gender+"username:"+username+"password:"+password;
    }


}

