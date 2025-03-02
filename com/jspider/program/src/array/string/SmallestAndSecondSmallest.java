package com.jspider.program.src.array.string;

public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        int [] arr  = {92,18,90,30,40,5,60,99};
        int smallest=arr[0];
        int secondSmallest=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<smallest){
                secondSmallest=smallest;
                smallest=num;
            } else if (num<secondSmallest && num!=smallest) {
                secondSmallest=num;
            }
        }
        System.out.println("Smallest Number:"+smallest);
        System.out.println("Second Smallest Number:"+secondSmallest);
    }
}
