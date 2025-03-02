package com.jspider.program.src.operator;

public class ConditionalOperator {
    public static void main(String[] args) {


        //CASE 1
        System.out.println(true?"Monday":"Sunday");
        System.out.println(12>20?"12+20*4":12+20*6);
        System.out.println(10+20);// it is good.

        // But it is better than above
        int sum=(10+20);
        System.out.println(sum);

        String result = true?"Monday":"Friday";
        System.out.println(result);

        int result1 = 12>20?12+20*4:12+20*6;
        System.out.println(result1);

        int a=20;
        int b=12;
        int c =((a>b)?(a<b?a:b):a+b);
        System.out.println(c);

        // CASE-II
        int d=((a+b)%2==0) ? a+b*2 :(a>10?a:10);
        System.out.println(d);

        // CASE III
        int e=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(e);



    }
}
