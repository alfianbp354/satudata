/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Penduduk;

/**
 *
 * @author Nocty
 */
public class PendudukController extends Controller {
    private Penduduk model;

    public PendudukController(Penduduk model){
       this.model = model;
    }

    public String getNik(){
       return model.getNik();       
    }

    public String getNkk(){
       return model.getNkk();       
    }

    public String getNama(){
       return model.getNama();       
    }

    public String getJenisKelamin(){
       return model.getJenisKelamin();       
    }

    public String getTempatLahir(){
       return model.getTempatLahir();       
    }

    public String getTanggalLahir(){
       return model.getTanggalLahir();       
    }

    public String getTempatTinggal(){
       return model.getTempatTinggal();       
    }

    public String getLainnya(){
       return model.getLainnya();       
    }
    
    public void inputData(String nkk, String nama, String jenisKelamin,
        String tempatLahir, String tanggalLahir, String tempatTinggal,
        String lainnya) {
        model.post(nkk, nkk, nama, jenisKelamin, tempatLahir, tanggalLahir, tempatTinggal, lainnya);
    }
        
    @Override
    public Penduduk getData(){
        Penduduk penduduk = null;
        try {
            penduduk = new Penduduk();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return penduduk;
    }
}
