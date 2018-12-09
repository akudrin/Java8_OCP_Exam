/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author andreikudrin
 */
public class NIO_1 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("fileWrite1.txt"); // it's only an object
        System.out.println(Files.exists(path)); // look for a real file
        Files.createFile(path); // create a file!
        System.out.println(Files.exists(path)); // look again
    }

}
