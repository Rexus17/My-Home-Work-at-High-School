/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.                             "Date = 30 - 08 - 2021"
 */
package com.materisekolah;

/**                                                     "Alhamdulillah Finish"
 *
 * @author Asus                                     'Menggunakan Method Satu Class'
 */
public class luasLingkaran {
    
    double phi, jari2, jari_jari;
    
    public void cetakLuasLingkaran() {
        System.out.println("Luas Lingkaran = " + (phi * jari2 * jari_jari));
    }
}

class Member {
    
    public static void main(String[] args) { 
        luasLingkaran obj1;
        
        obj1 = new luasLingkaran();
        
        obj1.phi = 3.14;
        obj1.jari2 = 7;
        obj1.jari_jari = 7;
        
        obj1.cetakLuasLingkaran();
        
    }
}


// Jadi OUTPUT-Nya Adalah = 154.