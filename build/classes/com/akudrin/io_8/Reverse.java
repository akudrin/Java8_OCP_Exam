package com.akudrin.io_8;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.*;

public class Reverse {
    public static void main(String[] args) throws Exception {
        
        System.out.println(args[0] + " " + args[1]);
        if (args.length != 2) {
            System.err.println("Usage:  java Reverse "
                + "http://localhost:8080/ServletApp/ReverseServlet"
                + " string_to_reverse");
            System.exit(1);
        }

       
        String stringToReverse = URLEncoder.encode(args[1], "UTF-8");
        
                
        URL url = new URL(args[0]);
       
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
         
        try (OutputStreamWriter out = new OutputStreamWriter(
                connection.getOutputStream())) {
            out.write("string=" + stringToReverse);
        }
         
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        connection.getInputStream()))) {
           
            String decodedString;
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
            }
        }
    }
}