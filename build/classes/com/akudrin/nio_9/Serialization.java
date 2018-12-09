/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.nio_9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author andreikudrin
 */

class Boo implements Serializable {
    public static transient int f2;
    public static String f1;
    transient int ti = 10;
    static int si = 20;
}


public class Serialization {
    public static void main(String[] args) throws Exception {
        Boo boo = new Boo();
        boo.f1 = "f1";
        boo.f2 = 2;
        boo.si++;
        System.out.println(boo.ti + " " + boo.si + " " + boo.f1+ " " + boo.f2);
        FileOutputStream fos = new FileOutputStream("/Users/andreikudrin/Desktop/boo.txt");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(boo);
        os.close();
        
        FileInputStream fis = new FileInputStream("/Users/andreikudrin/Desktop/boo.txt");
        ObjectInputStream is = new ObjectInputStream(fis);
        boo=(Boo) is.readObject();
        is.close();
        System.out.println(boo.ti + " " + boo.si + " " + boo.f1+ " " + boo.f2);
    }
    
    
}
