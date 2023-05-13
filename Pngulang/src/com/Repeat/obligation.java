/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Repeat;

/**
 *
 * @author Asus
 */
public class obligation extends family {
    
    public static void main(String[] args) {
        obligation job1 = new obligation();
        job1.father();
        job1.mother();
        job1.firstSon();
        job1.lastSon();
    }

    @Override
    void father() {
        String obj1 = "Direct Wat To Good";
        String obj2 = "Working";
        
        System.out.println("==== Obligation Father ====");
        System.out.println("Assegment 1: " + obj1 + " Hard");
        System.out.println("Assigment 2: " + obj2 + " Medium");
    }

    @Override
    void mother() {        
        String obj1 = "Be Hero To All People In Home";
        String obj2 = "House Wife";
        
        System.out.println("==== Obligation Mother ====");
        System.out.println("Assegment 1: " + obj1 + " Hard");
        System.out.println("Assigment 2: " + obj2 + " Medium");    
    }

    @Override
    void firstSon() {        
        String obj1 = "Respect To Parents";
        String obj2 = "Studing";
        
        System.out.println("==== Obligation First Son ====");
        System.out.println("Assegment 1: " + obj1 + " Easy");
        System.out.println("Assigment 2: " + obj2 + " Easy");    
    }

    @Override
    void lastSon() {        
        String obj1 = "Respect To Parents";
        String obj2 = "Studing";
        
        System.out.println("==== Obligation Last Son ====");
        System.out.println("Assegment 1: " + obj1 + " Easy");
        System.out.println("Assigment 2: " + obj2 + " Easy");    
    }
    
}
