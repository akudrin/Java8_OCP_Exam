/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.exceptions_assertions_6;

/**
 *
 * @author andreikudrin
 */
public class Exceptions_4 {

    public static void main(String[] args) {
        try (One one = new One()) {
            throw new Exception("Try");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.err.println("suppressed:" + t);
            }
        }
    }
}

class One implements AutoCloseable {

    public void close() throws IOException {
        throw new IOException("Closing");
    }
}
