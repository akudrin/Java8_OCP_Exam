/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.*;

/**
 *
 * @author andreikudrin
 */
public class IO_1 {

    public static void main(String[] args) {
        try { // warning: exceptions possible
            boolean newFile = false;
            File file = new File // it's only an object
                    ("fileWrite1.txt");
            System.out.println(file.exists());
             System.out.println(file.length());// look for a real file
            newFile = file.createNewFile(); // maybe create a file!
            System.out.println(newFile); // already there?
            System.out.println(file.exists()); // look again
        } catch (IOException e) {
        }
    }

}
