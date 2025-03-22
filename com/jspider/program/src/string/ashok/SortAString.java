
package com.jspider.program.src.string.ashok;
import java.util.Arrays;
public class SortAString {
    public static void main(String[] args) {
        String str = "rock";
        //Approach-1 Without sing sort method
        /*
        char  [] arr = str.toCharArray();
        char temp;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));
         */

        //Approach-2
        //Using Sort method
        char  [] arr = str.toCharArray();
        Arrays.sort(arr);
        System.out.println(new String(arr));

    }
}
