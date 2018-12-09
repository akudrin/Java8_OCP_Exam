/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.stream.Stream;

/**
 *
 * @author andreikudrin
 */
public class ParallelStreams {

    public static void main(String[] args) {
        long start = System.nanoTime();
        String first = Stream.of("a", "b", "c", "d", "e")
                .parallel().findAny().get();
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(
                first + " found in " + duration + " milliseconds");

    }

}
