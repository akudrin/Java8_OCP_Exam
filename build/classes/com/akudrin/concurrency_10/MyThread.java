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
class MyThread extends Thread {

    public void run() {
        System.out.println("Important job running in MyThread");
    }
    //overloaded method run() 
    public void run(String s) {
        System.out.println("String in run is " + s);
    }
    
    public static void main(String[] args) {
        
        MyThread t = new MyThread();
        t.start();
    }
}
