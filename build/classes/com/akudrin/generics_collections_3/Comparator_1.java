/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Computer implements Comparator<Computer> {

    public String brand;
    public int id;

    public Computer(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    public Computer() {

    }

    public int compare(Computer c1, Computer c2) {
        int result = Integer.compare(c1.id, c2.id);
        return result == 0
                ? c1.brand.compareTo(c2.brand) : result;
    }
}

/**
 *
 * @author andreikudrin
 */
public class Comparator_1 {

    public static void main(String[] args) {

        Computer c1 = new Computer("Lenovo", 1);
        Computer c2 = new Computer("Apple", 2);
        Computer c3 = new Computer("Dell", 3);
        Computer c4 = new Computer("Lenovo", 2);

        Computer sortById = new Computer();
        
        List<Computer> list = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(list, sortById);
        list.forEach(
                c -> System.out.format("%d-%s\n", c.id, c.brand)
        );
        
        
        List<Computer> list1 = Arrays.asList(c1, c2, c3, c4);
        Collections.sort(list1,
                Comparator.comparing((Computer c) -> c.id).reversed());
        list1.forEach(
                c -> System.out.format("%d-%s\n", c.id, c.brand));

    }

}
