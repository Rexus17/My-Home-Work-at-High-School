/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryThread;

/**
 *
 * @author RIFAI
 */
class MyThread1 extends Thread
{

    // mengimplementasikan method run() yang dideklarasikan didalam interface Runnable
    public void run()
    {
        try 
        {
            for (int i = 0; i < 10; i++) {
                System.out.println("Thread Pertama: Detik ke - " + (i+1));
                if (i != 9) 
                {
                    sleep(1000);
                } else 
                {
                    System.out.println("Thread Pertama Selesai... \n");
                }
            }
        } catch (InterruptedException ie) 
        {
            System.out.println(ie.getMessage());
        }
    }
    
}


class MyThread2 extends Thread
{
    
    // mengimplementasikan method run() yang dideklarasikan didalam interface Runnable
    public void run()
    {
        try 
        {
            for (int i = 0; i < 5; i++) 
            {
                System.out.println("Thread Ke Dua: Detik Ke - " + (i+1));
                if (i != 4) 
                {
                    System.out.println();
                    sleep(1000);
                } else 
                {
                    System.out.println("Thread Ke Dua Selesai... \n");
                }
            }
        } catch (InterruptedException ie) 
        {
            System.out.println(ie.getMessage());
        }
    }
    
}


class DemoMultipleThread
{
    
    public static void main(String[] args) 
    {
        MyThread1 t1 = new MyThread1();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
    
}


/*
    try dan catch digunakan untuk menangkap jenis error InterruptedException agar program tidak crash saat error itu terjadi.
*/
