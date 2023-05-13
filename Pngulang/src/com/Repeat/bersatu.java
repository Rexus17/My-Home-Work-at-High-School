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
public class bersatu extends indonesia {
    
    public static void main(String[] args) {
        
        bersatu obj1 = new bersatu();
        obj1.pulau();
        obj1.suku();
        obj1.bahasa();
        obj1.tradisi();
        
    }
       
    @Override
    void pulau() {
        
        String pulau1 = "Jawa";
        String pulau2 = "Bali";
        String pulau3 = "Sumatra";
        
        System.out.println("======== ISLAND ========");
        System.out.println("Pulau Terpadat Pertama: " + pulau1);
        System.out.println("Pulau Terpadat Kedua: " + pulau2);
        System.out.println("Pulau Terpadat Ketiga: " + pulau3);
        
    }
    
    @Override 
    void suku() {
        
        String suku1 = "Jawa";
        String suku2 = "Sunda";
        String suku3 = "Batak";
        
        System.out.println("======== ETHNIC GROUP ========");
        System.out.println("Suku Terbanyak Pertama: " + suku1);
        System.out.println("Suku Terbanyak Kedua: " + suku2);
        System.out.println("Suku Terbanyak Ketiga: " + suku3);
        
    }
    
    @Override
    void bahasa() {
        
        String bahasa1 = "Jawa";
        String bahasa2 = "Betawi";
        String bahasa3 = "Papua";
        
        System.out.println("======== LANGUAGE ========");
        System.out.println("Bahasa Yang Masih Dipakai: " + bahasa1);
        System.out.println("Bahasa Yang Perlahan Pudar: " + bahasa2);
        System.out.println("Bahasa Yang Sudah Pudar Atau Sudah Hilang: " + bahasa3);
        
    }
    
    @Override
    void tradisi() {
        String tradisi1 = "Siraman";
        String tradisi2 = "Tumpengan";
        String tradisi3 = "Wayang";
        
        System.out.println("======== CULTURE ========");
        System.out.println("Berasal Dari Jawa Barat: " + tradisi1);
        System.out.println("Berasal Dari Sumatera: " + tradisi2);
        System.out.println("Berasal Dari Jawa Tengah: " + tradisi3);
    }
    
}
