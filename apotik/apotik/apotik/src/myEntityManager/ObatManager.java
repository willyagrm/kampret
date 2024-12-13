/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myEntityManager;
import java.sql.SQLException;
import myEntity.Obat;
import myFunction.Fungsi;
/**
 *
 * @author lenovo
 */
public class ObatManager {
    int i;
    public int inputData(Obat ob) 
    {
        i = 0;
        try 
        {
            String sql = "insert into obat (id_obat,nama_industri,code_obat,nama_obat,satuan,jenis,jumlah_stok_obat,harga_obat)"+
                    "values('"+ob.getId_obat()+"','"+ob.getNama_industri()+"','"+
                    "','"+ob.getCode_obat()+"','"+ob.getNama_obat()+"','"+ob.getSatuan()+"','"+ob.getJenis()+"','"+
                    ob.getJumlah_stok_obat()+"','"+ob.getHarga_obat()+"')";
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
    }
}
