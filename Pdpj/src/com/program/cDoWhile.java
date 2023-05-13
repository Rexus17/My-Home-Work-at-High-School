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
public class cDoWhile {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int batas = 9;
        int nilaiAwal = 1;
        // LOOPING DO-WHILE
        do {
            
            System.out.println(nilaiAwal);
            nilaiAwal++;
            
        } while(nilaiAwal >= batas);
        
    }
    
}
