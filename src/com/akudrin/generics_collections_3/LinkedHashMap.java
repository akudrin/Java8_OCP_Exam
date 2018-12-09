/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.Set;

/**
 *
 * @author andreikudrin
 */
public class LinkedHashMap {
    
    public static void main(String[] args) {
        java.util.LinkedHashMap<Integer, String> map 
      = new java.util.LinkedHashMap<>(16, .75f, true);
    map.put(1, null);
    map.put(2, null);
    map.put(3, null);
    map.put(4, null);
    map.put(5, null);
    
     Set<Integer> keys = map.keySet();
     
        System.out.println(keys);
        
        map.get(4);
        
        System.out.println(keys);
       
         map.put(2, "Hello");
         
         System.out.println(keys);
    }
    
}
