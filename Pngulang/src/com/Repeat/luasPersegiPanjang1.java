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
public class luasPersegiPanjang1 {
    
    double panjang, lebar;
    
}

class DemoluasPersegiPanjang {
    
    public static void main(String[] args) {
        double luas;
        
        luasPersegiPanjang1 obj1 = new luasPersegiPanjang1();
        
        obj1.panjang = 80;
        obj1.lebar = 20;
        
        luas = obj1.panjang * obj1.lebar;
        
        System.out.println("Luas Persegi Panjang Adalah : " + luas);
        
    }
    
}
