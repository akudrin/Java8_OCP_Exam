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
public class Exceptions_3 {

    public static void couldThrowAnException() throws IOException, SQLException {
    }
    
    public static void rethrow() throws SQLException, IOException {
        try {
            couldThrowAnException();
            throw new Exception(); //method rethrow() can not throw this type of exception
            //as it is not declared in the method's signature
        } catch (Exception e) {
            System.out.println(e.getClass().getSimpleName());
            throw e;
        }
    }
    public static void main(String[] args) throws Exception  {
     rethrow();

    
    }

}


