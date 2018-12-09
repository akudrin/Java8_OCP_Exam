/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.adv.class_design_2;

/**
 *
 * @author andreikudrin
 */
public class Enum_2 {
    public static void main(String[] args) {
        
    }
    
}

//enums can implement interfaces but can not extend classes
enum CurrencyInt implements Runnable{
  PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
  private int value;
   private CurrencyInt(int value) {
        this.value = value;
    }
        
  @Override
  public void run() {
  System.out.println("Enum in Java implement interfaces");
                
   }
}

