
package com.jspider.program.src.multithreading.synchronization;
public class User2 extends Thread {
    Table t;
    User2(){

    }
    User2(Table t){
        this.t=t;
    }
    public void run() {
        t.printTable(30);
    }
}
