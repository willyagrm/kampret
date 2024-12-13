/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myEntityManager;
import MyEntity.Supplier;
import myFunction.Fungsi;
/**
 *
 * @author MyBook Hype AMD
 */
public class SupplierManager {
    int i;
    
    public int inputData(Supplier supp){
        i = 0;
        
        try{
            String sql = "insert into supplier(nama_supplier,alamat,telp,email)"+
                    "values('"+supp.getNama()+"','"+supp.getAlamat()+"','"+
                    supp.getTelp()+"','"+supp.getEmail()+"')";
            
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e){
            return i;
        }
    }
    
    public int updateData(Supplier supp){
        i = 0;
        
        try{
            String sql = "UPDATE supplier SET nama_supplier = '" + supp.getNama() + "', " +
                     "alamat = '" + supp.getAlamat() + "', " +
                     "telp = '" + supp.getTelp() + "', " +
                     "email = '" + supp.getEmail() + "' "+
                    "WHERE kode_supplier = '" + supp.getKode_supplier() + "'";
            
            i = Fungsi.EQuery(sql);
            return i;
        }
        catch (Exception e){
            return i;
        }
    }
    
    public int hapusData(int ID)
    {
        i=0;
        try
        {
            String sql = "delete from supplier where kode_supplier="+ID+"";
            i=Fungsi.EQuery(sql);
            
            return i;
        }
        catch (Exception e)
        {
            return i;
        }
    }
    
}
