/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repeat;

/**
 *
 * @author Asus
 */
public class buatLaptop extends laptop {
    
    public static void main(String[] args) {
        buatLaptop obj1 = new buatLaptop();
        obj1.laptopGamers();
        obj1.laptopDesigners();
        obj1.laptopProgramers();
    }
    
    @Override
    void laptopGamers() {
        String laptopGamers = "Digunakan Untuk Pemain Profesional";
        
        System.out.println("=====================");
        System.out.println("Harga Laptop Ini Rp. 50.000.000, " + laptopGamers + ", Amazing");
    }
    
    @Override 
    void laptopDesigners() {
        String laptopDesigners = "Digunakan Untuk Membuat Sesuatu Yang Bersifat Virtual";
        
        System.out.println("=====================");
        System.out.println("Harga Laptop Ini Rp. 25.000.000, " + laptopDesigners + ", Colorfull");
    }
    
    @Override
    void laptopProgramers() {
        String laptopProgramers = "Digunakan Untuk Seorang Pembuat Program atau Pengembang Program";
        
        System.out.println("=====================");
        System.out.println("Harga Laptop Ini Rp. 10.000.000, " + laptopProgramers + ", Think Logic");
    }
    
}
