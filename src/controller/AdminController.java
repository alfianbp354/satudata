package controller;

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
public class AdminController {
    private Admin model;

    public AdminController(Admin model){
       this.model = model;
    }

    public void setNamaAdmin(String name){
       model.setNama(name);      
    }

    public String getNamaAdmin(){
       return model.getNama();       
    }

    public void setId_Admin(String id){
       model.setId_admin(id);      
    }

    public String getIdAdmin(){
       return model.getId_admin();     
    }

    public void setEmailAdmin(String email){
       model.setId_admin(email);      
    }

    public String getEmailAdmin(){
       return model.getEmail();       
    }

    public void setPassword(String pw){
      model.setPassword(pw);     
    }

    public String getPassword(){
       return model.getPassword();     
    }
        
    public void updateView(){                
        // refresh the view
    }
}
