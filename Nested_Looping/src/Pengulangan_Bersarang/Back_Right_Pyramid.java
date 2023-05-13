/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengulangan_Bersarang;

import java.util.Scanner;

/**
 *
 * @author RIFAI
 */
public class Back_Right_Pyramid 
{
    
    public static void main(String[] args) 
    {
        // membuat scanner baru
        Scanner input = new Scanner(System.in);
        
        // tampilkan output ke user
        System.out.print("Masukan Jumlah Bintang : ");
        
        // untuk menyimpan dan mengirim dari user
        int jumlah = input.nextInt();
        
        // pengulangan untuk banyaknya angka
        for (int i = 0; i <= 5; i++) 
        {
            for (int j = 4; j >= i; j--) 
            {
                System.out.println("*");
            }
            System.out.println();
        }
    }
    
}
