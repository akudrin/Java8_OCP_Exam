/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.concurrency_10;

/**
 *
 * @author andreikudrin
 */
class FooRunnable implements Runnable {

    public void run() {
        for (int x = 1; x < 6; x++) {
            System.out.println("Runnable running " + x);
        }
    }
}

public class TestThreads {

    public static void main(String[] args) {
        FooRunnable r = new FooRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
