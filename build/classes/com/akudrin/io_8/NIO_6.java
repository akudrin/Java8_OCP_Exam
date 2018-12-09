/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 *
 * @author andreikudrin
 */
public class NIO_6 {
    
    public static void main(String[] args) {
        
    Path path = Paths.get("/com/java/One.java");
    matches(path, "glob:*.java"); // false
    matches(path, "glob:**/*.java"); // true
    matches(path, "glob:*"); // false
    matches(path, "glob:**"); // true
    }
    
    public static void matches(Path path, String glob) {
PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
System.out.println(matcher.matches(path));
}
}
