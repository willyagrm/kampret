/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myFunction;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Pembelian;
/**
 *
 * @author user
 */
public class JTablePembelian extends AbstractTableModel {
    List<Pembelian> list = new ArrayList<>();
    
    
    public void add(Pembelian supp){
        list.add(supp);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 8;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0 : return list.get(rowIndex).getId_beli();
            case 1 : return list.get(rowIndex).getNama_pembeli();
            case 2 : return list.get(rowIndex).getNama_industri();
            case 3 : return list.get(rowIndex).getNama_obat();
            case 4 : return list.get(rowIndex).getQty();
            case 5 : return list.get(rowIndex).getHarga_obat();
            
            
            

            
            
            default : return null;
        }
    }
    
    
    public String getColumnName (int column){
        switch(column){
            case 0: return "Id_beli";
            case 1: return "NAMA_PEMBELI";
            case 2: return "NAMA_INDUSTRI";
            case 3: return "NAMA_Obat";
            case 4: return "QTY";
            case 5: return "HARGA";
            default : return null;
        }
    }
    
    public void removeRow(int i,int l){
        list.remove(i);
        //fireTableRowsDelete(i,l);
    }
    
    
    
}

//gak tau  Erorr di mana nya?
//kayak harus buat method sendiri buat firetable