/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.AdminController;
import java.sql.SQLException;
import model.Admin;

/**
 *
 * @author Nocty
 */
public class Test {
    public static void main(String[]args) throws SQLException {
        Admin model = retriveDataAdmin();
        AdminController  controller = new AdminController(model);
        
        System.out.println("Hallo " + controller.getNamaAdmin() + "! ^^");
    }
    
    public static Admin retriveDataAdmin() throws SQLException {
        Admin admin = new Admin();
        admin.setNama("Zaidan");
        admin.setId_admin("001");
        admin.setEmail("zaidan20ti@mahasiswa.pcr.ac.id");
        admin.setPassword("rahasia");
        
        return admin;
    }
}
