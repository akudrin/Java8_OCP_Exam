/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author andreikudrin
 */
public class IO_4 {
    public static void main(String[] args) throws IOException {
        File myDir = new File("dir3");   // create an object
        myDir.mkdir();                    // create an actual directory
         File myFile = new File(myDir, "file3");
         myFile.createNewFile();
    }
    
}
