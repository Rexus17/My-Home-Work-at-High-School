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
public class cWhile {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batasan : ");
        
        int batas = input.nextInt();
        // LOOPING WHILE
        // LOOPING INCREMENT (++)
        /*
        int nilaiAwal = 1;
        while ( nilaiAwal <= batas ){
             // Lakukan Apa
            System.out.println(nilaiAwal);
            nilaiAwal++;
        */
        // LOOPING DECREMENT (--)
        
        int nilaiAwal = batas;
        while ( nilaiAwal >= 1 ){
            // Lakukan Apa
            System.out.println(nilaiAwal);
            nilaiAwal--;
        
        }
           
    }
    
}
