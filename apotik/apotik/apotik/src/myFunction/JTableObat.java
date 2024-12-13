/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myFunction;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import myEntity.Obat;

/**
 *
 * @author lenovo
 */
public class JTableObat extends AbstractTableModel{
    List<Obat> list = new ArrayList<>();
    
    public void add(Obat ob){
        list.add(ob);
        fireTableRowsInserted(getRowCount(), getColumnCount());
    }
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return 5;
    }
    @Override
    
    public Object getValueAt(int rowIndex, int columnindex) {
        switch (columnindex)
        {
            case 0 : return list.get(rowIndex).getId_obat();
            case 1 : return list.get(rowIndex).getNama_industri();
            case 2 : return list.get(rowIndex).getCode_obat();
            case 3 : return list.get(rowIndex).getNama_obat();
            case 4 : return list.get(rowIndex).getSatuan();
            case 5 : return list.get(rowIndex).getJenis();
            case 6 : return list.get(rowIndex).getJumlah_stok_obat();
            case 7 : return list.get(rowIndex).getHarga_obat();
            default : return null;
        }
    }
    @Override
    public String getColumnName (int column)
    {
        switch (column)
        {
            case 0 : return "ID OBAT";
            case 1 : return "NAMA INDUSTRI";
            case 2 : return "CODE OBAT";
            case 3 : return "NAMA OBAT";
            case 4 : return "SATUAN";
            case 5 : return "JENIS";
            case 6 : return "JUMLAH STOK OBAT";
            case 7 : return "HARGA OBAT";
            default : return null;

        }
    }
    public void removeRow(int i, int l)
    {
        list.remove(i);
        fireTableRowsDeleted(i,l);
    }
    
}
