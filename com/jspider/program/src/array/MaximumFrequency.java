
package com.jspider.program.src.array;
public class MaximumFrequency {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,5,5,9,9,9,9,9,9,3,4,5,6};
        maxFrequency(arr);
    }
    public static void maxFrequency(int [] arr){
        int  [] freq = new int[100];
        int max_element=arr[0];
        int max_freq=1;
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            //If two elements are with high frequency then it will give smaller elements.
            if (freq[i]>max_freq){
                max_element=i;
                max_freq=freq[i];
            }
        }
        System.out.println("Maximum Frequency in Array is: " +max_freq +" Element is:"+max_element);
    }
}
