/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andreikudrin
 */
public class IO_3 {

    public static void main(String[] args) throws IOException {

        File myDir = new File("myDir"); //create an object
        myDir.mkdir(); // creates directory

        File myFile = new File(myDir, "myFile.txt");

        myFile.createNewFile();
        PrintWriter pw = new PrintWriter(myFile);
        pw.println("new stuff");
        pw.flush();
        pw.close();

        String[] files = new String[100];
        File search = new File("nbproject");
        files = search.list(); // create the list
        for (String fn : files) // iterate through it
        {
            System.out.println("found " + fn);
        }

    }

}
