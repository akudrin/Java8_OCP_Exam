/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.exceptions_assertions_6;

import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author andreikudrin
 */
public class Exceptions_2 {

    public static void main(String[] args) {
        //LEGAL but isn't good practice
        try {
            // access the database and write to a file
            throw new IOException();
        } catch (IOException e) {
            e = new IOException();
        }

        //ILLEGAL
        try {
            // access the database and write to a file
            throw new IOException();
        } catch (IOException | SQLException e) {
            e = new IOException();
        }
        /*Since multi-catch uses multiple types, there isn't a clearly defined type for the
        variable that you can set. Java solves this by making the catch parameter final
        when that happens. And then the code doesn't compile because you can't assign to
        a final variable.
         */

    }

}
