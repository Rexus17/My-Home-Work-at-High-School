/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package captcha;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author RIFAI
 */
public class Captcha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner key = new Scanner(System.in);
        // memunculkan angka random
        int x = (int) (Math.random()*50);
        int y = (int) (Math.random()*50);
        // rumus dari captcha 
        int z = x + y;
        
        // untuk output-nya
        System.out.println(x + " + " + y + " = ");
        System.out.println("");
        System.out.println("Hasil-nya adalah ");
        System.out.println("------>");
        int hasil = key.nextInt();
        
    // perulangan dan percabangan
        while (hasil != z) {            
            if (hasil > z) {
                System.out.println("Hasilnya terlalu besar. Coba Lagi!");
                System.out.print("------>");
                hasil=key.nextInt();
            }
             if (hasil < z) {
                System.out.println("Hasilnya terlalu kecil. Coba Lagi!");
                System.out.print("------>");
                hasil=key.nextInt();
            }
            if (hasil == z) {
                System.out.println("Anda Hebat");
            }
        }
    }
    
}
