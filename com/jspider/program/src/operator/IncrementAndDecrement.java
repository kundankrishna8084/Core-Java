package com.jspider.program.src.operator;

public class IncrementAndDecrement {
    public static void main(String[] args) {
        /*
        // post
        int x=10;
        System.out.println(x++);// Here value is increase but the value of x is 10
        System.out.println(x); // Here increased value is printed.

        System.out.println(x--);//Here value is decrease but the value of x is 11
        System.out.println(x);//Here Decreased value is printed.


        //pre
        int p=10;
        System.out.println(++p);//Here the value increased first the value of p is 11
        System.out.println(p);//Here the value of p is 11

        System.out.println(--p);//Here the value decreased first the value of p is 10
        System.out.println(p);//Here the value of p is 10

         */












//        int y=16;
//        y++; //16
//        y++; //17
//        ++y; //19
//        y++; //19
//        --y; //19
//        ++y;//20
//        y--;//20
//        --y;//18
//        System.out.println(y);





//        int x =15;
//        int y=x++;
//        System.out.println(x);
//        System.out.println(y);








//        int x=16;
//        x++;
//        int y=x++;
//        int z=++y;
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);






//        int a=20;
//        int b=a++;
//        a--;
//        int c =a++ + ++b;
//        int d=a-- - --a;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);












       int a=8;
       int b=12;
       int c=++a +b++;
       c--;
       --b;
       int d=c-- + ++b + ++a;
       int e = a + ++b +c+d++;
        System.out.println(++e);

    }
}
