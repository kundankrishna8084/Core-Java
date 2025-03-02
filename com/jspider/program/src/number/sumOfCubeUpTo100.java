
package com.jspider.program.src.number;
public class sumOfCubeUpTo100 {
    public static void main(String[] args) {
         int sum=0;
        int i=1;
        while(i<=100){
            sum=sum+i*i*i;
            i++;
        }
        System.out.println("Sum is:"+sum);

    }
}
