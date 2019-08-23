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
public class BookDTO {

    private String BOOK_ID;
    private String Book_Name;
    private String Author;
    private String ISBN_No;
    private String Publisher;
    private String Rack;
    private String colomn;
    private String row;
    private String Donation;
    private String DonatorName;
    private String DonatorEmail;
    private String DonatorMobile;

    public BookDTO() {
    }

    public BookDTO(String BOOK_ID, String Book_Name, String Author, String ISBN_No, String Publisher, String Rack, String colomn, String row, String Donation, String DonatorName, String DonatorEmail, String DonatorMobile) {
        this.BOOK_ID = BOOK_ID;
        this.Book_Name = Book_Name;
        this.Author = Author;
        this.ISBN_No = ISBN_No;
        this.Publisher = Publisher;
        this.Rack = Rack;
        this.colomn = colomn;
        this.row = row;
        this.Donation = Donation;
        this.DonatorName = DonatorName;
        this.DonatorEmail = DonatorEmail;
        this.DonatorMobile = DonatorMobile;
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

    public String getRack() {
        return Rack;
    }

    public void setRack(String Rack) {
        this.Rack = Rack;
    }

    public String getColomn() {
        return colomn;
    }

    public void setColomn(String colomn) {
        this.colomn = colomn;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getDonation() {
        return Donation;
    }

    public void setDonation(String Donation) {
        this.Donation = Donation;
    }

    public String getDonatorName() {
        return DonatorName;
    }

    public void setDonatorName(String DonatorName) {
        this.DonatorName = DonatorName;
    }

    public String getDonatorEmail() {
        return DonatorEmail;
    }

    public void setDonatorEmail(String DonatorEmail) {
        this.DonatorEmail = DonatorEmail;
    }

    public String getDonatorMobile() {
        return DonatorMobile;
    }

    public void setDonatorMobile(String DonatorMobile) {
        this.DonatorMobile = DonatorMobile;
    }

}
