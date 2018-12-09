/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author andreikudrin
 */
public class Collectors_1 {
    
    public static enum Grade{A,B,C,D,F}
    
    private String name;
    private Grade grade;
    
    public Collectors_1(String name, Grade grade){
        this.name=name;
        this.grade=grade;
    }
    
    public String toString(){
        return getName()+":"+getGrade();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the grade
     */
    public Grade getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    public static void main(String[] args) {
        List<Collectors_1> ls = Arrays.asList(
        new Collectors_1("S1", Collectors_1.Grade.A),
                new Collectors_1("S2", Collectors_1.Grade.A),
                new Collectors_1("S3", Collectors_1.Grade.C));
        
        Map<Collectors_1.Grade,List<String>> grouping = 
                ls.stream().collect(Collectors.groupingBy(Collectors_1::getGrade, 
                        Collectors.mapping(Collectors_1::getName, Collectors.toList())));
        System.out.println(grouping);
        
    }
    
}
