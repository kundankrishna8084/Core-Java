

package com.jspider.program.src.array;
public class RotateArrayOneTimeFromRightSide {
    public static void main(String[] args) {
        int[] arr = {12,18,30,40,50,60,70};

        // First, we have to store the last value in temp variable
        int temp=arr[arr.length-1];
        // Second, we have to run a loop in revere order and initialize the i =last from Array -2
        for (int i=arr.length-2;i>=0;i--) {
            // arr[arr.length-2]=i
            //arr[i+1]=arr[i]
            //arr[3+1]=arr[3] repeat until first
            arr[i+1]=arr[i];
        }
        // first index array store in temp variable outside the loop
        arr[0]=temp;

        for(int a:arr){
            System.out.print(a+" ");
        }
    }
}
