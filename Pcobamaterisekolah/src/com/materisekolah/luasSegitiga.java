/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.                             "Date = 30 - 08 - 2021"
 */
package com.materisekolah;

/**                                                         "Alhamdulillah Finish"
 *                                                      
 * @author Asus                                         'Dengan Method Class Sederhana'
 */                                                         
public class luasSegitiga {
    
    double setengah, alas, tinggi;
    
}

class DemoSegitiga {
    
    public static void main(String[] args) {
        double luas;
        
        luasSegitiga obj1 = new luasSegitiga();
        
        obj1.setengah = 0.5;        
        obj1.alas = 2;
        obj1.tinggi = 6;
        
        luas = obj1.setengah * obj1.alas * obj1.tinggi;
        
        System.out.println("Luas Segitiga Adalah: " + luas);
        
    }
    
}


// Jadi OUTPUT-Nya Adalah = 6.