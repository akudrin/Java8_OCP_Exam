/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.nullpointerexception;

public class Trade {

    private String symbol;
    private int price;
    public static String market;

    public Trade(String symbol, int price) {
        this.symbol = symbol;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public static void main(String[] args) {
//        Trade pennyStock = null;
//        pennyStock.getPrice(); //this will throw NullPointerException
//        
//        Trade fxtrade = null;
//        int price = fxtrade.price; //here fxtrade is null, you can’t access field here
//        
//        //If you throw an Exception object and if that is null you will get null pointer exception as shown in below example
////        RuntimeException nullException = null;
////        throw nullException;
//        
//        Trade[] bluechips = null;
//        int length = bluechips.length;  //array is null here
//        
//        Trade[] bluechips1 = null;
//        Trade motorola = bluechips1[0]; //array is null here
//        
//        //You will also get NullPointerException in Java if you try to 
//        //synchronize on null object or try to use null object inside 
//        //synchronized block in Java.
//        Trade highbetaTrade = null;
//        synchronized(highbetaTrade){
//        System.out.print("This statement is synchronized on null");
//        }
        
        //no NullPointerException market is static variable
        Trade lowBetaTrade = null;
        String market = lowBetaTrade.market; 
        
    }

}
