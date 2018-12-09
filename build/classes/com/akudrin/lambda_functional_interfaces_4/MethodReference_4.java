/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author andreikudrin
 */
public class MethodReference_4 {

    public static void main(String[] args) {

        // If the constructor takes no arguments, a Supplier will do the job
        // Using an anonymous class
        Supplier<List<String>> s = new Supplier() {
            public List<String> get() {
                return new ArrayList<String>();
            }
        };
        List<String> l = s.get();

        // Using a lambda expression
        Supplier<List<String>> s1 = () -> new ArrayList<String>();
        List<String> l1 = s1.get();

        // Using a method reference
        Supplier<List<String>> s2 = ArrayList::new;
        List<String> l2 = s2.get();

        //If the constructor takes an argument, we can use the Function 
        //interface. For example:
        // Using a anonymous class
        Function<String, Integer> f
                = new Function<String, Integer>() {
            public Integer apply(String s) {
                return new Integer(s);
            }
        };
        Integer i = f.apply("100");

// Using a lambda expression
        Function<String, Integer> f1 = s3 -> new Integer(s3);
        Integer i1 = f1.apply("100");

// Using a method reference
        Function<String, Integer> f2 = Integer::new;
        Integer i2 = f.apply("100");

//If the constructor takes two arguments, we use the BiFunction interface
// Using a anonymous class
        BiFunction<String, String, Locale> f3 = new BiFunction<String, String, Locale>() {
            public Locale apply(String lang, String country) {
                return new Locale(lang, country);
            }
        };
        Locale loc = f3.apply("en", "UK");

// Using a lambda expression
        BiFunction<String, String, Locale> f4 = (lang, country) -> new Locale(lang, country);
        Locale loc1 = f3.apply("en", "UK");

// Using a method reference
        BiFunction<String, String, Locale> f5 = Locale::new;
        Locale loc2 = f3.apply("en", "UK");

    }

}
