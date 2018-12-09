/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.date_time_api_7;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

/**
 *
 * @author andreikudrin
 */
public class Date_1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.get(ChronoField.YEAR);
int month = today.get(ChronoField.MONTH_OF_YEAR);
int dayYear = today.get(ChronoField.DAY_OF_YEAR);
int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
int dayWeek = today.get(ChronoField.DAY_OF_WEEK);
long dayEpoch = today.getLong(ChronoField.EPOCH_DAY);

        System.out.println(today.isLeapYear());
        
    }
    
}
