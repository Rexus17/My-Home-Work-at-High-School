/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**
 *
 * @author Asus                                         "METHOD MENGEMBALIKAN NILAI"
 */
public class kotak3 {
    
    // Program Class Kotak
    double panjang;
    double lebar;
    double tinggi;
    
    // Mendefinisikan class & method yang mengembalikan nilai tipe double vol
    double hitungVolume() {
        double vol;
        vol = panjang * lebar * tinggi;
        return vol;                             // Mengembalikan Nilai
    }
    
}


