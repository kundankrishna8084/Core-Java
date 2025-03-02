
package com.jspider.program.src.arraysClass;
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int [] arr = {12,34,10,55,35,63,48};
        System.out.println("Before Sorting : "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));
    }
}
