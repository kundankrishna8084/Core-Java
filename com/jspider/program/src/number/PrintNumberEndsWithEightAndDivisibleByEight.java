package com.jspider.program.src.number;
public class PrintNumberEndsWithEightAndDivisibleByEight {
    public static void main(String[] args) {
        for (int i = 1; i <1000 ; i++) {
            if(i%10==8 && i%8==0)
                System.out.println(i+" ");

        }
    }
}
