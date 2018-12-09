/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.Optional;

/**
 *
 * @author andreikudrin
 */
public class Optional_1 {
    public static void main(String[] args) {
        Optional<String> summary = Optional.empty();
        Optional<String> summary1 = Optional.of("A summary");
        Optional<String> summary2 = Optional.ofNullable("A summary");
        System.out.println(summary.isPresent());
        System.out.println(summary1.isPresent());
        System.out.println(summary2.isPresent());
        
        Optional<String> nullableStr = Optional.ofNullable(null);
System.out.println(nullableStr);
// prints: Optional.empty
    }
    
}
