
package com.jspider.program.src.multithreading.synchronization;
public class Person3 {
    IRCTC i;
    Person3(){
    }
    Person3(IRCTC i){
        this.i=i;
    }
    public void run() {
        i.bookTicket(4);
    }

    public void start() {
    }
}
