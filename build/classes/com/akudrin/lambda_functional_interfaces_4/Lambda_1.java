/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author andreikudrin
 */
public class Lambda_1 {

    public static void main(String[] args) {
//        Stream.of(3, 1, 4, 1, 5, 9)
//                .forEach(x -> System.out.println(x));
//        Stream.of(3, 1, 4, 1, 5, 9)
//                .forEach(System.out::println);
//        Consumer<Integer> printer = System.out::println;
//        Stream.of(3, 1, 4, 1, 5, 9)
//                .forEach(printer);
//        Stream.generate(Math::random)
//                .limit(10)
//                .forEach(System.out::println);
        List<String> strings
                = Arrays.asList("this", "is", "a", "list", "of", "strings");
        List<String> sorted = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2))
                .collect(Collectors.toList());
//List<String> sorted = strings.stream()
//.sorted(String::compareTo)
//.collect(Collectors.toList());
    }
}
