
package com.jspider.program.src.multithreading.synchronization;
public class IRCTCDriver {
    public static void main(String[] args) {
        IRCTC i= new IRCTC();
        Person1 p1 = new Person1(i);
        Person2 p2 = new Person2(i);
        Person3 p3 = new Person3(i);

        p1.start();
        p2.start();
        p3.start();


    }
}
