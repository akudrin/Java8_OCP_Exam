/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author andreikudrin
 */
public class BackedCollections {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");
        SortedMap<String, String> submap;
        submap = map.subMap("a", "i"); // #1 create a backed collection
        System.out.println(map + " " + submap); // #2 show contents
//        map.put("b", "bat"); // #3 add to original
//        submap.put("f", "fish"); // #4 add to copy
//        map.put("r", "raccoon"); // #5 add to original - out of range
//// submap.put("p", "pig"); // #6 add to copy - out of range
//        System.out.println(map + " " + submap); // #7 show final contents

    }
}
