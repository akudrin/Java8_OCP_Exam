/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.lambda_functional_interfaces_4;

import java.util.function.Consumer;

class Car {

    private int id;
    private String color;
    // More properties
    // And getter and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

class Mechanic {

    public void fix(Car c) {
        System.out.println("Fixing car " + c.getId());
    }
}

/**
 *
 * @author andreikudrin
 */
public class MethodReference_3 {

    public static void execute(Car car, Consumer<Car> c) {
        c.accept(car);
    }

    public static void main(String[] args) {
        final Mechanic mechanic = new Mechanic();
        Car car = new Car();

// Using an anonymous class
        execute(car, new Consumer<Car>() {
            public void accept(Car c) {
                mechanic.fix(c);
            }
        });

// Using a lambda expression
        execute(car, c -> mechanic.fix(c));

// Using a method reference
        execute(car, mechanic::fix);
    }

}
