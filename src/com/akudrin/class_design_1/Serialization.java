/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akudrin.class_design_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Rectangle {
    
    int length;
    int breadth;
    transient int area;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        area = length*breadth;
    }
       public void writeObject (ObjectOutputStream os) throws IOException{
        os.defaultWriteObject();
    }
    
     public void readObject (ObjectInputStream is) throws IOException, ClassNotFoundException{
        is.defaultReadObject();
        area=this.length*this.breadth;
    }
    
    
}


/**
 *
 * @author andreikudrin
 */
public class Serialization {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        //Serialize an object
        FileOutputStream fileStream = new FileOutputStream("rectangle.ser");
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(new Rectangle(5,6));
        objectStream.close();
        
        //Deserialize an object
        FileInputStream fileInputStream = new FileInputStream("rectangle.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Rectangle rectangle = (Rectangle)objectInputStream.readObject();
        objectInputStream.close();
        
    }
}
