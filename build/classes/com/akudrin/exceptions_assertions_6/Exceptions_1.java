/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.exceptions_assertions_6;

/**
 *
 * @author andreikudrin
 */
public class Exceptions_1 {

    public static void main(String[] args) {

        
        if (args.length == 0) {
            // no arguments passed – display an error to the user
            //System.out.println("Error: No input passed to echo command... ");
            //System.exit(-1);
            throw new IllegalArgumentException("No input passed to echo command");
            
        } else {
            for (String str : args) {
// command-line arguments are separated and passed as an array
// print them by adding a space between the array elements
                System.out.print(str + " ");
            }
        }
    }

}
