
package com.jspider.program.src.oops.abstraction;
public class Vehicle1 {
    public void start() //-->I can be Override
    {
        System.out.println("Start Vehicle1");
    }
    public final void drive() //-->It can not be Overridden
    {
        System.out.println("Drive Vehicle1");
    }
}
