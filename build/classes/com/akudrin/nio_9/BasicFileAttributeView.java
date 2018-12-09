/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.nio_9;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Date;

/**
 *
 * @author andreikudrin
 */
public class BasicFileAttributeView {
    public static void main(String[] args) throws IOException {
         java.nio.file.attribute.BasicFileAttributeView  bfav    = Files.getFileAttributeView(
                                   FileSystems.getDefault().getPath("/Users/andreikudrin/Desktop/Notes.odt"),
                                   java.nio.file.attribute.BasicFileAttributeView.class
                                  );
BasicFileAttributes     bfa     = bfav.readAttributes();
System.out.println(new Date(bfa.creationTime().toMillis()));
    }
}
