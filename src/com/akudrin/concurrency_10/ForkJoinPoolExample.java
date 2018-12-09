/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.concurrency_10;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author andreikudrin
 */
public class ForkJoinPoolExample {
    public static void main(String[] args) {
        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool);
        
        System.out.println(Integer.max(3, 4));
    }
    
}
