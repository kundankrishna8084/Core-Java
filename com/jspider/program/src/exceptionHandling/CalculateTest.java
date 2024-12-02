package com.jspider.program.src.exceptionHandling;

public class CalculateTest {
    public static void getResult(int a, int b) {
        int result=Calculate.divide(a, b);
        System.out.println("Result is: "+result);
    }
}
