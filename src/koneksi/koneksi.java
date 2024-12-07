/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;

/**
 *
 * @author lenovo
 */
public class koneksi {
    public Connection getConnection () throws SQLException
    
    {
        Connection cn = null;
        try
        {
            String db = "db_apotek";
            String sv = "jdbc:mysql://localhost:3306/"+db;
            String driver = "com.mysql.jdbc.Driver";
            
            Class.forName(driver);
            cn = DriverManager.getConnection(sv, "root","");
            return cn;
        }
        catch (SQLException s)
        {
            System.out.println("Eksepsi SQL : " + s.getMessage());
            return null;
        }
        catch (Exception e)
        {
            System.out.println("Exsepsi : " + e.getMessage());
            return null;
        }
    }

}
    

