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
public class cOperator {
    
    public static void main(String[] args) {
     
        // Operator
            // 1.) Penegasan (=)
        // int bilangan = 10;
            // 2.) Aritmatika ( +, -, *, /, %, ++, --, +=, -= )
        /*
        int bil1 = 12;
        int bil2 = 5;               // cara panjang men-deklarasi
        int hasil = bil1 + bil2;
        */
        /*
        int bil1 = 12,
            bil2 = 5,               // cara cepat men-deklarasikan
            hasil = bil1 % bil2;
        */
        // bil1+=7;  // cara simple
        /*
        bil1++;
        bil1++;
        bil1++;   // cara ribet
        bil1++;
        bil1++;
        */
            // 3.) Pembanding ( <, >, <=, >=, ==, != )
        /*
        int bil1 = 12,
            bil2 = 2;               
        boolean hasil = bil1 < bil2;
        */
            // 4.) Logika/Logic ( &&, ||, ! )
        
        int totalBayar = 150000;
        boolean shoopingCard = false;
        
        boolean hasil = totalBayar >= 100000 || shoopingCard == true;
        hasil = !hasil;
        hasil = !hasil;
        
        System.out.println(hasil);
        
        
         
    } 
}
