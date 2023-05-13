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
public class cScannerInput {
    
    public static void main(String[] args) {  // Main Method / Metode Utama
        
        Scanner input = new Scanner(System.in);  // Taruh Disuatu Tempat  // Untuk Proses Input Dlm JAVA
        
        System.out.print("Masukkan Nama Anda : ");  
        String nama = input.next();  // Pakai Print Tersebut  // next untuk 1 kata ,kalau nextLine untuk Banyak Kata
       
        System.out.print("Masukkan Nilai : ");
        int nilai = input.nextInt();  // Pakai Print Tersebut
        
        System.out.println("Selamat Datang " + nama);
        System.out.println("Nilai Yang Ada DiVariabel Nilai Adalah : " + nilai);
        
        
    }
    
}
