
package com.jspider.program.src.multithreading.synchronization;
public class Person2 {
    IRCTC i;
    Person2(){

    }
    Person2(IRCTC i){
        this.i=i;
    }
    public void run() {
        i.bookTicket(10);
    }

    public void start() {
    }
}
