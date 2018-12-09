/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author andreikudrin
 */
public class Streams_2 {
    public static void main(String[] args) {
        //creating a stream from a java.util.Collection 
        //implementation using the stream() method
        List<String> words1 = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
        Stream<String> stream1 = words1.stream();
        
        //creating a stream from individual values
        Stream<String> stream2 = Stream.of("hello","hola", "hallo", "ciao");
        
        //stream from an array
        String[] words2 = {"hello", "hola", "hallo", "ciao"};
        Stream<String> stream3 = Stream.of(words2);
    }
    
}
