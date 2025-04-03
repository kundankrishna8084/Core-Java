
package com.jspider.program.src.stringAdvance;
public class Program52 {
    public static void main(String[] args) {
        String s1 = "ab45cde20xyz5pq40dd.";
        sumNumber(s1);
    }
    private static void sumNumber(String s1) {
        int sum = 0;  // Stores the sum of all numbers
        int num = 0;  // Stores the current number being formed

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i); // Get the current character

            if (c1 >= '0' && c1 <= '9') {  // If it's a digit
                num = num * 10 + (c1 - '0'); // Build the number
            } else {  // If it's not a digit
                sum = sum + num; // Add the built number to the sum
                num = 0; // Reset num for the next number
            }
        }
        System.out.println(sum); // Print the total sum
    }
}
