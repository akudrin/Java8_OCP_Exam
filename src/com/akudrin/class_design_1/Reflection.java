/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.class_design_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author andreikudrin
 */
public class Reflection {
    
    
    public static Method[] getArrayArrayListMethods() {
        Class<ArrayList> listClass = java.util.ArrayList.class;
        return listClass.getMethods();
    }
    
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Reflection.getArrayArrayListMethods()));
       
    }
    
}
