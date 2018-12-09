/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.class_design_1;


public class Outer {

    
    public static void main(String[] args) {
     
        Outer out = new Outer();
        out.printText();
        
        Outer.Inner outInner = out.new Inner();
        outInner.printText();
    }
    private String text = "I am Outer private!";

     public void printText() {
            System.out.println(text);
        }
    
    
    public class Inner {

        private String text = "I am Inner private";

        public void printText() {
            System.out.println(text);
        }
    }

}
