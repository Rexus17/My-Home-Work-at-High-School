/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try2;

/**
 *
 * @author RIFAI
 */
public class Hewan 
{

    public void bergerak()
    {
        System.out.println("Hewan bergerak sesuai kemampuanya");
    }
    
    public void berkembangBiak()
    {
        System.out.println("Hewan berkembang biak sesuai kemampuanya");
    }
    
}

class Mamalia extends Hewan 
{

    // overriding method parent class
    public void bergerak()
    {
        System.out.println("Mamalia bergerak sebagian besar dengan kakinya");
    }
    
    public void berlari()
    {
        System.out.println("Sebagian Mamalia dapat berlari");
    }    
    
}

class Burung extends Hewan
{
    
    // overriding method parent class
    public void bergerak()
    {
        System.out.println("Burung bergerak sebagian besar dengan kakinya");
    }
    
    public void terbang()
    {
        System.out.println("Sebagian burung dapat terbang");
    }
    
}

class Ikan extends Hewan
{
    
    // overriding method parent class
    public void bergerak()
    {
        System.out.println("Ikan bergerak sebagian besar dengan siripnya");
    }
    
    public void berenang()
    {
        System.out.println("Sebagian ikan dapat berenang");
    }
    
}
