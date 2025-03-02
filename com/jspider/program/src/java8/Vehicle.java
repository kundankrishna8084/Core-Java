package com.jspider.program.src.java8;

public interface Vehicle {
    public void start();
    public default void  clean(){
        System.out.println("Cleaning is in progress");
    }
}
