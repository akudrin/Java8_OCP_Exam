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
class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Important job running in MyRunnable");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        MyRunnable r = new MyRunnable();
        Thread t = new Thread(r); // Pass your Runnable to the Thread
        //You can pass a single Runnable instance to multiple Thread objects so that the
        //same Runnable becomes the target of multiple threads
        t.setName("Thread-V1");
        System.out.println(t.getId());
        t.start();
        Thread foo = new Thread(r);
        Thread bar = new Thread(r);
        Thread bat = new Thread(r);
        System.out.println(foo.getState());
        System.out.println(foo.getName());
         System.out.println(bar.getName());
         System.out.println(t.getName());
        foo.start();
        bar.start();
        bat.start();
         System.out.println(foo.getState());
          System.out.println(foo.getState());
    }

}
