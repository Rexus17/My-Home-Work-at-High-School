/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**
 *
 * @author Asus                                         "METHOD DENGAN PARAMETER"
 */
public class kotak4 {
    
    double panjang;
    double lebar;
    double tinggi;
    
    void isiData(double p, double l, double t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double hitungVolume() {
        return(panjang * lebar * tinggi);
    }
    
}
