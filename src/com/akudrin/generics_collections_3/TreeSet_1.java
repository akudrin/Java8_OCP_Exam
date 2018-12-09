/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author andreikudrin
 */
public class TreeSet_1 {

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("b")); // true
        System.out.println(set.add("x")); // true
        System.out.println(set.add("h")); // true
        System.out.println(set.add("b")); // false
        System.out.println(set); // [b, h, x]
    }

}
