package com.jspider.program.src.java8;
// Approach-2  (Anonymous implementation) just like inner class
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=5 ; i++) {
                    System.out.println(i);
                }

            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
