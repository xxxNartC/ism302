/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author DELL
 */
public class Account {

     private String accountID, userName, password;
     private int accountType;
     private String userInfoId, fotgotPassword;

    public Account() {
    }

    public Account(String accountID, String userName, String password, int accountType, String userInfoId, String fotgotPassword) {
        this.accountID = accountID;
        this.userName = userName;
        this.password = password;
        this.accountType = accountType;
        this.userInfoId = userInfoId;
        this.fotgotPassword = fotgotPassword;
    }

    public String getFotgotPassword() {
        return fotgotPassword;
    }

    public void setFotgotPassword(String fotgotPassword) {
        this.fotgotPassword = fotgotPassword;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccountType() {
        return accountType;
    }

    public void setAccountType(int accountType) {
        this.accountType = accountType;
    }

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

}
