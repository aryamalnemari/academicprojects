/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop2p;

/**
 *
 * @author ghala
 */
public class StudyBooks extends Books {
    private static String subject;
    
    public StudyBooks(String bookID, String booktitle, String section, String branch, String typeofbook, String autor, int price, int rating, int year, String edition, String status,String subject) {
        super(bookID, booktitle, section, branch, typeofbook, autor, price, rating, year, edition, status);
        subject="";
    }
     
    public void setsubject(String subject) {
        this.subject = subject;
    }

  public String getSubject() {
        return subject;
    }
    
   public void getStudyBookFeild(){}
    
    
}
