
package com.jspider.program.src.multithreading.synchronization;
public class User3 extends Thread{
    Table t;
    User3(){

    }
    User3(Table t){
        this.t=t;
    }
    public void run() {
        t.printTable(42);
    }

}
