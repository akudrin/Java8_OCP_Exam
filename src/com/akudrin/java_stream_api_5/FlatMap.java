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
public class FlatMap {

    public static void main(String[] args) {
        List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
        List<Character> eToG = Arrays.asList('e', 'f', 'g');
        Stream<List<Character>> stream = Stream.of(aToD, eToG);

        //the follwing is not allowed
        //stream .map(c -> (int)c)
        
        stream
                .flatMap(l -> l.stream())
                .map(c -> (int) c)
                .forEach(i -> System.out.format("%d ", i));

        stream
                .flatMap(l -> l.stream())
                .peek(System.out::print)
                .map(c -> (int) c)
                .forEach(i -> System.out.format("%d ", i));
    }

}
