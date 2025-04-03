
package com.jspider.program.src.array;
public class FrequencyOfEachElements {
    public static void main(String[] args) {
        int [] arr = {1,2,2,2,3,3,4,5,6,67,7,8,6,7,7,6,7,6,6};
        getFrequency(arr);
    }
    public static void getFrequency(int [] arr){
        int [] freq = new int  [1001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]>0)
                System.out.println(i+" is :"+freq[i]+" Times ");

        }
    }
}
