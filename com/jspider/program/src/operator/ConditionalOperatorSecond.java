package com.jspider.program.src.operator;

public class ConditionalOperatorSecond {
    public static void main(String[] args) {
        int x=10;
        int y=5;
        int z=15;

        int result =(x<y)?(y<z)?z:y:x;
        System.out.println(result);

        int result1 = (x>y)?(y>z)?x:y:(x>z)?x:z;
        System.out.println(result1);
    }
}
