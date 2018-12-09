/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.IntPredicate;

/**
 *
 * @author andreikudrin
 */
public class Predicate_2 {

    public static void main(String[] args) {
        IntPredicate even =t->t%2==0;
        boolean result = even.test(2);
        System.out.println(result);
    }
}
