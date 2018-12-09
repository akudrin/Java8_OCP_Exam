/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author andreikudrin
 */
public class HashSet_1 {

    public static void main(String[] args) {
        // Creating a HashSet with an initial capacity of 10
        Set<String> set = new HashSet<>(10);
// add() returns true if the element is not already in the set
        System.out.println(set.add("b")); // true
        System.out.println(set.add("x")); // true
        System.out.println(set.add("h")); // true
        System.out.println(set.add("b")); // false
        System.out.println(set.add(null)); // true
        System.out.println(set.add(null)); // false
        System.out.println(set); // [null, b, x, h]
    }

}
