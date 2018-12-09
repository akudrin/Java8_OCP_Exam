/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.BiFunction;

/**
 *
 * @author andreikudrin
 */
public class BiFunction_1 {
    
   
    
    public static void main(String[] args) {
       BiFunction<String, String, String> function1 = (s1, s2) -> {
			String s3 = s1 + s2;
			return s3;
		};
		System.out.println(function1.apply("BORAJI", ".COM"));

		BiFunction<Integer, Integer, Integer> function2 = (a, b) -> a + b;
		System.out.println(function2.apply(100, 200));
    }
    
}
