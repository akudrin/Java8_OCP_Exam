/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author andreikudrin
 */
public class NIO_3 {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("fileWrite1.txt"); // exists
        Path target = Paths.get("fileWrite2.txt"); // doesn't yet exist
        //Files.copy(source, target); // now two copies of the file
        //Files.delete(target); // back to one copy
        //Files.move(source, target); // still one copy
       // System.out.println(Files.isSameFile(source, target));
      
       
    }

}
