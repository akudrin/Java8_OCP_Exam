/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.HashMap;

/**
 *
 * @author andreikudrin
 */
public class HashMapExample {
    
    String s1 ,s2, s3;
    public HashMapExample(String a, String b, String c) {
        s1=a; s2=b; s3=c;
    }
    
    public boolean equals (Object obj){
        if(! (obj instanceof HashMapExample)) return false;
        HashMapExample i = (HashMapExample)obj;
        return (s1+s2+s3).equals(i.s1 + i.s2 + i.s3);
    }
    
    public int hashCode() {
        return s1.hashCode();
    }
    
    public static void main(String[] args) {
        HashMap map = new HashMap();
        HashMapExample i1 = new HashMapExample("aaa", "aaa", "aaa");
         HashMapExample i2 = new HashMapExample("aaa", "bbb", "ccc");
         map.put(i1, "Hello");
         map.put(i2, "World");
         
        map.forEach((k,v)->System.out.println(k + " " + v));
        
        System.out.println(map.get(i1));
         
    }
}
