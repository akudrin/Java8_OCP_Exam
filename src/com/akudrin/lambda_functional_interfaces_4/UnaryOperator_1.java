/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
/**
 *
 * @author andreikudrin
 */
public class UnaryOperator_1 {

    public static void main(String[] args) {
        UnaryOperator<String> uOp = t -> t.substring(0, 2);
        System.out.println(uOp.apply("Hello"));
       
        int[] a = {1,2,3,4,5,6,7,8};
        int sum = sumNumbers(a, t -> t * 2);
        System.out.println(sum);


    }
    static int sumNumbers(int[] a, IntUnaryOperator unary) {
         int sum = 0;
         for(int i : a) {
                 sum += unary.applyAsInt(i);
         }
         return sum;
}

}
