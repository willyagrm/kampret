/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myEntity;

/**
 *
 * @author lenovo
 */
public class Obat {
    private String id_obat,nama_industri,code_obat,nama_obat,satuan,jenis,jumlah_stok_obat,harga_obat;

    public Obat(String text, String text0, String text1, String text2, String text3, String text4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getId_obat() {
        return id_obat;
    }

    public void setId_obat(String id_obat) {
        this.id_obat = id_obat;
    }

    public String getNama_industri() {
        return nama_industri;
    }

    public void setNama_industri(String nama_industri) {
        this.nama_industri = nama_industri;
    }

    public String getCode_obat() {
        return code_obat;
    }

    public void setCode_obat(String code_obat) {
        this.code_obat = code_obat;
    }

    public String getNama_obat() {
        return nama_obat;
    }

    public void setNama_obat(String nama_obat) {
        this.nama_obat = nama_obat;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJumlah_stok_obat() {
        return jumlah_stok_obat;
    }

    public void setJumlah_stok_obat(String jumlah_stok_obat) {
        this.jumlah_stok_obat = jumlah_stok_obat;
    }

    public String getHarga_obat() {
        return harga_obat;
    }

    public void setHarga_obat(String harga_obat) {
        this.harga_obat = harga_obat;
    }

    

    public Obat(String id_obat, String nama_industri, String code_obat, String nama_obat, String satuan, String jenis, String jumlah_stok_obat, String harga_obat) {
        this.id_obat = id_obat;
        this.nama_industri = nama_industri;
        this.code_obat = code_obat;
        this.nama_obat = nama_obat;
        this.satuan = satuan;
        this.jenis = jenis;
        this.jumlah_stok_obat = jumlah_stok_obat;
        this.harga_obat = harga_obat;
    }
    
    private int kode_obat;

    public int getKode_obat() {
        return kode_obat;
    }

    public void setKode_obat(int kode_obat) {
        this.kode_obat = kode_obat;
    }
    public Obat() {
    }

    JTableObat oTable = new JTableObat();
    Connection _Cnn;
    Statement st;
    koneksi db = new koneksi();
    
    private void tampilTable()
    {
        try
        {
            _Cnn = db.getConnection();
            st = _Cnn.createStatement();
            int row = tblobat.getRowCount();
            for (int i = 0; i < row; i++)
            {
                oTable.removeRow(0,row);
            }
            
            ResultSet rs = st.executeQuery ("select * form obat "
                    + "where nama_obat like '%"+txt)
        }
    }
}
