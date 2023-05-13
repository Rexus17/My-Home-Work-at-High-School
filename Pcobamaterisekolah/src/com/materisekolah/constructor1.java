/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.materisekolah;

/**
 *
 * @author Asus
 */
public class constructor1 {
    
    public static void main(String[] args) {
        
        kotak5 k1, k2;
        k1 = new kotak5();
        k2 = new kotak5();
        
        System.out.println("Volume k1 = " + k1.hitungVolume());
        System.out.println("Volume k2 = " + k2.hitungVolume());
        
    }
    
}
