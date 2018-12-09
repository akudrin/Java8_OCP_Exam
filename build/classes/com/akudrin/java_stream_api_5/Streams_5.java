/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.stream.IntStream;

/**
 *
 * @author andreikudrin
 */
public class Streams_5 {

    public static void main(String[] args) {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        IntStream s = IntStream.of(digits);
        long n = s.count();
       // System.out.println(s.findFirst()); // An exception is thrown
       System.out.println(IntStream.of(digits).findFirst()); // OK
    }

}
