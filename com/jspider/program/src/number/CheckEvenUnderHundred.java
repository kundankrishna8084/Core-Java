package com.jspider.program.src.number;
public class CheckEvenUnderHundred {
    public static void main(String[] args) {
//        int i = 1; // Initialize the counter variable
//        while (i <= 100) { // Loop until i is less than or equal to 100
//            if (i % 2 == 0) { // Check if the number is even
//                System.out.print(i + " "); // Print the even number
//            }
//            i++; // Increment the counter
//        }

        // With the help of for loop
        for (int i = 1; i < 100; i++) {
            if(i%2==0)
                System.out.println(i+" ");
        }

    }
}
