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
public class Member {

    private String Member_ID;
    private String Member_Name;
    private String BirthDate;
    private String Email;
    private String TelePhone_No;

    public Member() {
    }

    public Member(String Member_ID, String Member_Name, String BirthDate, String Email, String TelePhone_No) {
        this.Member_ID = Member_ID;
        this.Member_Name = Member_Name;
        this.BirthDate = BirthDate;
        this.Email = Email;
        this.TelePhone_No = TelePhone_No;

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

}
