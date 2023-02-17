/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

/**
 *
 * @author shanr
 */
public class User {
    private String fName,mName,lName,nic,dob,address1,address2,address3,email,userType,username,password;
    private int mobile;

    public User() {
        this.fName = "";
        this.mName = "";
        this.lName = "";
        this.nic = "";
        this.dob = "";
        this.address1 = "";
        this.address2 = "";
        this.address3 = "";
        this.email = "";
        this.userType = "";
        this.username = "";
        this.password = "";
        this.mobile = 0;
    }
    
    public User(String fName, String mName, String lName, String nic, String dob, String address1, String address2, String address3, String email, String userType, String username, String password, int mobile) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
        this.nic = nic;
        this.dob = dob;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.email = email;
        this.userType = userType;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    
    
}
