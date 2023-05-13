/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;                      // Contoh Abstraksi Class

/**
 *
 * @author Asus
 */
public class buatMotor extends sepedaMotor {
    
        public static void main(String[] args) {
        
        buatMotor obj1 = new buatMotor();
        obj1.merk();
        obj1.harga();
        obj1.cc();
        
    }
    
    @Override
    void merk() {
        String merk1 = "Supra Xperience";
        String merk2 = "Vario Y";
        
        System.out.println("======== MERK ========");
        System.out.println("1. " + merk1);
        System.out.println("2. " + merk2);
    }
    
    @Override
    void harga() {
        String harga1 = "Rp. 24.000.000";
        String harga2 = "Rp. 18.000.000";
        
        System.out.println("======== HARGA ========");
        System.out.println("Harga: " + harga1);
        System.out.println("Harga: " + harga2);
    }
    
    @Override
    void cc() {
        String cc1 = "250 cc";
        String cc2 = "180 cc";
        
        System.out.println("======== CC ========");
        System.out.println("Supra Xperience: " + cc1);
        System.out.println("Vario: " + cc2);
    }
    
}
    
