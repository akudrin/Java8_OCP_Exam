/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.concurrency_10;

/**
 *
 * @author andreikudrin
 * 
 * No two threads will be allowed to enter the b method at the same time.
 * No two threads will be allowed to enter the t1.a() method at the same time.
 * One thread calling t1.a() will not interfere with another thread calling t2.a().
 * 
 * 
 */
public class SynchronizedMethods {
    synchronized void a() {

    }

    static synchronized void b() {

    }

    public static void main(String args[]) {
        final SynchronizedMethods t1 = new SynchronizedMethods();
        final SynchronizedMethods t2 = new SynchronizedMethods();
        // Some threads that just mess with the test objects.
        Thread test1 = new Thread() {
            public void run() {
                while (true) {
                    t1.a();
                }
            }
        };
        Thread test2 = new Thread() {
            public void run() {
                while (true) {
                    t2.b();
                }
            }
        };
        Thread test3 = new Thread() {
            public void run() {
                while (true) {
                    t1.a();
                    t1.b();
                    t2.a();
                    t2.b();
                }
            }
        };
        test1.start();
        test2.start();
        test3.start();
    }
    
}
