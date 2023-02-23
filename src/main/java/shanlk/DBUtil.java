/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shanlk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shanr
 */
public class DBUtil {
   static final String DB_URL = "jdbc:mysql://localhost/bumble_bee?allowPublicKeyRetrieval=true&useSSL=false";
   static final String USER = "root";
   static final String PASS = "";
   
   public boolean addUser(User user){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("INSERT INTO user (fName,mName,lName,dob,nic,address1,address2,address3,email,mobile,userType,username,password) VALUES ('"+user.getfName()+"','"+user.getmName()+"','"+user.getlName()+"','"+user.getDob()+"','"+user.getNic()+"','"+user.getAddress1()+"','"+user.getAddress2()+"','"+user.getAddress3()+"','"+user.getEmail()+"','"+user.getMobile()+"','"+user.getUserType()+"','"+user.getUsername()+"','"+user.getPassword()+"')");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
   
    public Login Login(Login login){
       Login lg = new Login();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE username = '"+login.getUserName()+"' AND password = '"+login.getPassword()+"'");
            
            if(resultSet.next())
            {
              lg.setUserType(resultSet.getString("userType"));
            }
            else
            {
              lg.setUserType("NONE");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return lg;
   }
   
    public List<User> getAdmins(){
       List<User> admins = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userType = 'A'");
            
            while(resultSet.next())
            {
                User adm = new User();
                adm.setUserId(resultSet.getInt("userId"));
                adm.setfName(resultSet.getString("fName"));
                adm.setmName(resultSet.getString("mName"));
                adm.setlName(resultSet.getString("lName"));
                adm.setDob(resultSet.getString("dob"));
                adm.setNic(resultSet.getString("nic"));
                adm.setEmail(resultSet.getString("email"));
                adm.setMobile(resultSet.getInt("mobile"));
                admins.add(adm);
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        
        return admins;
   }

   public boolean deleteUser(int userId){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("DELETE FROM user WHERE userId = '"+userId+"'");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
   
   public User getAdmin(int userId){
       User admin = new User();
         try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userId = '"+userId+"'");
            
            resultSet.next();
            admin.setUserId(resultSet.getInt("userId"));
            admin.setfName(resultSet.getString("fName"));
            admin.setmName(resultSet.getString("mName"));
            admin.setlName(resultSet.getString("lName"));
            admin.setDob(resultSet.getString("dob"));
            admin.setNic(resultSet.getString("nic"));
            admin.setAddress1(resultSet.getString("address1"));
            admin.setAddress2(resultSet.getString("address2"));
            admin.setAddress3(resultSet.getString("address3"));
            admin.setEmail(resultSet.getString("email"));
            admin.setMobile(resultSet.getInt("mobile"));
            admin.setNic(resultSet.getString("nic"));
            admin.setUsername(resultSet.getString("username"));
            admin.setPassword(resultSet.getString("password"));
                    
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        
        return admin;
   }
   
    public boolean updateAdmin(User admin){
       int rowAffected = 0;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            rowAffected = statement.executeUpdate("UPDATE user SET fName = '"+admin.getfName()+"',mName = '"+admin.getmName()+"',lName = '"+admin.getlName()+"',dob = '"+admin.getDob()+"',nic = '"+admin.getNic()+"',address1 = '"+admin.getAddress1()+"',address2 = '"+admin.getAddress2()+"',address3 = '"+admin.getAddress3()+"',email = '"+admin.getEmail()+"',mobile = '"+admin.getMobile()+"',username = '"+admin.getUsername()+"',password = '"+admin.getPassword()+"' WHERE userId = '"+admin.getUserId()+"'");
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
       return rowAffected > 0;
   }
    
//    public boolean addCustomer(Customer customer){
//       int rowAffected = 0;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            rowAffected = statement.executeUpdate("INSERT INTO user (fName,lName,nic,email,address1,address2,username,password,userType,mobile) VALUES ('"+customer.getfName()+"','"+customer.getLname()+"','"+customer.getNic()+"','"+customer.getEmail()+"','"+customer.getAddress1()+"','"+customer.getAddress2()+"','"+customer.getUsername()+"','"+customer.getPassword()+"','CUSTOMER','"+customer.getMobile()+"')");
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//       return rowAffected > 0;
//   }
//    
   public List<User> getCustomers(){
       List<User> customers = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
            
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userType = 'C'");
            
            while(resultSet.next())
            {
                User cus = new User();
                cus.setUserId(resultSet.getInt("userId"));
                cus.setfName(resultSet.getString("fName"));
                cus.setmName(resultSet.getString("mName"));
                cus.setlName(resultSet.getString("lName"));
                cus.setDob(resultSet.getString("dob"));
                cus.setNic(resultSet.getString("nic"));
                cus.setEmail(resultSet.getString("email"));
                cus.setMobile(resultSet.getInt("mobile"));
                cus.setAddress1(resultSet.getString("address1"));
                cus.setAddress2(resultSet.getString("address2"));
                cus.setAddress3(resultSet.getString("address3"));
                customers.add(cus);
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.print(e.getMessage());
        }
        
        return customers;
   }
//   
//    public Customer getCustomer(int userId){
//       Customer customer = new Customer();
//         try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userId = '"+userId+"'");
//            
//            resultSet.next();
//            customer.setUserId(resultSet.getInt("userId"));
//            customer.setfName(resultSet.getString("fName"));
//            customer.setLname(resultSet.getString("lName"));
//            customer.setAddress1(resultSet.getString("address1"));
//            customer.setAddress2(resultSet.getString("address2"));
//            customer.setEmail(resultSet.getString("email"));
//            customer.setMobile(resultSet.getInt("mobile"));
//            customer.setNic(resultSet.getString("nic"));
//            customer.setUsername(resultSet.getString("username"));
//            customer.setPassword(resultSet.getString("password"));
//                    
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//        
//        return customer;
//   }
//    
//    public boolean updateCustomer(Customer customer){
//       int rowAffected = 0;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            rowAffected = statement.executeUpdate("UPDATE user SET fName = '"+customer.getfName()+"',lName = '"+customer.getLname()+"',nic = '"+customer.getNic()+"',address1 = '"+customer.getAddress1()+"',address2 = '"+customer.getAddress2()+"',email = '"+customer.getEmail()+"',username = '"+customer.getUsername()+"',password = '"+customer.getPassword()+"',mobile = '"+customer.getMobile()+"' WHERE userId = '"+customer.getUserId()+"'");
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//       return rowAffected > 0;
//   }
   
}
