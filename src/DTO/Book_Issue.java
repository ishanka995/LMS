/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Max point galgamuwa
 */
public class Book_Issue {

    private String BOOK_ID;
    private String Book_Name;
    private String Author;
    private String ISBN_No;
    private String Publisher;
    private String Member_ID;
    private String Member_Name;
    private String BirthDate;
    private String Email;
    private String TelePhone_No;
    private String IssueDate;
    private String issueID;

    public Book_Issue() {
    }

    public Book_Issue(String BOOK_ID, String Book_Name, String Author, String ISBN_No, String Publisher, String Member_ID, String Member_Name, String BirthDate, String Email, String TelePhone_No, String IssueDate, String issueID) {
        this.BOOK_ID = BOOK_ID;
        this.Book_Name = Book_Name;
        this.Author = Author;
        this.ISBN_No = ISBN_No;
        this.Publisher = Publisher;
        this.Member_ID = Member_ID;
        this.Member_Name = Member_Name;
        this.BirthDate = BirthDate;
        this.Email = Email;
        this.TelePhone_No = TelePhone_No;
        this.IssueDate = IssueDate;
        this.issueID = issueID;
    }

    public String getBOOK_ID() {
        return BOOK_ID;
    }

    public void setBOOK_ID(String BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    public String getBook_Name() {
        return Book_Name;
    }

    public void setBook_Name(String Book_Name) {
        this.Book_Name = Book_Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getISBN_No() {
        return ISBN_No;
    }

    public void setISBN_No(String ISBN_No) {
        this.ISBN_No = ISBN_No;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getMember_ID() {
        return Member_ID;
    }

    public void setMember_ID(String Member_ID) {
        this.Member_ID = Member_ID;
    }

    public String getMember_Name() {
        return Member_Name;
    }

    public void setMember_Name(String Member_Name) {
        this.Member_Name = Member_Name;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelePhone_No() {
        return TelePhone_No;
    }

    public void setTelePhone_No(String TelePhone_No) {
        this.TelePhone_No = TelePhone_No;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public String getIssueID() {
        return issueID;
    }

    public void setIssueID(String issueID) {
        this.issueID = issueID;
    }
   

   

  
   

}
