/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repeat;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class luasSegitiga {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a, t;
        
        double luas;
        
        System.out.print("Masukkan Alas : ");
        a=input.nextInt();
        
        System.out.print("Masukkan Tinggi : ");
        t=input.nextInt();
        
        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga Adalah : " + luas);
        
    }
    
}
