package com.jspider.program.src.collection_framework.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class removeDuplicateElements {
    public static void main(String[] args) {
      int [] arr=  {1, 2, 3, 2, 4, 1};
        // Use a HashSet to remove duplicates
      Set<Integer> s1 = new HashSet<>();

       // Add all elements of the array to the HashSet
      for(Integer array:arr){
          s1.add(array);
      }
        // Convert the HashSet back to an array or list (optional)
        Integer[] uniqueArray = s1.toArray(new Integer[0]);

        // Print the result
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }

}
