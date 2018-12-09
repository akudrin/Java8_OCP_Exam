/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author andreikudrin
 */
public class Collections_1 {
    
    public static void main(String[] args) {
        Object o = new Object();
       LinkedHashSet s = new LinkedHashSet();
        s.add("o");
        s.add(o);
    }
            
    
}
