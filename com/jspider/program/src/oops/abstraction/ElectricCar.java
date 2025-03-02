
package com.jspider.program.src.oops.abstraction;
public class ElectricCar implements Car{
    @Override
    public void start()
    {
        System.out.println("Start the Electric Car");
    }

    @Override
    public void stop()
    {
        System.out.println("Stop the Electric Car");
    }

    @Override
    public void openGate()
    {
        System.out.println("Open gate in Electric Car");
    }

}
