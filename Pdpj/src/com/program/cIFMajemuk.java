/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;
/*
    ANALOGI !!!
*/
import java.util.Scanner;  // Beli Print Dahulu

/**
 *
 * @author Asus
 */
public class cIFMajemuk {
    
    public static void main(String[] args) {  // Main Method
        
        // Pekerjaan = Programmmer, Desainer
        // Menantu
        // Ya Gak DiTerima
        
        // Validasi
        // 1. namanya gak boleh kosong
        // 2. pekerjaanya harus programmer / desainer / developer
        
        Scanner input = new Scanner(System.in);  // Taruh Disuatu Tempat  // Untuk Proses Input Dlm JAVA
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();  // Pakai Print Tersebut
        
        System.out.print("Masukkan Pekerjaan Anda : ");
        String pekerjaan = input.nextLine();  // Pakai Print Tersebut
        
        // Percabangan IF Majemuk Menggunaka "Scanner Input"
        if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("Developer") ){   // (!nama.isEmpty() &&  // Tanda Tanya (!) Trsbt ,DiSebut Negasi/Tidak
            System.out.println("Halo " + nama + ". Anda Menantu Idaman");
        }else if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("Designer") ){
            System.out.println("Halo " + nama + ". Anda Menantu Yang Baik");
        }else if (!nama.isEmpty() && pekerjaan.equalsIgnoreCase("Scientist") ){
            System.out.println("Halo " + nama + ". Anda Menantu Paling Idaman");
        }else {
            System.out.println("Maaf Anda Tidak DiTerima Sebagai Menantu");
        }
    }
}