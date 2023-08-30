/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;

/**
 *
 * @author aryam
 */
public class Bill {
    
    private String billNo ="";
    private String date="";
    private String readerID="";
    private String bookTitle="";
    private String bookID="";
    private double price=0.0;
    
    public Bill(String billNo,String date,String readerID,String bookTitle,String bookID,
     double price){
       this.billNo = billNo;
       this.date= date;
       this.readerID= readerID;
       this.bookTitle= bookTitle;
       this.price= price;
     
   }
   public String getBillNo(){
      return billNo;
   }
   public void setBillNo(String billNo){
       this.billNo= billNo;
     
   }
   
   public String getDate(){
      return date;
   }
    public void setDate(String date){
       this.date= date;
     
   }
   
     public String getReaderID(){
      return readerID;
   }
     public void setReaderID(String readerID){
       this.readerID= readerID;
     
   }
       public String getBookTitle(){
      return bookTitle;
   }
      public void setBookTitle(String bookTitle){
       this.bookTitle= bookTitle;
    }
        public String getBookID(){
      return bookID;
   }
     public void setBookID(String bookID){
       this.bookID= bookID;
    }    
         public double getPrice(){
      return price;
   }
          public double setPrice( double price){
      this.price= price;
      return price;
}}
