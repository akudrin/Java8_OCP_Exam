/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.exceptions_assertions_6;

/**
 *
 * @author andreikudrin
 * Assertions are typically enabled when an application is being tested and
 * debugged, but disabled when the application is deployed.
 */
public class Assertions_1 {
    
    
    private static void methodA(int num) {
    assert (num>=0); // throws an AssertionError
        System.out.println(num);
    }
 
    
    public static void main(String[] args) {
        methodA(-33);
        
    }
    
    
}
