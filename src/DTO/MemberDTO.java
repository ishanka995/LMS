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
public class MemberDTO {
     String BookID;
    String BookName;
    String Birthdate;
    String Age;
    String Email;
    int Telephone;
    String membership;

    public MemberDTO() {
    }

    public MemberDTO(String BookID, String BookName, String Birthdate, String Age, String Email, int Telephone, String membership) {
        this.BookID = BookID;
        this.BookName = BookName;
        this.Birthdate = Birthdate;
        this.Age = Age;
        this.Email = Email;
        this.Telephone = Telephone;
        this.membership = membership;
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

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String Birthdate) {
        this.Birthdate = Birthdate;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
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

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    
    
}
