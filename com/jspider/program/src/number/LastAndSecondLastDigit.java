package com.jspider.program.src.number;

public class LastAndSecondLastDigit {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult(){
        int a=56784;
        System.out.println("The Last digit of " + a + " is:"+a%10 );
        System.out.println("The Second last digit of "+a+"is:"+a%100);
    }
}
