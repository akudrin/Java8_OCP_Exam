/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.adv.class_design_2.dao;

/**
 *
 * @author andreikudrin
 */
public class StudentDAO {

    public static void main(String[] args) {
        BookDao dao = new InMemoryBookDao();; // dao
        Book book = new Book();
// call setters
        dao.create(book); // dao - storage
        book.setTitle("Updated");
        dao.update(book); // dao - storage
        dao.delete(book); // dao - storage
    }

}
