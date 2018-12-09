/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.Consumer;

/**
 *
 * @author andreikudrin
 */
public class Consumer_1 {

    public static void main(String[] args) {
        Consumer<String> consumeStr = t -> System.out.println(t);
        consumeStr.accept("Hi");

        Consumer<String> first = t
                -> System.out.println("First:" + t);
        Consumer<String> second = t
                -> System.out.println("Second:" + t);
        first.andThen(second).accept("Hi");
    }

}
