/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.adv.class_design_2;

import java.util.*;

/**
 *
 * @author andreikudrin
 */
class Singleton {

    private static Singleton INSTANCE;
    private Set<String> availableSeats;

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    private Singleton() { // callers can't create
// directly anymore.
// Must use getInstance()
        availableSeats = new HashSet<String>();
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static void main(String[] args) {
        ticketAgentBooks("1A");
        ticketAgentBooks("1A");
    }

    private static void ticketAgentBooks(String seat) {
        Singleton show = Singleton.getInstance();
        System.out.println(show.bookSeat(seat));
    }
}
