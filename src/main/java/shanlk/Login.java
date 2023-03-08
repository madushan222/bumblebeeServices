/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class Login {
       private String userName,password,userType;
       int userID;
    
    public Login() {
        this.userName = "";
        this.password = "";
        this.userType = "";
        this.userID = 0;
    }

    public Login(String userName, String password, String userType, int userID) {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.userID = userID;
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

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
