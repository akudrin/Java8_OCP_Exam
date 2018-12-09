/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

/**
 *
 * @author andreikudrin
 */
public class FunctionalInterfaces {
    
}

interface A {
     default int defaultMethod() {
         return 0;
     }
     void method();
}
interface B {
     default int defaultMethod() {
         return 0;
     }
     default int anotherDefaultMethod() {
         return 0;
     }
     void method();
}

interface C {
     boolean equals(Object o);
     int hashCode();
     String toString();
     void method();
}