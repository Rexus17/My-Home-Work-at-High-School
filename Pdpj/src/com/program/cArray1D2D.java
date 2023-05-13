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
public class cArray1D2D {
    
    public static void main(String[] args) {
        
        // Array 1 Dimensi
            // Assignment
            int[] angka = {1,5,4,7,6,9};
            
            // Output nya Pakai Looping, Tdk Bs Pakai "System.out.println();"
            for (int i = 0; i < angka.length; i++){    // "i" itu adalah indeks    // "angka.length" Untuk Men Sinkronkan Data Dari Angka
                System.out.print(angka[i] + " ");
            }
            
            
            System.out.println();
            
            
            // Declaration
            int[] bilangan = new int[5];
            
            bilangan[0] = 10;
            bilangan[3] = 19;
            
            // Output nya Pakai Looping, Tdk Bs Pakai "System.out.println();"
            for (int i = 0; i < bilangan.length; i++){    // "i" itu adalah indeks    // "angka.length" Untuk Men Sinkronkan Data Dari Angka
                System.out.print(bilangan[i] + " ");
            }
            
            
            System.out.println("\n");
            
            
        // Array 2 Dimensi
            // Assignment
            int[][] angka2 = { {2,4,5,9}, {10,20,32,29} };
            
            // Output nya Pakai Looping, Tdk Bs Pakai "System.out.println();"
            for (int i = 0; i < angka2.length; i++){    // "i" itu adalah indeks    // "angka.length" Untuk Men Sinkronkan Data Dari Angka
                
                for (int index = 0; index < angka2[i].length; index++){    // "i" itu adalah indeks    // "angka.length" Untuk Men Sinkronkan Data Dari Angka
                    System.out.print(angka2[i][index] + " ");
            }
                System.out.println();
            }
            
            
            System.out.println();
            
            
            // Declaration
            int[][] bilangan2 = new int[3][5];
            
            bilangan2[1][2] = 9;
            bilangan2[0][1] = 9;
            bilangan2[0][3] = 9;
            bilangan2[2][1] = 9;
            bilangan2[2][3] = 9;
            
            // Output nya Pakai Looping, Tdk Bs Pakai "System.out.println();"
            for (int i = 0; i < bilangan2.length; i++){    // "i" itu adalah indeks    // "angka.length" Untuk Men Sinkronkan Data Dari Angka
                
                for (int index = 0; index < bilangan2[i].length; index++){    // "i" itu adalah indeks    // "angka.length" Untuk Men Sinkronkan Data Dari Angka
                    System.out.print(bilangan2[i][index] + " ");
            }
                System.out.println();
            }
            
            
            
            
            
            
            
            
            
    }
    
}
