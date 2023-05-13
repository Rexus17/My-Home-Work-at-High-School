/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Materi tanggal : Kamis, 29 - September - 2022
 *
 */
package Pengulangan_Bersarang;

// import library
import java.util.Scanner;

/**
 * 
 * @author RIFAI
 */
public class Left_Star_Nested_Loop 
{
    
    public static void main(String[] args) 
    {      
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        
        // tampilkan output ke user 
        System.out.print("Masukan Jumlah Bintang : ");
        
        // untuk menyimpan dan mengirim masukan dari user 
        int angka = keyboard.nextInt();
        
        // pengulangan untuk banyak nya angka
        for (int i = 1; i <= angka; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
