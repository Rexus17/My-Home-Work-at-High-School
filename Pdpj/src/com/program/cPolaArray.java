/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class cPolaArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Baris : ");
        int baris = input.nextInt();
        System.out.print("Masukkan Jumlah Kolom : ");
        int kolom = input.nextInt();
        
        int[][] barisan = new int[baris][kolom];
        
        // PROGRAM 1
        for (int iBaris = 0; iBaris < baris; iBaris++){
            
            for (int iKolom = 0; iKolom < kolom; iKolom++){
                
                // Kalau Baris Yang Kita Inputkan Genap
                if (baris % 2 == 0){
                    
                    // Genap
                    if (iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 0;
                    }else {
                        barisan[iBaris][iKolom] = 1;
                    }
                    
                }else {
                    
                    // Ganjil
                    if (iBaris % 2 == 0){
                        barisan[iBaris][iKolom] = 1;
                    }else {
                        barisan[iBaris][iKolom] = 0;
                    }

                }
                
            }
            
        } // Tutup Pengisian Program 1
             
        // Tampilkan PROGRAM 1
        for (int iBaris = 0; iBaris < baris; iBaris++){
            
            for (int iKolom = 0; iKolom < kolom; iKolom++){
                
                System.out.print(barisan[iBaris][iKolom] + " ");
                
            } 
            System.out.println();
        }
        
        
        System.out.println("\n");
        
        
        // PROGRAM 2
                                    // Pengisian
        for (int iBaris = 0; iBaris < baris; iBaris++){
            
            for (int iKolom = 0; iKolom < kolom; iKolom++){
                
                if (iBaris == 0 || iBaris == baris - 1){
                    
                    barisan[iBaris][iKolom] = 1;
                    
                }else {
                    
                    if (iKolom == 0 || iKolom == kolom - 1){
                        
                        barisan[iBaris][iKolom] = 1;
                        
                    }else {
                        
                        barisan[iBaris][iKolom] = 0;
                        
                    }
                    
                }
                
            }
            
        } // Tutup Pengisian PROGRAM 2
        
        // Tampilkan PROGRAM 2
        for (int iBaris = 0; iBaris < baris; iBaris++){
            
            for (int iKolom = 0; iKolom < kolom; iKolom++){
                
                System.out.print(barisan[iBaris][iKolom] + " ");
                
            } 
            System.out.println();
        }
        
        
        
        
        
        
    }
    
}
