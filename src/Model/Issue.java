/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Max point galgamuwa
 */
public class Issue {
    String IssueID;
    String MemberID;
    String MemberName;
    String Birthdate;
    String Email;
    String Telephone;
    String BookID;
    String BookName;
    String Author;
    String ISBNNo;
    String Publisher;
    String IssueDate;
    String ReturnDate;

    public Issue() {
    }

    public Issue(String IssueID, String MemberID, String MemberName, String Birthdate, String Email, String Telephone, String BookID, String BookName, String Author, String ISBNNo, String Publisher, String IssueDate, String ReturnDate) {
        this.IssueID = IssueID;
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.Birthdate = Birthdate;
        this.Email = Email;
        this.Telephone = Telephone;
        this.BookID = BookID;
        this.BookName = BookName;
        this.Author = Author;
        this.ISBNNo = ISBNNo;
        this.Publisher = Publisher;
        this.IssueDate = IssueDate;
        this.ReturnDate = ReturnDate;
    }

    public String getIssueID() {
        return IssueID;
    }

    public void setIssueID(String IssueID) {
        this.IssueID = IssueID;
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getISBNNo() {
        return ISBNNo;
    }

    public void setISBNNo(String ISBNNo) {
        this.ISBNNo = ISBNNo;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public String getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(String ReturnDate) {
        this.ReturnDate = ReturnDate;
    }
    
    
    
}
