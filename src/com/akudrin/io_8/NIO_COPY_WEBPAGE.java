/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author andreikudrin
 */
public class NIO_COPY_WEBPAGE {
    public static void main(String[] args) throws IOException {
        
         Path targetFile = Paths.get("Google.html");
 
URI uri = URI.create("http://google.com");
 
try (InputStream inputStream = uri.toURL().openStream()) {
    Files.copy(inputStream, targetFile);
} catch (IOException ex) {
    System.err.format("I/O Error when copying file");
}

        System.out.println(Paths.get(".").toRealPath());
    }
    
}
