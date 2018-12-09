/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.concurrency_10;

import java.util.Set;

/**
 *
 * @author andreikudrin
 */
public class AllCurrentThreads {
    
    public static void main(String[] args) {
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for(Thread t : threadSet)
            System.out.println(t + " ----- " + t.getState());
    }
}
