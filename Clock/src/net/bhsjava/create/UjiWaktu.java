/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bhsjava.create;

// ambil data dari "StWaktu"
import net.bhsjava.create.StWaktu;

/**
 *
 * @author RIFAI
 */
public class UjiWaktu 
{

    // main method
    public static void main(String[] args)
    {
        // buat object baru dengan nama "waktu"
        StWaktu waktu = new StWaktu();
        
        // menampilkan waktu inisial
        System.out.println("Waktu universal inisial adalah : ");
        System.out.println(waktu.ubahFormatStWaktu());      // ambil data dari "waktu.ubahFormatStWaktu()" di class StWaktu
        System.out.println("Waktu standard inisial adalah : ");
        System.out.println(waktu.convertKeString());        // ambil data dari "waktu.convertKeString()" di class StWaktu
        System.out.println();
        
        // mengatur waktu
        waktu.setStWaktu(17, 43, 53);
        System.out.println("Waktu universal setelah setWaktu adalah : ");
        System.out.println(waktu.ubahFormatStWaktu());      // ambil data dari "waktu.ubahFormatStWaktu()" di class StWaktu
        System.out.println("Waktu standard setelah setWaktu adalah : ");
        System.out.println(waktu.convertKeString());        // ambil data dari "waktu.convertKeString()" di class StWaktu
        System.out.println();
        
        // mengatur waktu dengan nilai yang tidak valid
        try 
        {
            waktu.setStWaktu(25, 78, 90);
        } 
        catch (IllegalArgumentException e) 
        {
            
            // kode "printf" digunakan apabila ingin mencetak output dengan FORMAT SPESIFIK, misalnya: digit tertentu, atau jika ingin mencetak rata kiri atau rata kanan
            System.out.printf("Exception: %s\n\n", e.getMessage());
            
        }
        
        System.out.println("Setelah mengatur waktu dengan nilai yang tidak valid : ");
        System.out.println("Waktu universal adalah : ");
        System.out.println(waktu.ubahFormatStWaktu());      // ambil data dari "waktu.ubahFormatStWaktu()" di class StWaktu
        System.out.println("Waktu standar adalah : ");
        System.out.println(waktu.convertKeString());        // ambil data dari "waktu.convertKeString()" di class StWaktu
    }
    
}
