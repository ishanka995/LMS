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
public class Donator {
    
    String DonationID;
    String DonatorName;
    String Telephone;
    String Email;
    String BookName;
    String ISBNNO;
    String Publisher;
    String BookPrice;

    public Donator() {
    }

    public Donator(String DonationID, String DonatorName, String Telephone, String Email, String BookName, String ISBNNO, String Publisher, String BookPrice) {
        this.DonationID = DonationID;
        this.DonatorName = DonatorName;
        this.Telephone = Telephone;
        this.Email = Email;
        this.BookName = BookName;
        this.ISBNNO = ISBNNO;
        this.Publisher = Publisher;
        this.BookPrice = BookPrice;
    }

    public String getDonationID() {
        return DonationID;
    }

    public void setDonationID(String DonationID) {
        this.DonationID = DonationID;
    }

    public String getDonatorName() {
        return DonatorName;
    }

    public void setDonatorName(String DonatorName) {
        this.DonatorName = DonatorName;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getISBNNO() {
        return ISBNNO;
    }

    public void setISBNNO(String ISBNNO) {
        this.ISBNNO = ISBNNO;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public String getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(String BookPrice) {
        this.BookPrice = BookPrice;
    }
    
    
}
