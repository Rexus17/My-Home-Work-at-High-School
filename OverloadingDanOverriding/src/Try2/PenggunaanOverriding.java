/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try2;

// import Try2.Hewan;
// import Try2.Mamalia;

/**
 *
 * @author RIFAI
 */
public class PenggunaanOverriding 
{

    public static void main(String[] args) 
    {
        // TODO auto generated method stub
        Hewan h = new Hewan();
        Mamalia m = new Mamalia();
        Burung b = new Burung();
        Ikan i = new Ikan();
        Hewan hb = new Hewan();
        
        h.bergerak();
        hb.berkembangBiak();
        m.berlari();
        b.terbang();
        i.berenang();
    }
    
}
