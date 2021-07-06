/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static model.Model.MySQLConfig;

/**
 *
 * @author Nocty
 */
public class Penduduk extends Model {
    private String nik, nkk, nama, jenisKelamin, tempatLahir,
        tanggalLahir, tempatTinggal, lainnya;
    
    public Penduduk() throws SQLException {
        MySQLConfig = super.configDB();
        
        try {
            java.sql.Statement stmt = MySQLConfig.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM penduduk");
            
            while(rs.next()) {
                setNik(rs.getString(0));
                setNkk(rs.getString(1));
                setNama(rs.getString(2));
                setJenisKelamin(rs.getString(3));
                setTempatLahir(rs.getString(4));
                setTanggalLahir(rs.getString(5));
                setTempatTinggal(rs.getString(6));
                setLainnya(rs.getString(7));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
            
    public void put(String nkk, String nama, String jenisKelamin,
        String tempatLahir, String tanggalLahir, String tempatTinggal,
        String lainnya) {
        
        try {
            String sql = "INSERT INTO penduduk VALUES(" + null +
                nkk + "', '" +
                nama + "', '" +
                jenisKelamin + "', '" +
                tempatLahir + "', '" +
                tanggalLahir + "', '" +
                tempatTinggal + "', '" +
                lainnya + "')" ;
                        
            java.sql.Connection conn = (Connection) MySQLConfig;
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Simpan data berhasil!");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void post(String nik, String nkk, String nama, String jenisKelamin,
        String tempatLahir, String tanggalLahir, String tempatTinggal,
        String lainnya) {
        try {
            String sql = "UPDATE penduduk set " +
                "nkk = '" + nkk + "', " +
                "nama = '" + nama + "', " +
                "jenis_kelamin = '" + jenisKelamin + "', " +
                "tempat_lahir = '" + tempatLahir + "', " +
                "tanggal_lahir = '" + tanggalLahir+ "', " +
                "tempat_tinggal = '" + tempatTinggal+ "', " +
                "lainnya = '" + lainnya + "', " +
                "where nik = '" + nik + "'" ;
                        
            java.sql.Connection conn = (Connection) MySQLConfig;
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Update data berhasil!");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNkk() {
        return nkk;
    }

    public void setNkk(String nkk) {
        this.nkk = nkk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTempatTinggal() {
        return tempatTinggal;
    }

    public void setTempatTinggal(String tempatTinggal) {
        this.tempatTinggal = tempatTinggal;
    }

    public String getLainnya() {
        return lainnya;
    }

    public void setLainnya(String lainnya) {
        this.lainnya = lainnya;
    }
    
}
