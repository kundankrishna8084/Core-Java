
package com.jspider.program.src.stringAdvance;
public class Program34 {
    public static void main(String[] args) {
        String s1 = "Mohan And Sohan Are Here Mohan And Sohan And Rohan";
        frequencyOfWords(s1);
    }
    private static void frequencyOfWords(String s1) {
        s1 = s1.toLowerCase(); // Convert to lowercase
        String[] str = s1.split("\\s+"); // Split words by spaces
        int n = str.length - 1; // Fix the length calculation

        for (int i = 0; i <= n; i++) {
            if (!str[i].equals("0")) { // Check if word is already counted
                int count = 1;
                for (int j = i + 1; j <= n; j++) {
                    if (str[i].equals(str[j])) {
                        count++;
                        str[j] = str[n]; // Move last word to the duplicate position
                        n--; // Reduce array size
                        j--; // Recheck the swapped word
                    }
                }
                System.out.println(str[i] + " -> " + count);
            }
        }
    }
}
