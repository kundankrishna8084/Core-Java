
package com.jspider.program.src.multithreading.synchronization;
public class Table {
    public synchronized void printTable(int n) {
        System.out.println("Print Table starts");
        for(int i=1;i<=10;i++) {
            System.out.println(n*i);
            try {
                Thread.sleep(600);
            }catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("===printTable ends===");
    }
}
