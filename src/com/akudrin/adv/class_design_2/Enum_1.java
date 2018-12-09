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
public class Enum_1 {

    public static void main(String[] args) {
        Currency usCoin = Currency.DIME;

        switch (usCoin) {
            case PENNY:
                System.out.println("Penny coin");
                break;
            case NICKLE:
                System.out.println("Nickle coin");
                break;
            case DIME:
                System.out.println("Dime coin");
                break;
            case QUARTER:
                System.out.println("Quarter coin");
        }

        if (usCoin == Currency.DIME) {
            System.out.println("enum in java can be compared using ==");
        }

        for (Currency coin : Currency.values()) {
            System.out.println("coin: " + coin);
        }
        
//        Currency usCoin1 = Currency.DIME;
//        System.out.println(usCoin1);
    }

}

enum Currency {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int value;

    private Currency(int value) {
        this.value = value;
    }
    
     @Override
  public String toString() {
       switch (this) {
         case PENNY:
              System.out.println("Penny: " + value);
              break;
         case NICKLE:
              System.out.println("Nickle: " + value);
              break;
         case DIME:
              System.out.println("Dime: " + value);
              break;
         case QUARTER:
              System.out.println("Quarter: " + value);
        }
  return super.toString();
 }

};
