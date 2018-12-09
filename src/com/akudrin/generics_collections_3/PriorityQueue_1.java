/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.generics_collections_3;

import java.util.*;

class Book implements Comparable<Book> {

    @Override
    public String toString() {
        return this.name + this.id; //To change body of generated methods, choose Tools | Templates.
    }
    
    int id;
    String name, author, publisher;
    int quantity;

    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }

    public int compareTo(Book b) {
        if (id > b.id) {
            return 1;
        } else if (id < b.id) {
            return -1;
        } else {
            return 0;
        }
    }
}

class LinkedListExample {

    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<Book>();
        //Creating Books  
        Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b2 = new Book(233, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
          Book b4 = new Book(105, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        //Adding Books to the queue  
        queue.add(b1);
         
         queue.add(b4);
          
         queue.add(b2);
       
       
         queue.add(b3);
          queue.add(b2);
       
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements  
        for (Book b : queue) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
        for (int i = 0; i < 6; i++) {
         System.out.println(queue.poll());
         System.out.println(queue.peek());
            
        }
       
//        queue.remove();
//        System.out.println("After removing one book record:");
//        for (Book b : queue) {
//            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
//        }
    }
}
