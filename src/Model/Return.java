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
public class Return {

    private String BOOK_ID;
    private String Book_Name;
    private String Author;
    private String ISBN_No;
    private String Publisher;
    private String MemberID;
    private String MemberName;
    private String Birthdate;
    private String Email;
    private int Telephone;
    private String IssueID;
    private String IssueDate;
    private String Datetoreturn;
    private String returnDate;
    private String returnID;

    public Return() {
    }

    public Return(String BOOK_ID, String Book_Name, String Author, String ISBN_No, String Publisher, String MemberID, String MemberName, String Birthdate, String Email, int Telephone, String IssueID, String IssueDate, String Datetoreturn, String returnDate, String returnID) {
        this.BOOK_ID = BOOK_ID;
        this.Book_Name = Book_Name;
        this.Author = Author;
        this.ISBN_No = ISBN_No;
        this.Publisher = Publisher;
        this.MemberID = MemberID;
        this.MemberName = MemberName;
        this.Birthdate = Birthdate;
        this.Email = Email;
        this.Telephone = Telephone;
        this.IssueID = IssueID;
        this.IssueDate = IssueDate;
        this.Datetoreturn = Datetoreturn;
        this.returnDate = returnDate;
        this.returnID = returnID;
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

    public int getTelephone() {
        return Telephone;
    }

    public void setTelephone(int Telephone) {
        this.Telephone = Telephone;
    }

    public String getIssueID() {
        return IssueID;
    }

    public void setIssueID(String IssueID) {
        this.IssueID = IssueID;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String IssueDate) {
        this.IssueDate = IssueDate;
    }

    public String getDatetoreturn() {
        return Datetoreturn;
    }

    public void setDatetoreturn(String Datetoreturn) {
        this.Datetoreturn = Datetoreturn;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getReturnID() {
        return returnID;
    }

    public void setReturnID(String returnID) {
        this.returnID = returnID;
    }
    
    

}
