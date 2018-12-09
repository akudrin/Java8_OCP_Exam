/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.java_stream_api_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    double score;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}

/**
 *
 * @author andreikudrin
 */
public class Streams_1 {
    public static void main(String[] args) {
        //before Java 8
        List<Student> studentsScore = new ArrayList<Student>();
for(Student s : studentsScore) {
    if(s.getScore() > 90.0) {
        studentsScore.add(s);
    }
}
Collections.sort(studentsScore, new Comparator<Student>() {
    public int compare(Student s1, Student s2) {
        return Double.compare(
           s1.getScore(), s2.getScore());
    }
});

    //with Java 8
    List<Student> studentsScore1 = studentsScore
        .stream()
        .filter(s -> s.getScore() >= 90.0)
        .sorted(Comparator.comparing(Student::getScore))
        .collect(Collectors.toList());
        
    }
    
}
