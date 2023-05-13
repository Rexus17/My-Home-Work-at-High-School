/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perbaikan.nilai;

// untuk memasukan data
import java.util.Scanner;

/**
 *
 * @author RIFAI
 */
public class PerbaikanNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        char nilai;
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        nilai = input.next().charAt(0);
        
        switch (nilai) {
            case 'A':
                System.out.println("Pertahankan Ya!");
                break;
            case 'B':
                System.out.println("Hampir Sempurna!");
                break;
            case 'C':
                System.out.println("Jangan Menyerah, Keep Learning!");
                break;
            default:
                System.out.println("Belajarnya Yang Rajin Ya!");
                break;
        }
    }
    
}
