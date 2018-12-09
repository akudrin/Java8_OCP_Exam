/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.BiPredicate;

/**
 *
 * @author andreikudrin
 */
public class BiPredicate_1 {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> divisible
                = (t, u) -> t % u == 0;
        boolean result = divisible.test(10, 5);
        System.out.println(result);
    }

}
