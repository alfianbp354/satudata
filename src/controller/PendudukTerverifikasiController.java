/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;
import model.PendudukTerverifikasi;

/**
 *
 * @author Nocty
 */
public class PendudukTerverifikasiController extends Controller {
    private PendudukTerverifikasi model;

    public PendudukTerverifikasiController(PendudukTerverifikasi model){
       this.model = model;
    }

    public String getId_verifikasi(){
       return model.getId_verifikasi();       
    }

    public String getIdAdmin(){
       return model.getId_admin();     
    }

    public String getNik(){
       return model.getNik();       
    }

    public String getTanggal_verifikasi(){
       return model.getTanggal_verifikasi();       
    }
    
    public void inputData(String id_admin, String nik, String tanggal_verifikasi) {
        model.put(id_admin, nik, tanggal_verifikasi);
    }
        
    @Override
    public PendudukTerverifikasi getData(){
        PendudukTerverifikasi penduduk_terverifikasi = null;
        try {
            penduduk_terverifikasi = new PendudukTerverifikasi();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return penduduk_terverifikasi;
    }
}
