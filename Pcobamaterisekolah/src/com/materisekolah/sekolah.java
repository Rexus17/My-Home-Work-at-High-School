/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**                                                     "Date: 09 - 09 -21"
 *
 * @author Asus                                             "ABSTRACTION"
 */
public class sekolah extends siswa {
    
    public static void main(String[] args) {
        
        sekolah obj1 = new sekolah();
        obj1.kelas10();
        obj1.kelas11();
        obj1.kelas12();
        
    }
    
    @Override
    void kelas10() {
        
        String kelas10a = "Jam 07.00 - 08.00";
        String kelas10b = "Jam 08.00 - 09.00";
        
        System.out.println("======== SCHEDULE CLASS 10 ========");
        System.out.println("Jadwal Kelas 10 Sesi 1: " + kelas10a + " ,Harap Mematuhi Prokes!");
        System.out.println("Jadwal Kelas 10 Sesi 2: " + kelas10b + " ,Harap Mematuhi Prokes!");
        
    }
    
    @Override
    void kelas11() {
        
        String kelas11a = "Jam 09.00 - 10.00";
        String kelas11b = "Jam 10.00 - 11.00";
        
        System.out.println("======== SCHEDULE CLASS 11 ========");
        System.out.println("Jadwal Kelas 11 Sesi 1: " + kelas11a + " ,Harap Mematuhi Prokes!");
        System.out.println("Jadwal Kelas 11 Sesi 2: " + kelas11b + " ,Harap Mematuhi Prokes!");
        
    }
    
    @Override
    void kelas12() {
        
        String kelas12a = "Jam 01.00 - 02.00";
        String kelas12b = "Jam 02.00 - 03.00";
        
        System.out.println("======== SCHEDULE CLASS 12 ========");
        System.out.println("Jadwal Kelas 12 Sesi 1: " + kelas12a + " ,Harap Mematuhi Prokes!");
        System.out.println("Jadwal Kelas 12 Sesi 2: " + kelas12b + " ,Harap Mematuhi Prokes!");
        
    }
    
}
