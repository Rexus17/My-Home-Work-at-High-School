/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungKata;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author RIFAI
 */

// Belum Sempurna

public class KataHitung {
    
    public static void main(String[] args) {
        
        // membuat inputan untuk memasukan string
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Beberapa Kata : ");
        String kata = sc.nextLine();
        
        // membuat array untuk masukan string
        ArrayList<String> listKata = new ArrayList();
        ArrayList<String> listJumlah = new ArrayList();
        
        
        // -----------------------------------------------*/
        // logika untuk kata
        String[] expKata = kata.split(" ");
        for (int i = 0; i < expKata.length; i++) {
            
            String dKata = expKata[i];
            int cariList = listKata.indexOf(dKata);
            
            if (cariList < 0) {
                listKata.add(dKata);
                listJumlah.add("1");
            } else {
                int currentJumlahKata = Integer.parseInt(listJumlah.get(cariList)) + 1; // code untuk mengubah String menjadi int
                listJumlah.set(cariList, String.valueOf(currentJumlahKata));
            }
            
        }
        
        
        // -----------------------------------------------*/
        // menghitung kata terbanyak
        int jumlahTerbanyak= 0;
        Collections.sort(listJumlah);
        Collections.reverse(listJumlah);
        
        for (int i = 0; i < listJumlah.size(); i++) {
            int dJumlah = Integer.parseInt(listJumlah.get(i)); // code untuk mengubah String menjadi int & panggil list jumlah
            if (dJumlah >= jumlahTerbanyak) {
                jumlahTerbanyak = dJumlah;
            }
        }
        
        
        // -----------------------------------------------*/
        // looping untuk kata & jumlah
        for (int i = 0; i < listJumlah.size(); i++) {
            String dKata = listKata.get(i); // memanggil list kata
            String dJumlah = listJumlah.get(i); // memanggil list jumlah
            
            System.out.println(dKata + " : " + dJumlah); // mengeluarkan hasil dar inputan
        }
        
        
        // -----------------------------------------------*/
        // menampilkan kata terbanyak
        System.out.println("Kata Terbanyak : ");
        for (int i = 0; i < listJumlah.size(); i++) {
            int dJumlah = Integer.parseInt(listJumlah.get(i));
            if (dJumlah == jumlahTerbanyak) {
                String dKata = listKata.get(i);
                System.out.println("- " + dKata);
            }
        }
    }
    
}
