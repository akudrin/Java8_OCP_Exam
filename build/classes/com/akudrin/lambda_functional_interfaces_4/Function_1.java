/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.Function;

/**
 *
 * @author andreikudrin
 */
public class Function_1 {

    public static void main(String[] args) {
        Function<String, String> f1 = s -> {
            return s.toUpperCase();
        };
        Function<String, String> f2 = s -> {
            return s.toLowerCase();
        };
        System.out.println(f1.compose(f2).apply("Compose"));
        System.out.println(f1.andThen(f2).apply("AndThen"));
    }

}
