/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myEntityManager;
import myEntity.Pembelian;
import myFunction.Fungsi;
/**
 *
 * @author user
 */


 
            /*gimana caranya memasukkan value dari stok pembeli ke jumlah stok data obat
            gimana caranya menghubungkan antara 2 tabel yg berbeda
            */
public class PembelianManager {
    int i;
    
    public int inputData(Pembelian supp){
        i=0;
        try{
            String sql = //menginputkan data ke database
                    "begin;"
                    +"insert into pembelian(nama_pembeli, nama_industri, Qty) values('"
                    +supp.getNama_pembeli()+"','"+supp.getNama_industri()+"','"+supp.getQty()+");"
                    +"insert into obat(nama_obat, harga_obat) values('"+supp.getNama_obat()+"','"+supp.getHarga_obat()+");"
                    +"commit;";
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e){
            return i;
        }
    }
    
        
    
    
}
