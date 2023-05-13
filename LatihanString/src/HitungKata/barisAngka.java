/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungKata;

import java.util.Scanner;

/**
 *
 * @author RIFAI
 */
public class barisAngka {
    
    public static void main(String[] args) {
        
        int i, j, bilangan, baris, kolom;
        Scanner scan = new Scanner(System.in);  // code agar user bisa memasukan sesuatu
        System.out.print("B : ");
        baris = scan.nextInt();
        System.out.print("K : ");
        kolom = scan.nextInt();
        
        // me looping baris
        for (int b = baris; b >= 1; b--) { // b-- adalah decrement
            bilangan = b;
            
            // me looping kolom
            for (int k = b; k <= kolom; k--) { // k++ adalah increment
                System.out.print(String.format("%3d", bilangan));
                bilangan = bilangan + baris;
            }
            System.out.println();
            }
        
    }
    
}
