/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.adv.class_design_2.dao;

import java.util.Collection;

/**
 *
 * @author andreikudrin
 */
public interface BookDao {

    Collection<Book> findAllBooks();

    Book findBookByIsbn(Book book);

    void create(Book book);

    void delete(Book book);

    void update(Book book);

}
