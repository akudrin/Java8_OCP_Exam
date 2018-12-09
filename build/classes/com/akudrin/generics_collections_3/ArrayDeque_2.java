/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.ArrayDeque;

/**
 *
 * @author andreikudrin
 */
public class ArrayDeque_2 {

    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("a"); // [a]
        stack.push("b"); // [b, a]
        stack.push("c");
        stack.push("d");
        System.out.println(stack);
        
        System.out.println(stack.peek()); // b [b, a]
        System.out.println(stack.poll()); // b [a]
        System.out.println(stack.peek()); // a [a]
        System.out.println(stack.poll()); // a []
        System.out.println(stack.peek()); // null
        stack.offer("!!!!");
         System.out.println(stack);
    }

}
