/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.program;

/**
 *
 * @author Asus
 */
public class cPolaLooping {
    
    public static void main(String[] args) {
        
        // POLA 1 !!!
        
        int batas, y , x;
        
        batas = 5;
        
        // Perulangan Y1
        for( y = 1; y <= batas; y++ ){
            
            //Perulangan SPASI1
            for (int spasi = y; spasi > 1; spasi--){
                System.out.print(" ");
            }
            
            // Perulangan X1
            x = 1;
            while ( x <= batas ){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
        
        // Perulangan Y2
        for( y = 1; y < batas; y++ ){
            
            //Perulangan SPASI2
            for (int spasi = y; spasi < batas-1; spasi++){
                System.out.print(" ");
            }
            
            // Perulangan X2
            x = 1;
            while ( x <= batas ){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
        
        
        // POLA 2 !!!
        
        System.out.println();
        
        // Perulangan Y1
        for (y = batas; y >= 1; y--){
            
            // Perulangan X1
            x = 1;
            while(x <= y){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
        
        // Perulangan Y2
        for (y = 1; y <= batas; y++){
            
            // Perulangan X2
            x = 1;
            while(x <= y){
                System.out.print(x);
                x++;
            }
            System.out.println();
        }
        
        
        
        
        
        
        
        
        
    }
    
}
