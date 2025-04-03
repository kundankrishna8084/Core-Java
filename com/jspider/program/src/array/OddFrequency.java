
package com.jspider.program.src.array;
public class OddFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4, 7, 7, 8, 9, 9, 9};
        oddFrequency(arr);
    }
    public static void oddFrequency(int[] arr) {
        int freq[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] % 2 != 0)
                System.out.println(i + " is odd Frequency");
        }
    }
}
