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
public class cSwitchCase {
    
    public static void main(String[] args) {  // Main Method  
        
        // Warung Makan
        
        Scanner input = new Scanner(System.in);  // Taruh Disuatu Tempat  // Untuk Proses Input Dlm JAVA
        
        System.out.print("== Warung Makan ==\n" + "1. Nasi Goreng (Rp.12.000)\n" + "2. Nasi Kuning (Rp.10.000)\n" + "3. Nasi Uduk (Rp.5.000)\n"
        + "Masukkan Pilihan Anda [1/2/3] : ");
        
        String pilihan = input.next();
        
        // Percabangan SWITCH CASE, Sintaks Cepat
        
        System.out.print("Masukkan Jumlah Penanan Anda : ");    // Untuk MeMinimal Sintaks & Output Seluruh CASE
        short jumlah = input.nextShort();                       // Tambahkan Seperti ini DiBawah Tulisan Percabangan SWITCH CASE :  switch jumlah;
                                                                //                                                                  int harga;
        switch (pilihan){
            case "1" :
                
                int harga = jumlah * 12000;
                System.out.println("Total Pembelian Anda Adalah Rp." + harga);
                
            break; 
        }       
        switch (pilihan){
            case "2" :

                int harga = jumlah * 10000;
                System.out.println("Total Pembelian Anda Adalah Rp." + harga);
                
            break; 
        }
        switch (pilihan){
            case "3" :
                
                int harga = jumlah * 5000;
                System.out.println("Total Pembelian Anda Adalah Rp." + harga);
                
        break;
        
        default :
            System.out.println("Mohon Maaf, Pilihan Yang Anda Inginkan Tidak Ada");
        }
    }   
}


// Sintaks Asli / Sintank Lambat SWITCH CASE Seperti Berikut:
/*
        switch (pilihan){
            case "1" :
                
                System.out.print("Masukkan Jumlah Penanan Anda : ");   // Untuk MeMinimal Sintaks & Output Seluruh CASE
                short jumlah = input.nextShort();
                int harga = jumlah * 5000;

                System.out.println("Total Pembelian Anda Adalah Rp." + harga);
                
            break;
        
        default :
            System.out.println("Mohon Maaf, Pilihan Yang Anda Inginkan Tidak Ada");
        }
*/