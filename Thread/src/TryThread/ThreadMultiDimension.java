/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryThread;

import static java.lang.Thread.sleep;

/**                                             MEMBUAT MULTIDIMENSION 
 *
 * @author RIFAI
 */
public class ThreadMultiDimension extends Thread
{
    
    MyThread thread;
    int jumlah = 7;
    
    public static void main(String[] args) 
    {
        
        ThreadMultiDimension test = new ThreadMultiDimension();
        test.proses_satu();
        test.proses_dua();
    }
    
    void proses_satu()
    {
        try 
        {
            for (int l = 0; l <= jumlah; l++) 
            {
                System.out.println("Nomor : " + l);                          // menampilkan hasil
                sleep(1000);                                            // waktu pending
            }
        } catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }

    }
    
    public void proses_dua()
    {
        try 
        {
            for (int l = 0; l <= jumlah; l++) 
            {
                System.out.println("Salam Programmer");                      // menampilkan hasil
                sleep(1000);                                                 // waktu pending
            }
        } catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }
    }
    
}
