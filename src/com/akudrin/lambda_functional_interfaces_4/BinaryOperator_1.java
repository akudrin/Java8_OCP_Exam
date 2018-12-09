/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 *
 * @author andreikudrin
 */
public class BinaryOperator_1 {

    public static void main(String[] args) {
        BinaryOperator<String> binOp = (t, u) -> t.concat(u);
        System.out.println(binOp.apply("Hello", " there"));

        BinaryOperator<Integer> biOp
                = BinaryOperator.maxBy(Comparator.naturalOrder());
        System.out.println(biOp.apply(28, 8));
    }

}
