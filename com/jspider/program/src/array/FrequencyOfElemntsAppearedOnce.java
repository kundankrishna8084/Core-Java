
package com.jspider.program.src.array;
public class FrequencyOfElemntsAppearedOnce {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4,4,7,7, 8,9,9,9};
        onceFrequency(arr);
    }
    public  static  void onceFrequency(int arr[]){
        // Find and print elements that appear only once
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // Count occurrences of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Print element if it appears only once
            if (count == 1) {
                System.out.println(arr[i]+" Appeared only Once");
            }
        }
    }
}
