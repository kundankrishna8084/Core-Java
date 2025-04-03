
package com.jspider.program.src.array;
public class Program15 {
    public static void main(String[] args) {
        int [] arr = {11,37,56,78,90};
        int count =0;
        for (int num:arr) {
            if (isPrime(num)) {
                count++;
                System.out.println(count);
            } else {
                System.out.println("No prime");
            }
        }
    }

    public static boolean isPrime(int num){
        if(num<2){
            return false;
        }
        for (int i = 2; i*i <= num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
