/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.adv.class_design_2.dao;

import java.util.*;

public class InMemoryBookDao implements BookDao{

    private static Map<String, Book> bookstore // storage:
            = new HashMap<String, Book>(); // core responsibility

    public Collection<Book> findAllBooks() {
        return bookstore.values();
    }

    public Book findBookByIsbn(Book book) {
        return bookstore.get(book.getIsbn());
    }

    public void create(Book book) {
        bookstore.put(book.getIsbn(), book);
    }

    public void delete(Book book) {
        bookstore.remove(book.getIsbn());
    }

    public void update(Book book) {
// no operation - for an in-memory
// database,
// we update automatically in real time
    }
}
