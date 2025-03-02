package com.jspider.program.src.java8;

public class InstanceMethodReference {
    public void m1(){
        for (int i = 0; i <=5; i++) {
            System.out.print(" "+ i);
        }
    }
    public static void main(String[] args) {
        InstanceMethodReference  im = new InstanceMethodReference();
        Runnable r = im::m1;
        Thread t = new Thread(r);
        t.start();

    }
}
