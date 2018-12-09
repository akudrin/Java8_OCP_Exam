/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.date_time_api_7;

import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author andreikudrin
 */
public class ChronoUnitVSChronoField {
    public static void main(String[] args) {
        System.out.println("ChronoUnit DateBased TimeBased Duration");
        System.out.println("---------------------------------------");
        for(ChronoUnit unit : ChronoUnit.values()) {
        System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
        unit, unit.isDateBased(), unit.isTimeBased(), unit.getDuration());
}
        
        System.out.println();
        
        System.out.println("ChronoField DateBased TimeBased RangeUnit");
System.out.println("---------------------------------------");
for(ChronoField unit : ChronoField.values()) {
System.out.printf("%10s \t %b \t\t %b \t\t %s %n",
unit, unit.isDateBased(), unit.isTimeBased(), unit.getRangeUnit());
}
        
    ChronoField secondOfMinute = ChronoField.SECOND_OF_MINUTE;
        System.out.println(secondOfMinute.getBaseUnit());
        System.out.println(secondOfMinute.getRangeUnit());

    }
    
}
