/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**
 *
 * @author Asus
 */
public class kotak5 {
    
    double panjang;
    double lebar;
    double tinggi;
    
    // Mendefinisikan Constructor Untuk Class kotak5 Tanpa Parameter
    kotak5() {
        
        panjang = 4;
        lebar = 3;
        tinggi = 2;
        
    }
    
    double hitungVolume() {
        
        return (panjang * lebar * tinggi);      // Mengembalikan Nilai
        
    }
    
    
}
