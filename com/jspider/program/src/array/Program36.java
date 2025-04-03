
package com.jspider.program.src.array;
public class Program36 {
    public static void main(String[] args) {
        int [] arr = {1,2,4,3,6,5};
        int result =productOfArray(arr);
        System.out.println("Product of two two Integer:"+ result);
    }
    public static int productOfArray(int [] arr){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num:arr){
            if (num>max1){
                max2 = max1;  // Update second largest
                max1 = num;   // Update largest
            } else if (num > max2) {
                max2 = num;   // Update second largest
            }
        }
        return max1*max2;
    }
}
