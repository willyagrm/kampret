package myEntity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import myConnection.Koneksi;

/**
 * Obat Entity Class
 */
public class Obat {
    private String id_obat;
    private String nama_industri;
    private String code_obat;
    private String nama_obat;
    private String satuan;
    private String jenis;
    private String jumlah_stok_obat;
    private String harga_obat;

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

    public Obat() {
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

    private DefaultTableModel oTable = new DefaultTableModel();
    private Connection _Cnn;
    private Statement st;
    private Koneksi db = new Koneksi();

    public void tampilTable(String filterNamaObat) {
        try {
            _Cnn = db.getConnection();
            st = _Cnn.createStatement();

            oTable.setRowCount(0);

            String sql = "SELECT * FROM obat WHERE nama_obat LIKE '%" + filterNamaObat + "%'";
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] rowData = {
                    rs.getString("id_obat"),
                    rs.getString("nama_industri"),
                    rs.getString("code_obat"),
                    rs.getString("nama_obat"),
                    rs.getString("satuan"),
                    rs.getString("jenis"),
                    rs.getString("jumlah_stok_obat"),
                    rs.getString("harga_obat")
                };
                oTable.addRow(rowData);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        } finally {
            try {
                if (st != null) st.close();
                if (_Cnn != null) _Cnn.close();
            } catch (Exception e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
