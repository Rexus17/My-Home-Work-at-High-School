/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyThread;

/**
 *
 * @author RIFAI
 */
public class MyThread extends Thread                    // extends berfungsi untuk menghubungkan ke THREAD
{
    
    public static void main(String[] args) 
    {
        MyThread t = new MyThread();
        t.start();
    }
    
    // membuat method untuk menjalankan THREAD
    public void run()
    {
        try 
        {
            for(int x = 1; x <= 10; x++)                // looping untuk banyak-nya angka yang akan keluar
            {
                System.out.println("Angka " + x);       // hasil output
                Thread.sleep(1000);                     // waktu pending
            }
        } catch(InterruptedException exc)
        {
            exc.printStackTrace();
        }
    }
    
}


/*
    try dan catch digunakan untuk mengkap jenis error InterruptedException agar program tidak crash saat error itu terjadi.
*/
