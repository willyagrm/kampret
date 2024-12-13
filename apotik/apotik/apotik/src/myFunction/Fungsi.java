/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myFunction;
import java.sql.*;
import myConnection.Koneksi;
/**
 *
 * @author MyBook Hype AMD
 */
public class Fungsi {
    static Connection Cnn;
    static Koneksi db = new Koneksi();
    static Statement st;
    static int i;
    
    public static int EQuery (String sql) throws SQLException{
        i = 0;
        try
        {
            Cnn = db.getConnection();
            st = Cnn.createStatement();
            i = st.executeUpdate(sql);
            return i;
        }
        catch (Exception e){
            return i;
        }
        finally{
            Cnn.close();
        }
    }
}
