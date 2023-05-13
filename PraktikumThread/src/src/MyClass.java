/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author RIFAI
 */
public class MyClass 
{
    public static void main(String[] args) 
    {
        Thread p1 = new Proses1();
        Thread p2 = new Proses2();
        
        p1.start();
        p2.start();
    }
}   

class Proses1 extends Thread 
{
    @Override
    public void run()
    {
//        try
//        {
//            sleep(millis:200);
//        } catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
        System.out.println("Proses 1 Berjalan");
    }
}

class Proses2 extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Proses 2 Berjalan");
    }
}


