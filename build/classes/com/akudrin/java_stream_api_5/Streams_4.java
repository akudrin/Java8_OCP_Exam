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
public class Streams_4 {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("m", "k", "c", "t")
                .sorted()
                .limit(3);

        s.forEach(System.out::println);

        List<String> myList
                = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList
                .stream()
                .filter(s1 -> s1.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }

}
