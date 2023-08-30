/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;

/**
 *
 * @author aryam
 */
public class BorrowBills {
    
    private String returnedBooks;
    private String dueDate;
   
    public BorrowBills(){
        this.dueDate= dueDate;
        this.returnedBooks=returnedBooks;
    }
    public String getReturnedBooks(){
        return this.returnedBooks;
    }
    public String getDueDate(){
        return this.dueDate;
    }
     @Override
    public String toString(){
       return super.toString()+"due Date"+dueDate +"returned books:"+returnedBooks;
    }
   
}
    

