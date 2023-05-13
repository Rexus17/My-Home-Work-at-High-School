/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;                              // Contoh Abstraksi

/**                                                          "Abstraction"
 *
 * @author Asus                                         "MATERI TANGGAL: 09 - 09 - 21"
 */
public class buatKue extends komponen {
    
    public static void main(String[] args) {         // main or utama u mengeksekusi method
        
        // Membuat Instance atau Object dari class buatKue
        buatKue obj1 = new buatKue();
        obj1.bahan_bahan();
        obj1.peralatan();
        obj1.proses_pembuatan();
        
    }
    
    @Override
    void bahan_bahan() { // method pertama

        String bahan1 = "Tepung Terigu";
        String bahan2 = "Gula";
        String bahan3 = "Telur";

        System.out.println("====== BAHAN-BAHAN ======");    
        System.out.println("1."+bahan1);
        System.out.println("2."+bahan2);
        System.out.println("3."+bahan3);

    }
    
    @Override
    void peralatan() { //method kedua
        
        String alat1 = "Oven";
        String alat2 = "Mixer";
        String alat3 = "Loyang";

        System.out.println("====== ALAT-ALAT ======");
        System.out.println("1."+alat1);
        System.out.println("2."+alat2);
        System.out.println("3."+alat3);
        
    }
    
    @Override
    void proses_pembuatan() { //method ketiga
    
        System.out.println("====== PROSES ======");
        System.out.println("1.Aduk dan Campurkan Semua Bahan Pada Mixer");
        System.out.println("2.Masukan Pada Loyang");
        System.out.println("3.Oven Sampai Matang");
        System.out.println("4.Selesai");

    }
    
}
