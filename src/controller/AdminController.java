package controller;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Admin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nocty
 */
public class AdminController extends Controller {
    private Admin model;

    public AdminController(Admin model){
       this.model = model;
    }

    public String getNamaAdmin(){
       return model.getNama();       
    }

    public String getIdAdmin(){
       return model.getId_admin();     
    }

    public String getEmailAdmin(){
       return model.getEmail();       
    }
    
    public void inputData(String nama, String email, String password) {
        model.put(nama, email, password);
    }
        
    @Override
    public Admin getData(){
        Admin admin = null;
        try {
            admin = new Admin();
        } catch (SQLException ex) {
            Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return admin;
    }
}
