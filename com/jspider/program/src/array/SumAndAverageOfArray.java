package com.jspider.program.src.array;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        int [] arr =  {12, 345, 678, 90, 123, 456, 5, 1001};
        int sum=0;
        double avg=0;
        int totalNumber= arr.length;
        for (int i = 0; i <arr.length ; i++) {
           sum=sum+arr[i];
           avg= (double) sum /totalNumber;
            }
        System.out.println("Sum of array:"+sum);
        System.out.println("Average number of array:"+avg);
    }
}
