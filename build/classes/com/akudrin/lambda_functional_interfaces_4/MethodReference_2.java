/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

interface TriFunction<T, U, V, R> {

    R apply(T t, U u, V v);
}

class Sum {

    Integer doSum(String s1, String s2) {
        return Integer.parseInt(s1) + Integer.parseInt(s2);
    }
}

/**
 *
 * @author andreikudrin
 */
public class MethodReference_2 {

    public static void main(String[] args) {
        //anonymous class
        TriFunction<Sum, String, String, Integer> anon
                = new TriFunction<Sum, String, String, Integer>() {
            @Override
            public Integer apply(Sum s, String arg1, String arg2) {
                return s.doSum(arg1, arg2);
            }
        };
        System.out.println(anon.apply(new Sum(), "1", "4"));

        //lambda
        TriFunction<Sum, String, String, Integer> lambda
                = (Sum s, String arg1, String arg2) -> s.doSum(arg1, arg2);
        System.out.println(lambda.apply(new Sum(), "1", "4"));

        //method reference
        TriFunction<Sum, String, String, Integer> mRef = Sum::doSum;
        System.out.println(mRef.apply(new Sum(), "1", "4"));

    }

}
