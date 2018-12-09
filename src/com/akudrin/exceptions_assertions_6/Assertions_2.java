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
public class Assertions_2 {
    
    private static void doStuff(int x, int y) {
    assert (y > x): "y is " + y + " x is " + x;
    // expression's string value is added to the stack trace
    }
    
    public static void main(String[] args) {
       
        doStuff(0, 0);
    }
    
    
}
