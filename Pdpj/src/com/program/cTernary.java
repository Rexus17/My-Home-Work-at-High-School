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
public class cTernary {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int nilai = input.nextInt();
        String keterangan = nilai >= 70 && nilai <=100 ? "Gitu Donk" : "Gimana Nih";   // Percabangab TERNARY
        
        // Nilai >= 70 && <=100
        // Keterangan = Lulus
        // Keterangan = TL
                                // Klo Menggunakan IF GANDA
        /*
        if(nilai >= 70 && nilai <=100) {
            keterangan = "Lulus";
        }else {
            keterangan = "Tidak Lulus";
        }
        */
        
        System.out.println(keterangan);
    }
    
}
