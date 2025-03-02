package com.jspider.program.src.number;

public class Program11 {
    public static void main(String[] args) {
        // To call method in main method
        getProduct();
        getSum();

    }
    public static void getProduct(){
        int a=70;
        int b=30;
        int product =a*b;
        System.out.println("Product is:"+product);
    }
    public static void getSum(){
        int x=30;
        int y =48;
        int sum=x+y;
        System.out.println("Sum of two Number:"+sum);
    }
}
