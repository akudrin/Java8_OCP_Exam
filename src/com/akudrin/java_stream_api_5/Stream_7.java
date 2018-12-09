/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author andreikudrin
 */
public class Stream_7 {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
list.stream()
    .sorted()
    .forEach(System.out::println);
    
    List<String> strings =
    Arrays.asList("Stream","Operations","on","Collections");
strings.stream()
    .sorted( (s1, s2) -> s2.length() - s1.length() )
    .forEach(System.out::println);

    List<String> strings1 =
    Arrays.asList("Stream","Operations","on","Collections");
strings1.stream()
    .sorted( Comparator.comparing(
                (String s) -> s.length()).reversed() )
    .forEach(System.out::println);
    
    
    }
    
    
    
}
