
package com.jspider.program.src.array;
public class Program41 {
    public static void main(String[] args) {
        int [] arr = {7, 4,3, 5, 1, 6};
      int result=  missingNumber(arr);
        System.out.println(result);
    }

    public static int missingNumber(int[] arr) {
        int n= arr.length+1;
        int total_sum=(n*(n+1))/2;
        int sum=0;
       for (int num:arr){
           sum=sum+num;
       }
        return total_sum-sum;
    }

}
