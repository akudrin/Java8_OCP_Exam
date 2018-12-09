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
public class NIO_2 {

    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("/java/source");
        Path path2 = Paths.get("/java/source/directory");
        Path file = Paths.get("/java/source/directory/Program.java");
        Files.createDirectory(path1); // create first level of directory
        Files.createDirectory(path2); // create second level of directory
        Files.createFile(file); // create file
        
        Files.createDirectories(path2); // create all levels of directories
        Files.createFile(file); // create file  

    }

}
