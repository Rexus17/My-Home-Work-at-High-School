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
public class Tabung extends Lingkaran
{

    double t = 10;
    Lingkaran ling = new Lingkaran();
    
    public void input()
    {
        System.out.println("Jari - Jari Lingkaran : " + jari);
        System.out.println("Volume Lingkaran : " + v);
    }
    
    public void LKLingkaran()
    {
        System.out.println("Luas Lingkaran : " + ling.Lingkaran());
        System.out.println("Keliling Lingkaran : " + ling.Keliling());
    }
    
    public double Tabung()
    {
        return Lingkaran() * t;
    }
    
    public double LuasTabung()
    {
        return (2 * Lingkaran() + (Keliling() * t)); 
    }
    
}

