/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.class_design_1;

/**
 *
 * @author andreikudrin
 */
public class StaticNestedClass {
    
    public String firstName;
    static String lastName;
    
    static void printName() {
        System.out.println(lastName);
    }
    
    public String getFirstName () {
        return firstName;
    }
    
    static class NewName {
        static String lastName;
        String newLastName;
        StaticNestedClass newClass = new StaticNestedClass();
        String newName = newClass.firstName;
        
        public static String getLastName () {
            StaticNestedClass.NewName nn = new StaticNestedClass.NewName();
            nn.newLastName = "";
        return lastName;
    }
        
    }
    
}
