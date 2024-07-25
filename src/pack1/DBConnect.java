/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Windows 10 Pro
 */
public class DBConnect {
    
    public static Connection getConnection() {
        try{
            Connection cons = null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cons = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLKH;user=sa;password=123456;encrypt=false");
            return cons;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
      
    }
    
    public static void main(String[] args) throws SQLException {
        Connection c = getConnection();
        System.out.print(c.toString());
        c.close();
    }
}
