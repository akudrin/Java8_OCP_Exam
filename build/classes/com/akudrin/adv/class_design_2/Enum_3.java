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
public class Enum_3 {
    public static void main(String[] args) {
        System.out.println("Color: " + CurrencyAbstract.DIME.color());
    }
    
}

enum CurrencyAbstract {
        PENNY(1) {
            @Override
            public String color() {
                return "copper";
            }
        },
        NICKLE(5) {
            @Override
            public String color() {
                return "bronze";
            }
        },
        DIME(10) {
            @Override
            public String color() {
                return "silver";
            }
        },
        QUARTER(25) {
            @Override
            public String color() {
                return "silver";
            }
        };
        private int value;

        public abstract String color();

        private CurrencyAbstract(int value) {
            this.value = value;
        }
}     

