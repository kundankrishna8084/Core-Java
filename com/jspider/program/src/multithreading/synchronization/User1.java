
package com.jspider.program.src.multithreading.synchronization;
public class User1 extends Thread {
    Table t;
    User1(){

    }
    User1(Table t){
        this.t=t;
    }
    public void run() {
        t.printTable(18);
    }
}
