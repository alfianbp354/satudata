package model;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nocty
 */
public class Admin extends Model {
    private String id_admin, nama, email, password;

    public Admin() throws SQLException {
        MySQLConfig = super.configDB();
        
        try {
            java.sql.Statement stmt = MySQLConfig.createStatement();
            java.sql.ResultSet rs = stmt.executeQuery("SELECT * FROM admin");
            
            while(rs.next()) {
                setId_admin(rs.getString(0));
                setNama(rs.getString(1));
                setEmail(rs.getString(2));
                setPassword(rs.getString(3));
            }
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void put(String nama, String email, String password) {
        try {
            String sql = "INSERT INTO admin VALUES(" + null + "'" +
                nama + "', '" +
                email + "', '" +
                password + "')" ;
                        
            java.sql.Connection conn = (Connection) MySQLConfig;
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Simpan data berhasil!");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void post(String id_admin, String nama, String email, String password) {
        try {
            String sql = "UPDATE admin set " +
                "nama = '" + nama + "', " +
                "email = '" + email + "', " +
                "password = '" + password + "', " +
                "where id_admin = '" + id_admin + "'" ;
                        
            java.sql.Connection conn = (Connection) MySQLConfig;
            java.sql.PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.execute();
            
            JOptionPane.showMessageDialog(null, "Update data berhasil!");
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    public String getId_admin() {
        return id_admin;
    }

    public void setId_admin(String id_admin) {
        this.id_admin = id_admin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
