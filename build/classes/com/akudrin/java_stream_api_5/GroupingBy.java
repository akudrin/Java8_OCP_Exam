/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import java.util.stream.Stream;

/**
 *
 * @author andreikudrin
 */
public class GroupingBy {

    public static void main(String[] args) {
        List<Integer> stream
                = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37);
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (Integer i : stream) {
            int key = i / 10 * 10;
            List<Integer> list = map.get(key);

            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(i);
        }

        Map<Integer, List<Integer>> map1 =
   Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
      .collect( groupingBy (i -> i/10 * 10 ) );
        
        Map<Integer, Long> map2 =
    Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
        .collect(
            groupingBy(i -> i/10 * 10,
                       counting()
            )
        );
    
        Map<Integer, Map<String, List<Integer>>> map3 =
   Stream.of(2,34,54,23,33,20,59,11,19,37)
       .collect(groupingBy(i -> i/10 * 10,
                  groupingBy(i ->
                               i%2 == 0 ? "EVEN" : "ODD")
                )
       );
        
    }

}
