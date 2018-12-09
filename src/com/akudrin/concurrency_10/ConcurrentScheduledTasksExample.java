/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.concurrency_10;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author andreikudrin
 */
public class ConcurrentScheduledTasksExample {
 
    public static void main(String[] args) {
 
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
 
        CountDownClock clock1 = new CountDownClock("A");
        CountDownClock clock2 = new CountDownClock("B");
        CountDownClock clock3 = new CountDownClock("C");
 
        scheduler.scheduleWithFixedDelay(clock1, 3, 10, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(clock2, 3, 15, TimeUnit.SECONDS);
        scheduler.scheduleWithFixedDelay(clock3, 3, 20, TimeUnit.SECONDS);
 
    }
}

class CountDownClock extends Thread {
    private String clockName;
 
    public CountDownClock(String clockName) {
        this.clockName = clockName;
    }
 
    public void run() {
        String threadName = Thread.currentThread().getName();
 
        for (int i = 5; i >= 0; i--) {
 
            System.out.printf("%s -> %s: %d\n", threadName, clockName, i);
 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}