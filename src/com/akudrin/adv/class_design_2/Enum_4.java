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
public class Enum_4 {
    
       public enum Suit {
        SPADE(Color.BLACK), HEART(Color.RED), DIAMOND(Color.RED), CLUB(Color.BLACK);
        public enum Color {RED,BLACK;}
        private Suit(Color c){color=c;}
        public Color color;
    }
    
}
