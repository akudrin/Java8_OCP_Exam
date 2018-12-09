/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.ObjIntConsumer;

/**
 *
 * @author andreikudrin
 */
public class BiConsumer_2 {
   
    static void printList(int[] a, ObjIntConsumer<String> c) {
    for(int i : a) {
        c.accept("Number:", i);
    }
}
    public static void main(String[] args) {
        
        int[] a = {1,2,3,4,5,6,7,8};
        printList(a, (t, i) -> System.out.println(t + i));


    }
    
}
