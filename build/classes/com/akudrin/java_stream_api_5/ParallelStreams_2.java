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
public class ParallelStreams_2 {

    public static void main(String[] args) {
        double start = System.nanoTime();
        long c = IntStream.rangeClosed(0, 1_000_000_000)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();
        double duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Got " + c + " in " + duration + " milliseconds");
    }

}
