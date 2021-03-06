/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.date_time_api_7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author andreikudrin
 */
public class ZonedDateTime_1 {
    public static void main(String[] args) {
        ZoneId australiaZone = ZoneId.of("Australia/Victoria");
        ZonedDateTime now = ZonedDateTime.now();
        LocalDate currentDate = now.toLocalDate();
        LocalTime currentTime = now.toLocalTime();
        LocalDateTime currentDateTime = now.toLocalDateTime();
        
        //To get the value of a specified field

int dayYear = now.getDayOfYear();
int nanos = now.getNano();
Month monthEnum = now.getMonth();
int year = now.get(ChronoField.YEAR);
long micro = now.getLong(ChronoField.MICRO_OF_DAY);
// This is new, gets the zone offset such as "-03:00"
ZoneOffset offset = now.getOffset();
// To create another instance
ZonedDateTime zdt1 = now.with(ChronoField.HOUR_OF_DAY, 10);
ZonedDateTime zdt2 = now.withSecond(49);
// Since these methods return a new instance, we can chain them!
ZonedDateTime zdt3 = now.withYear(2013).withMonth(12);

// The following two methods are specific to ZonedDateTime
// Returns a copy of the date/time with a
// different zone, retaining the instant
ZonedDateTime zdt4 = now.withZoneSameInstant(australiaZone);
// Returns a copy of this date/time with a different time zone,
// retaining the local date/time if it's valid for the new time zone
ZonedDateTime zdt5 = now.withZoneSameLocal(australiaZone);

// Adding
ZonedDateTime zdt6 = now.plusDays(4);
ZonedDateTime zdt7 = now.plusWeeks(3);
ZonedDateTime zdt8 = now.plus(2, ChronoUnit.HOURS);

// Subtracting
ZonedDateTime zdt9 = now.minusMinutes(20);
ZonedDateTime zdt10 = now.minusNanos(99999);
ZonedDateTime zdt11 = now.minus(10, ChronoUnit.SECONDS);
        
    }
    
}
