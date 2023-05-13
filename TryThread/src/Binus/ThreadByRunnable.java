/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Binus;

import static java.lang.Thread.sleep;

/**
 *
 * @author RIFAI
 */
public class ThreadByRunnable implements Runnable 
{
    
    public static void main(String[] args) 
    {
        // membuat object
        Runnable runnable = new ThreadByRunnable();
        
        // membuat variabel
        // jumlah loop & thread yang akan diciptakan
        int l = 7;
        
        // sequential run
        System.out.println("SEQUENTIAL RUN");
        SequentialRun(l);
        
        // multi threading run
        System.out.println("\nMULTI THREADING");
        for (int i = 0; i < l; i++) 
        {
           Thread thread = new Thread(runnable);                                // ciptakan 7 thread (t0, t1, t2, t3, t4, t5, t6, t7)
           thread.start();                                                      // ini akan menjalankan fungsi RUN
        }
    }
    
    // sequential run
    public static void SequentialRun(int l) 
    {
        // nested loop
        for (int i = 0; i <= l; i++)                                            // 7x Run
        {
            for (int j = 1; j <= 5; j++)                                        // 5x Print
            {
                System.out.println("Number : " + j + ", Inside : Loop-" + i);
            }
        }
    }
    
    // multi threading run
    public void run() 
    {
        for (int j = 1; j <= 5; j++)                                            // 5x Print (1, 2, 3, 4, 5)
        {
            System.out.println("Number : " + j + ", Inside : Loop-" + Thread.currentThread().getName());
        }
    }
    
}
