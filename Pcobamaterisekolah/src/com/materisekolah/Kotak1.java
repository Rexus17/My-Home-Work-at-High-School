/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**
 *                                                      "Materi Tanggal: 30 - 08 - 2021"
 * @author Asus
 */
public class Kotak1 {                                   // Dengan Class Sederhana
    
    double panjang;     // buat type variabel
    double lebar;
    double tinggi;
    
}

class DemoKotak1 {
    
    public static void main(String[] args) {
        double volume;
        // instansi class menjadi objek kotak obj1;
        Kotak1 obj1 = new Kotak1();
        // Kotak obj2 = new Kotak();
        
        // mengisikan nilai kedlm variabel-variabel class kotak
        obj1.panjang = 4;
        obj1.lebar = 3;
        obj1.tinggi = 2;    
        
        // menghitung volume kotak
        volume = obj1.panjang * obj1.lebar * obj1.tinggi;
        
        // menampilkan nilai volume kelayar monitor
        System.out.println("Volume Kotak Adalah: " + volume);       // Cetak Hasil 1
        System.out.println("Hasil Volume Adalah: " + volume);       // Cetak Hasil 2
        
    }
    
}