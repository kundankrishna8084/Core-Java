
package com.jspider.program.src.array;
public class Program31 {
    public static void main(String[] args) {
        int[] arr = {1,1,9, 2, 2, 2, 3, 3, 4, 5, 6, 67, 7, 8, 6, 7, 7, 6, 7, 6, 6};
        int result =getFrequency(arr);
        System.out.println(result);
    }
    public static int getFrequency(int[] arr) {
        int[] freq = new int[1001];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int num:arr){
            if (freq[num] == 1)
                return num;
        }
        return -1;
    }
}

