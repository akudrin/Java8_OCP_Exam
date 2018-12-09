/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author andreikudrin
 */
public class List_2 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d"};
        List<String> list = Arrays.asList(arr);
        //list.add("e"); runtime exception can not add anything
        //modifications to the List are reflected in the original array
        list.set(0,"A");
        System.out.println(arr[0]);
    }
    
}
