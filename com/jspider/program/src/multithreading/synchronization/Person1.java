
package com.jspider.program.src.multithreading.synchronization;
public class Person1 extends Thread{
    IRCTC i;
    Person1(){
    }
    Person1(IRCTC i){
        this.i=i;
    }
    public void run() {

        i.bookTicket(2);
    }
}
