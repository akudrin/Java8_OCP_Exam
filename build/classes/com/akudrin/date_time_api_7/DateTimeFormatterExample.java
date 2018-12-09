/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.date_time_api_7;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author andreikudrin
 */
public class DateTimeFormatterExample {
    
    public static void main(String[] args) {
        
        DateTimeFormatter fromDateFormat = DateTimeFormatter.ofPattern("MMMM/MMMM/YY");

        //DateTimeFormatter toDateFormat = DateTimeFormatter.ofPattern("MMMM/MMMM/YY");
        
        
        LocalDate firstOct2015 = LocalDate.of(2015, Month.MARCH, 10);
        
        System.out.println(fromDateFormat.format(firstOct2015));
        
        //System.out.println(firstOct2015.format(toDateFormat));
        
    }
    
}
