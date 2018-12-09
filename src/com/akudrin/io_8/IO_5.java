/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author andreikudrin
 */
public class IO_5 {
    
    
    
    public static void main(String[] args) throws IOException {
    
        
                Stream<String> stream = Files.lines(Paths.get("script.js"));
                stream.forEach(l->System.out.println(l));
        
        
    }
         
    
}
