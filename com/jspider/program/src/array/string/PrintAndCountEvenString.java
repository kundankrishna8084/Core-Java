package com.jspider.program.src.array.string;
public class PrintAndCountEvenString {
    public static void main(String[] args) {
        // Example array of strings
        String[] strings = {"hello", "world", "java", "code", "even", "characters"};

        // Count of strings with even length
        int evenCount = 0;

        System.out.println("Strings with even number of characters:");
        // apply for each Loop for iteration
        for (String str : strings) {
            // Check String is Even or not
            if (str.length() % 2 == 0) {
                // Print the String with an even number of characters
                System.out.println(str);
                // Increment the count
                evenCount++;
            }
        }
        // Print the total count of even-length Strings
        System.out.println("Total count of strings with even number of characters: " + evenCount);
    }
}
