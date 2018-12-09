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
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
// Obtain a random number from 1 to 10
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 1; i <= count; i++) {
            System.out.println("Running..." + i);
        }
        return count;
    }

    public static void main(String[] args) {
        Callable<Integer> c = new MyCallable();
        ExecutorService ex
                = Executors.newCachedThreadPool();
        Future<Integer> f = ex.submit(c); // finishes in the future
        try {
            Integer v = f.get(); // blocks until done
            System.out.println("Ran:" + v);
        } catch (InterruptedException | ExecutionException iex) {
            System.out.println("Failed");
        }
    }
}
