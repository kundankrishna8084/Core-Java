package com.jspider.program.src.array;

public class BiggestAndSmallestElmentsAndDifference {
    public static void main(String[] args) {
        int [] arr =  {12, 345, 678, 90, 123, 456, 5, 1001};
        int big=arr[0];
        int small=arr[0];

        for (int i = 0; i <arr.length; i++) {
            // Here we can check that arr of i is bigger than big then we should store the value in big reference variable.
            if(arr[i]>big)
                big=arr[i];
            // Here we can check that array of i is smaller than small than we should store the value in small variable.
            if(arr[i]<small)
                small=arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("The Biggest elements in array:"+big);
        System.out.println("The Smallest elements in array:"+small);
        System.out.println("The difference of biggest and smallest is:"+ (big-small));

    }
}
