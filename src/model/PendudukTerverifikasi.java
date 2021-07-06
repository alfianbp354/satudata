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
public class PendudukTerverifikasi extends Model {
    private String id_verifikasi, id_admin, nik, tanggal_verifikasi;
    
    public PendudukTerverifikasi() throws SQLException {
        MySQLConfig = super.configDB();
        
        try {
            java.sql.Statement stmt = MySQLConfig.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM penduduk_terverifikasi");
            
            while(rs.next()) {
                setId_verifikasi(rs.getString(0));
                setId_admin(rs.getString(1));
                setNik(rs.getString(2));
                setTanggal_verifikasi(rs.getString(3));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
            
    public void put(String id_admin, String nik, String tanggal_verifikasi) {
        
        try {
            String sql = "INSERT INTO penduduk_terverifikasi VALUES(" + null +
                id_admin + "', '" +
                nik + "', '" +
                tanggal_verifikasi + "')" ;
                        
            java.sql.Connection conn = (Connection) MySQLConfig;
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Simpan data berhasil!");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void post(String id_verifikasi, String id_admin, String nik, String tanggal_verifikasi) {
        try {
            String sql = "UPDATE penduduk_terverifikasi set " +
                "id_admin = '" + id_admin + "', " +
                "nik = '" + nik + "', " +
                "tanggal_verifikasi = '" + tanggal_verifikasi + "', " +
                "where id_verifikasi = '" + id_verifikasi + "'" ;
                        
            java.sql.Connection conn = (Connection) MySQLConfig;
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Update data berhasil!");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public String getId_verifikasi() {
        return id_verifikasi;
    }

    public void setId_verifikasi(String id_verifikasi) {
        this.id_verifikasi = id_verifikasi;
    }

    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getTanggal_verifikasi() {
        return tanggal_verifikasi;
    }

    public void setTanggal_verifikasi(String tanggal_verifikasi) {
        this.tanggal_verifikasi = tanggal_verifikasi;
    }
}
