package com.jspider.program.src.array.string;

public class SecondLargestNumberInArray {
    public static void main(String[] args) {
        int [] arr  = {92,18,90,30,40,5,60,99};
        int biggest=arr[0];
        int secondBiggest=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>biggest){
                secondBiggest=biggest;
                biggest=num;
            } else if (num>secondBiggest && num!=biggest) {
                secondBiggest=num;
                
            }
        }
        System.out.println("Largest Number:"+biggest);
        System.out.println("Second Largest Number:"+secondBiggest);
        
        
    }
}
