package com.jspider.program.src.oops;

public class Knife {
    int size;
    String color;
    int price;
    int length;
    int width;
    // Here size,color,length,width is state of Knife class

    public void hold(){
        System.out.println("Hold the Knife");
    }
    public void swing(){
        System.out.println("Swing the Knife");
    }
    public void kill(){
        System.out.println("Kill from Knife");
    }
    // Here hold(),swing() and kill() is behaviour of Knife class
}
