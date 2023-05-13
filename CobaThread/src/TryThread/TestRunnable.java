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
class TestRunnable implements Runnable
{

    // mengimplementasikan method run() yang dideklarasikan didalam interface Runnable
    public void run()
    {
        // output
        System.out.println("Thread Anak dieksekusi");
    }
    
    
}


class penerapanRunnable
{
        
    // main method
    public static void main(String[] args) 
    {
        // (LANGKAH KE 1) : membuat object Runnable
        TestRunnable obj = new TestRunnable();
        // (LANGKAH KE 2) : membuat object THREAD dengan melewatkan object Runnable
        Thread t = new Thread(obj);
        // (LANGKAH KE 3) : menjalankan THREAD
        t.start();
        System.out.println("Thread Utama dieksekusi");
    }
        
}

