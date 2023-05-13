/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo6;

/**
 *
 * @author RIFAI
 */
public class Main 
{

    public static void main(String[] args) 
    { 
        Tabung gelas = new Tabung();
        System.out.println("========== Lingkaran ==========");
        gelas.input();
        gelas.LKLingkaran();
        System.out.println();
        System.out.println("========== Tabung ==========");
        System.out.println("Volume Tabung adalah " + gelas.Tabung());
        System.out.println("Luas Tabung adalah " + gelas.LuasTabung());
    }
    
}
