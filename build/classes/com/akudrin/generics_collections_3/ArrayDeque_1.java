/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 * @author andreikudrin
 */
public class ArrayDeque_1 {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        System.out.println(queue.offer("a")); // true [a]
        System.out.println(queue.offer("b")); // true [a, b]
        System.out.println(queue.peek()); // a [a, b]
        System.out.println(queue.poll()); // a [b]
        System.out.println(queue.peek()); // b [b]
        System.out.println(queue.poll()); // b []
        System.out.println(queue.peek()); // null
    }

}
