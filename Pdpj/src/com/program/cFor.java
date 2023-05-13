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
public class cFor {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Batas : ");
        Short batas = input.nextShort();
        
        // LOOPING ATAU PERULANGAN FOR
        for( int nilaiAwal = batas; nilaiAwal >= 1; nilaiAwal-- ) {
            System.out.println(nilaiAwal);
        }
    }
}
