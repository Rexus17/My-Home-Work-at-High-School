/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.bhsjava.create;

/**
 *
 * @author RIFAI
 */
public class StWaktu 
{

    // implementasi variabel
    private int jam;
    private int menit;
    private int detik;
    
    // setel "StWaktu"
    public void setStWaktu(int j, int m, int d)
    {
        // validasi jam, menit dan detik
        if ((j >= 0 && j < 24) && (m >= 0 && m < 60) && (d >= 0 && d < 60))         
        {
            jam = j;
            menit = m;
            detik = d;
        } 
        else 
        {
            throw new IllegalArgumentException(
                    "Jam, Menit dan atau Detik berada diluar Range atau Jangkauan"
            );
        }
    }
    
    // mengubah pada format "StWaktu" universal (HH:MM:SS)
    public String ubahFormatStWaktu()
    {
        // kembalikan nilai "ubahFormatStWaktu"
        return String.format("%02d:%02d:%02d", jam, menit, detik);
    }
    
    // convert menjadi String dalam format StWaktu standar (H:MM:SS AM atau PM)
    public String convertKeString()
    {
        // kembalikan nilai "convertKeString"
        return String.format("%d:%02d:%02d %s", ((jam == 0 || jam == 12) ? 12 : jam % 12), menit, detik, (jam < 12 ? "AM" : "PM"));
    }
    
}
