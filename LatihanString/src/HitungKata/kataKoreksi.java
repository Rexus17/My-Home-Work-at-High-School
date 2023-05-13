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
public class kataKoreksi {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // code agar user bisa memasukan sesuatu
        System.out.print("Masukan Beberapa Kata : ");
        String word = input.nextLine();
        int x = word.length();
        int wBesar = 0, wKecil = 0, angka = 0, simbol = 0;
        
        // me looping & fork karakter yang dimasukan
        for (int i = 0; i < x; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                wBesar++;
            } else if (Character.isLowerCase(word.charAt(i))) {
                wKecil++;
            } else if (Character.isDigit(word.charAt(i))) {
                angka++;
            } else {
                simbol++;
            }
        }
        
        System.out.println("UpperCase : " + wBesar);
        System.out.println("LoweCase : " + wKecil);
        System.out.println("Number : " + angka);
        System.out.println("Simbol : " + simbol);
        
    }
    
}
