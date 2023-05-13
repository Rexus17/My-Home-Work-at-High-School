/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryThread;

/**                                     MEMBUAT SINGLE THREAD
 *
 * @author RIFAI
 */
public class MyThread extends Thread
{
    
    // dmembuat variabel
        int jumlah = 10;
    
    // main method
    public static void main(String[] args) 
    {
        
        // membuat object
        MyThread t = new MyThread();
        
        // menjalankan THREAD
        t.start();
        
    }
    
    // method untuk menjalankan THREAD
    public void run()
    {
        try 
        {
            for (int l = 1; l <= jumlah; l++) 
            {
                System.out.println("Nomor : " + l);         // menampilkan output
                sleep(1000);                                // waktu pending
            }
        } catch (InterruptedException ex) 
        {
            ex.printStackTrace();
        }
    }
    
}


/*
    try dan catch digunakan untuk menangkap jenis error InterruptedException agar program tidak crash saat error itu terjadi.
*/
