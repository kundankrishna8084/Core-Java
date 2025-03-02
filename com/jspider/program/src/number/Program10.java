package com.jspider.program.src.number;

public class Program10 {

    public static void test(){
        System.out.println("This is Test method");// 3rd me ye print hoga
    }

    public static void main(String[] args) {
        System.out.println("this is main method"); // First main method execute
        demo();// Then we call demo method after that we are inside demo method
        System.out.println("Main method ends");// last me main method end hoga
    }
    public static void demo(){
        System.out.println("This is demo method");//2nd me ye print hoga
        test();// phir ye call hoga
        System.out.println("Demo methods ends here");// 4th me ye print hoga
    }
}
