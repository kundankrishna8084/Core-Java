package com.jspider.program.src.recursion;

public class FindBig {
    public static void main(String[] args) {
        int x=12;
        int y=23;
        int big=big(x,y);
        System.out.println("Big " +big);
    }
      public static int big(int a, int b){
        return a>b?a:b;
       }
}
