/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.adv.class_design_2;

import java.util.HashSet;
import java.util.Set;

public enum EnumSingleton { // this is an enum
    INSTANCE; // instead of a class
    private Set<String> availableSeats;

    private EnumSingleton() {
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
        EnumSingleton show = EnumSingleton.INSTANCE; // we don't even
// need a method to
// get the instance
        System.out.println(show.bookSeat(seat));
    }
}
