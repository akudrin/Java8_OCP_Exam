/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.Predicate;

/**
 *
 * @author andreikudrin
 */
public class Predicate_1 {

    public static void main(String[] args) {
        Predicate<String> startsWithA = new Predicate<String>() {
            @Override
            public boolean test(String t) {
                return t.startsWith("A");
            }
        };
        boolean result = startsWithA.test("Arthur");
        System.out.println(result);
    }

}
