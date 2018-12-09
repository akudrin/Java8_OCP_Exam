/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.BiConsumer;

/**
 *
 * @author andreikudrin
 */
public class BiConsumer_1 {

    public static void main(String[] args) {
        BiConsumer<String,String> consumeStr
                = (t, u) -> System.out.println(t + " " + u);
        consumeStr.accept("Hi", "there");

        BiConsumer<String, String> first = (t, u) -> System.out.println(t.toUpperCase() + u.toUpperCase());
        BiConsumer<String, String> second = (t, u) -> System.out.println(t.toLowerCase() + u.toLowerCase());
        first.andThen(second).accept("Again", " and again");

    }

}
