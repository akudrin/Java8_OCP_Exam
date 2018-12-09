/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.io_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/**
 *
 * @author andreikudrin
 */
public class NIO_4 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("fileWrite1.txt");
//BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
//System.out.println("create: " + basic.creationTime());
//System.out.println("access: " + basic.lastAccessTime());
//System.out.println("modify: " + basic.lastModifiedTime());
//System.out.println("directory: " + basic.isDirectory());
        BasicFileAttributes basic = Files.readAttributes(
                path, BasicFileAttributes.class); // attributes
        FileTime lastUpdated = basic.lastModifiedTime(); // get current
        FileTime created = basic.creationTime(); // values
        FileTime now = FileTime.fromMillis(System.currentTimeMillis());
        BasicFileAttributeView basicView = Files.getFileAttributeView(
                path, BasicFileAttributeView.class); // "view" this time
        basicView.setTimes(lastUpdated, now, created); // set all three
        System.out.println("create: " + basic.creationTime());
        System.out.println("access: " + basic.lastAccessTime());
        System.out.println("modify: " + basic.lastModifiedTime());
    }
}
