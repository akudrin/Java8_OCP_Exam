/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andreikudrin
 */
public class Streams_3 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Stream.of(nums).count());

        Integer[] nums1 = {1, 2, 3, 4, 5};
        // It prints 5!
        System.out.println(Stream.of(nums1).count());

        int[] nums2 = {1, 2, 3, 4, 5};
        // It also prints 5!
        System.out.println(Arrays.stream(nums2).count());

        int[] nums3 = {1, 2, 3, 4, 5};
        // It also prints 5!
        System.out.println(IntStream.of(nums3).count());

        //Don't use Stream<T>.of() when working with primitives.
        Stream<Double> s = Stream.generate(new Supplier<Double>() {
            public Double get() {
                return Math.random();
            }
        }).limit(5);

        Stream<Double> s1 = Stream.generate(() -> Math.random()).limit(5);
        Stream<Double> s2 = Stream.generate(Math::random).limit(5);
        Stream<Integer> s3 = Stream.iterate(1, t -> t * 2).limit(5);

        Stream.Builder<String> builder
                = Stream.<String>builder()
                        .add("h").add("e").add("l").add("l");
        builder.accept("o");
        Stream<String> s4 = builder.build();

        // stream of 1, 2, 3
        IntStream s5 = IntStream.range(1, 4);
// stream of 1, 2, 3, 4
        IntStream s6 = IntStream.rangeClosed(1, 4);
        
        //That returns an IntStream of five random ints from one (inclusive) 
        //to ten (exclusive).
        IntStream s7 = new Random().ints(5, 1, 10);
    }

}
