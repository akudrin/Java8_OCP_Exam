/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author andreikudrin
 */
public class IntStream_1 {
    public static void main(String[] args) {
        IntStream is1 = IntStream.range(1, 3);
           IntStream is2 = IntStream.rangeClosed(1, 3);
              IntStream is3 = IntStream.concat(is1, is2);
          Object val = is3.boxed().collect(Collectors.groupingBy(k->k));
          System.out.println(val);
        
    }
    
}
