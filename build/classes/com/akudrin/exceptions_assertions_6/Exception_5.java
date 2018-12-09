/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.exceptions_assertions_6;

import java.io.Closeable;
import java.io.IOException;

public class Exception_5 {

    class Lamb implements Closeable {

        public void close() {
            throw new RuntimeException("a");
        }
    }

    public static void main(String[] args) {
        new Exception_5().run();
    }

    public void run() {
        try (Lamb l = new Lamb();) {
            throw new IOException();
        } catch (Exception e) {
            throw new RuntimeException("c");
        }
    }
}
