/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

/**
 *
 * @author Asus
 */
public class cFunction {
    
    public static void main(String[] args) {        // Main Method
        
        ucapan("Ahmad Rifai");
        
        System.out.println(perkalian(3,9));
        
    }
    
    // PROSEDUR !!!
        // Sebuah Function/Fungsi Yg Tidak Mengembalikan Nilai
    public static void ucapan(String nama){                             // Ini DiSebut METHOD 
        System.out.println("Selamat Malam " + nama);
    }
    
    // FUNCTION !!!
        // Sebuah Function/Fungsi Yg Dapat Mengembalikan Nilai
    public static int perkalian(int x, int y){                          // Ini DiSebut METHOD
        return x * y;                               // "return" Sintaks Untuk Mengembalikan Nilai Tipe Data
    }
    
    // METHOD !!!
        // Sebuah Function Pd JAVA Tapi Dlm Istilah Object Oriented
    
    
    
    
}
