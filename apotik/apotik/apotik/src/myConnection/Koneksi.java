/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myConnection;
import java.sql.*;
/**
 *
 * @author MyBook Hype AMD
 */
public class Koneksi {
    public Connection getConnection() throws ClassNotFoundException{
        Connection cn = null;
        try{
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            
            String db = "apotek";
            String sv = "jdbc:mysql://localhost:3306/"+db;
            
            cn = DriverManager.getConnection(sv, "root", "");
            return cn;
        }
        
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
        
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    
    }
    
}
