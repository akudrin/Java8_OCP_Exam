/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author andreikudrin
 */
public class MarkIsSupported {
    
     public static String pullBytes(InputStream is , int count) throws IOException {
        final StringBuffer sb = new StringBuffer();
        is.skip(2);
        if(is.markSupported()) {
            is.mark(1);
            for (int i = 0; i < count; i++) 
                sb.append((char)is.read());
                is.reset();
            }
            sb.append(is.read() + is.read());
            sb.append((char)is.read());
            return sb.toString();
        
    }

    public static void main(String[] args) throws Exception {
        String exampleString = "LEMUR";
        InputStream stream = new ByteArrayInputStream(exampleString.getBytes(StandardCharsets.UTF_8));
        System.out.println(pullBytes(stream, 3));

    }
    
}
