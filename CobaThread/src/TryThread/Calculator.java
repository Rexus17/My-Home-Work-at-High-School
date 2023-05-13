/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryThread;

import java.io.*;
import java.io.BufferedReader;

/**
 *
 * @author RIFAI
 */
class Calculator 
{

    private boolean quot;

    // method operasi tambah
    public int tambah(int a, int b)
    {
        int c = a + b;
        return c;
    }
    
    // method operasi kurang 
    public int kurang(int a, int b)
    {
        int c = a - b;
        return c;
    }
    
    // method operasi kali
    public int kali(int a, int b)
    {
        int c = a * b;
        return c;
    }
    
    // method operasi bagi
    public int bagi(int a, int b)
    {
        int c = a / b;
        return c;
    }
    
    // method untuk input angka
    public int inputAngka()
    {
        String a;
        int a2 = 0;
        try 
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            a = br.readLine();
            a2 = Integer.parseInt(a);               // sintax untuk mengubah dari STRING menjadi INT
        } catch (IOException e) 
        {
            System.err.println("Error" + e);
        }
        return a2;
    }
    
    // method pemilihan menu dan pemanggilan method2 sesuai pilihan
    public void pilihMenu(int pil)
    {
        int a = 0;
        int b = 0;
        int c = 0;
        
        switch(pil)
        {
            case 1 :
                System.out.println("Penjumlahan");
                
                System.out.print("Angka 1 : ");
                a = this.inputAngka();
                System.out.print("Angka 2 : ");
                b = this.inputAngka();
                
                c = this.tambah(a, b);
                System.out.println("-------------------- +");
                System.out.println("Hasil : " + c);
                System.out.println();
            break;
            
            case 2 :
                System.out.println("Pengurangan");
                
                System.out.print("Angka 1 : ");
                a = this.inputAngka();
                System.out.print("Angka 2 : ");
                b = this.inputAngka();
                
                c = this.kurang(a, b);
                System.out.println("-------------------- -");
                System.out.println("Hasil : " + c);
                System.out.println();
            break;
            
            case 3 :
                System.out.println("Perkalian");
                
                System.out.print("Angka 1 : ");
                a = this.inputAngka();
                System.out.print("Angka 2 : ");
                b = this.inputAngka();
                
                c = this.kali(a, b);
                System.out.println("-------------------- *");
                System.out.println("Hasil : " + c);
                System.out.println();
            break;
            
            case 4 :
                System.out.println("Pembagian");
                
                System.out.print("Angka 1 : ");
                a = this.inputAngka();
                System.out.print("Angka 2 : ");
                b = this.inputAngka();
                
                c = this.bagi(a, b);
                System.out.println("-------------------- /");
                System.out.println("Hasil : " + c);
                System.out.println();
            break;
            
            case 5 :
                System.out.println("Anda Keluar");
            break;
            
            default:
                System.out.println("----------");
                System.out.println("Salah Pilih");
                System.out.println("----------");
        }
    }
    
    // program utama
    public static void main(String[] args) 
    {
        int pil;
        Calculator kal = new Calculator();                                      // instansi kelas Calculator
        
        do
        {
            System.out.println();
            System.out.println("MENU : ");
            System.out.println("1 - Penjumlahan");
            System.out.println("2 - Pengurangan");
            System.out.println("3 - Perkalian");
            System.out.println("4 - Pembagian");
            System.out.println("5 - Keluar");
            
            System.out.print("Masukan Pilihan : ");
            pil = kal.inputAngka();
            kal.pilihMenu(pil);
        } while (pil != 5);
        
    }
    
}


/*
    try dan catch digunakan untuk menangkap jenis error InterruptedException agar program tidak crash saat error itu terjadi.
*/
