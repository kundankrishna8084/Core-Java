package com.jspider.program.src.array.string;
public class PrintLargestAndSmallestString {
    public static void main(String[] args) {
        // Given array of Strings
        String[] strings = {"hello", "world", "java", "code", "even", "characters"};
        // Initialize variables to store the largest and smallest Strings
        String largestString = strings[0];
        String smallestString = strings[0];
        // Iterate through the array to find the largest and smallest Strings
        for (String s : strings) {
            if (s.length() > largestString.length()) {
                largestString = s;
            }
            if (s.length() < smallestString.length()) {
                smallestString = s;
            }
        }
        // Print the largest and smallest String
        System.out.println("Largest String: " + largestString);
        System.out.println("Smallest String: " + smallestString);
    }
}
