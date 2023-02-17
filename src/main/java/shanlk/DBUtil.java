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
   
//    public List<Admin> getAdmins(){
//       List<Admin> admins = new ArrayList<>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userType = 'ADMIN'");
//            
//            while(resultSet.next())
//            {
//                Admin adm = new Admin();
//                adm.setUserId(resultSet.getInt("userId"));
//                adm.setfName(resultSet.getString("fName"));
//                adm.setfName(resultSet.getString("fName"));
//                adm.setLname(resultSet.getString("lName"));
//                adm.setDob(resultSet.getString("dob"));
//                adm.setEmail(resultSet.getString("email"));
//                adm.setMobile(resultSet.getInt("mobile"));
//                adm.setNic(resultSet.getString("password"));
//                adm.setBranchId(resultSet.getInt("branchId"));
//                admins.add(adm);
//            }
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//        
//        return admins;
//   }
//
//   public boolean deleteUser(int userId){
//       int rowAffected = 0;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            rowAffected = statement.executeUpdate("DELETE FROM user WHERE userId = '"+userId+"'");
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//       return rowAffected > 0;
//   }
//   
//   public Admin getAdmin(int userId){
//       Admin admin = new Admin();
//         try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userId = '"+userId+"'");
//            
//            resultSet.next();
//            admin.setUserId(resultSet.getInt("userId"));
//            admin.setfName(resultSet.getString("fName"));
//            admin.setLname(resultSet.getString("lName"));
//            admin.setDob(resultSet.getString("dob"));
//            admin.setEmail(resultSet.getString("email"));
//            admin.setMobile(resultSet.getInt("mobile"));
//            admin.setNic(resultSet.getString("nic"));
//            admin.setBranchId(resultSet.getInt("branchId"));
//            admin.setUsername(resultSet.getString("username"));
//            admin.setPassword(resultSet.getString("password"));
//                    
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//        
//        return admin;
//   }
//   
//    public boolean updateAdmin(Admin admin){
//       int rowAffected = 0;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            rowAffected = statement.executeUpdate("UPDATE user SET fName = '"+admin.getfName()+"',lName = '"+admin.getLname()+"',nic = '"+admin.getNic()+"',dob = '"+admin.getDob()+"',email = '"+admin.getEmail()+"',username = '"+admin.getUsername()+"',password = '"+admin.getPassword()+"',mobile = '"+admin.getMobile()+"',branchId = '"+admin.getBranchId()+"' WHERE userId = '"+admin.getUserId()+"'");
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//       return rowAffected > 0;
//   }
//    
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
//   public List<Customer> getCustomers(){
//       List<Customer> customers = new ArrayList<>();
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            Statement statement = conn.createStatement();
//            
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM user WHERE userType = 'CUSTOMER'");
//            
//            while(resultSet.next())
//            {
//                Customer cus = new Customer();
//                cus.setUserId(resultSet.getInt("userId"));
//                cus.setfName(resultSet.getString("fName"));
//                cus.setLname(resultSet.getString("lName"));
//                cus.setAddress1(resultSet.getString("address1"));
//                cus.setAddress2(resultSet.getString("address2"));
//                cus.setEmail(resultSet.getString("email"));
//                cus.setMobile(resultSet.getInt("mobile"));
//                cus.setNic(resultSet.getString("password"));
//                customers.add(cus);
//            }
//        }catch(ClassNotFoundException | SQLException e){
//            System.out.print(e.getMessage());
//        }
//        
//        return customers;
//   }
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
