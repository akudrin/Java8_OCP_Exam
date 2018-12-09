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
public class FunctionalInterfaceDefaultMethods {
    
    
    
}

@FunctionalInterface
 interface FooExtended extends Baz, Bar {
    default void defaultCommon() {}

}
     
@FunctionalInterface
interface Baz {  
    String method();    
    default void defaultBaz() {}  
    default void defaultCommon() {}
}
     
@FunctionalInterface
interface Bar {  
    String method();    
    default void defaultBar() {}   
    default void defaultCommon() {}
}