/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * Overriding bisa lebih dari satu Class
 * 
 */
package Try1;

/**
 *
 * @author RIFAI
 */
public class Komputer
{

    String cekInfo()
    {
        return "Ini berasal dari class Komputer";
    }
    
}

class Laptop extends Komputer
{
    
    @Override
    String cekInfo()
    {
        System.out.println(super.cekInfo());
        return "Ini berasal dari class Laptop \n";
    }
    
}

class Handphone extends Komputer
{
    
    @Override
    String cekInfo()
    {
        System.out.println(super.cekInfo());
        return  "Ini berasal dari class Handphone \n";
    }
    
}

class Tablet extends Komputer
{
    
    @Override
    String cekInfo()
    {
        System.out.println(super.cekInfo());
        return  "Ini berasal dari class Tablet \n";
    }
    
}

class belajarJava
{
    
    public static void main(String[] args) 
    {
        Laptop laptopAndi = new Laptop();
        Handphone hpAldo = new Handphone();
        Tablet tabletDini = new Tablet();
        
        System.out.println(laptopAndi.cekInfo());
        System.out.println(hpAldo.cekInfo());
        System.out.println(tabletDini.cekInfo());
    }
    
}
