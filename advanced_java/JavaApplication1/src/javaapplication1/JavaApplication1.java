package javaapplication1;
import java.sql.*;
public class JavaApplication1 {
    public static void main(String[] args) {
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testemp?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","root","tiger");
                Statement pst = con.createStatement();
                String sql = "Select * from employee where empName='Ramesh' and empPass='ram'";
                ResultSet rs = pst.executeQuery(sql);                
                
                if(rs.next()){
                  System.out.println("Login Successful");  
                }
                else{
                  System.out.println("Login failed");
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
    }
    
}
