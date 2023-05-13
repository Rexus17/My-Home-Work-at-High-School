/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**
 *                                                   "Materi Tanggal: 30 - 08 - 2021"
 * @author Asus
 */
public class Kotak2 {                               // Dengan Class Member
    
    double panjang, lebar, tinggi;
    
    // mendefinisikan class & method void (yg tdk mengembalikan Nilai)
    public void cetakVolume() {                                             // method setter & getter
        System.out.println("Volume Kotak = " + (panjang*lebar*tinggi));
    }
    
}


class DemoMethod1 {
    
    public static void main(String[] args) {
        Kotak2 obj1,obj2,obj3;
        
        // instansiasi objek obj1 dan obj2
        obj1 = new Kotak2();
        obj2 = new Kotak2();
        obj3 = new Kotak2();
        
        // mengisi data untuk objek obj1
        obj1.panjang = 4;
        obj1.lebar = 3;
        obj1.tinggi = 2;
        
        // mengisi data untuk objek obj2
        obj2.panjang = 6;
        obj2.lebar = 5;
        obj2.tinggi = 4;

        // mengisi data untuk objek obj3
	obj3.panjang = 10; 
	obj3.lebar = 7;
	obj3.tinggi = 8;
        
        // memanggil method cetakVolume() untuk masing-masing objek obj1, obj2, obj3
        obj1.cetakVolume();
        obj2.cetakVolume();
        obj3.cetakVolume();

        
    }
    
}
