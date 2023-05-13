/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * Overloading hanya memiliki satu Class saja, tidak bisa lebih
 *
 */
package Try2;

/**
 *
 * @author RIFAI
 */
public class BelajarJava 
{

    static int tambah(int var1, int var2)
    {
        return var1 + var2;
    }
    
    static int tambah(int var1, int var2, int var3)
    {
        return var1 + var2 + var3;
    }
    
    static String tambah(String var1, String var2)
    {
        return var1 + " tambah " + var2;
    }
    
    public static void main(String[] args) 
    {
        System.out.println( tambah(1,2) );
        System.out.println( tambah(5,4,3) );
        System.out.println( tambah("satu", "dua") );
    }
    
}
