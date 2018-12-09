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

class A extends Thread{
    static protected int i = 0;
    public void run() {
        for (; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}


public class Threads_1 extends A{
    
    public void run(){
        for (; i < 5; i++) {
            System.out.println("World");
        }
    }
    
    public static void main(String[] args) {
        Thread t1 = new A();
        Thread t2 = new Threads_1();
        t2.start();
        t1.start();
    }
    
}
