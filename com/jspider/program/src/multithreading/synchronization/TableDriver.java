
package com.jspider.program.src.multithreading.synchronization;
public class TableDriver {
    public static void main(String[] args) {
        Table t=new Table();

        User1 u1=new User1(t);
        User2 u2=new User2(t);
        User3 u3=new User3(t);

        u1.start();
        u2.start();
        u3.start();
    }
}
