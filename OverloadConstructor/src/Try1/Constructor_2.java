/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try1;

/**
 *
 * @author RIFAI
 */
public class Constructor_2 
{

    // implementasi untuk "Constructor_2"
    float nilai1, nilai2, nilai3;
    
    // untuk "hasil" (Overload)
    public Constructor_2(int bil1)
    {
        nilai1 = bil1;
    }
    
    // untuk "hasilnya" (Overload)
    public Constructor_2(int bil1, int bil2)
    {
        nilai1 = bil1 + bil2;
    }
    
    // untuk "result" (Overload)
    public Constructor_2(int bil1, int bil2, int bil3)
    {
        nilai1 = bil1 + bil2 + bil3;
    }
    
    // untuk "Grade"
    public String Grade()
    {
        // implementasi variabel
        String nilaigrade;
        
        // validasi untuk "nilai1"
        if (nilai1 >= 50) 
        {
            nilaigrade = "Bagus";
        } else 
        {
            nilaigrade = "Jelek";
        }
        return nilaigrade;
    }
    
    // method cetak
    public void cetak()
    {
        // output method cetak
        System.out.println("Grade Nilainya : " + Grade());
    }
    
    // main method
    public static void main(String[] args) 
    {
        // buat object baru
        Constructor_2 hasil = new Constructor_2(45);
        hasil.cetak();
        
        // buat object baru
        Constructor_2 hasilnya = new Constructor_2(45, 35);
        hasilnya.cetak();
        
        // buat object baru
        Constructor_2 result = new Constructor_2(30, 20, 30);
        result.cetak();
    }
    
}
