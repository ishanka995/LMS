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
public class LoginDetails {
    String userName;
    String Password;

    public LoginDetails() {
    }

    public LoginDetails(String userName, String Password) {
        this.userName = userName;
        this.Password = Password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
}
