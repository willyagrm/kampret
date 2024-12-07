/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFunction;
import java.sql.*;
import koneksi.koneksi;
/**
 *
 * @author lenovo
 */
public class Fungsi {
    static Connection Cnn;
    static koneksi db = new koneksi();
    static Statement st;
    static int i;
    
    // Eksekusi perintah insert, update, delete
    public static int EQuery (String sql) throws SQLException, ClassNotFoundException
    {
        i = 0;
        try
        {
            Cnn = db.getConnection();
            st = Cnn.createStatement();
            i = st.executeUpdate(sql);
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
        finally
        {
            Cnn.close();
        }
    }

   
    }

