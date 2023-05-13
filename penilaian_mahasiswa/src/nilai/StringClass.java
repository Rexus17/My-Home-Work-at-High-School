/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;

/**
 *
 * @author RIFAI
 */
public class StringClass {
    
    public static void main(String[] args) {
        String nama = "Ahmad Rifai";
        System.out.println(nama);
        
        String kelas = new String("XII Rekayasa Perangkat Lunak");
        System.out.println("Kelas : " + kelas);
        
        String text = "Ini adalah Sebuah Text String di JAVA";
        System.out.println("Panjang Text : " + text.length() + "Text Nya : " + text);
        
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1.concat(str2));
    }
    
}
