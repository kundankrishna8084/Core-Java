
package com.jspider.program.src.DigitProblem;
public class EvenOrOddWhenConditionIsTrue {
    public static void main(String[] args) {
        int n = 140;
        int original = n;
        int rev = 0;

        // Reverse the number
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        // Calculate the sum of the original and reversed number
        int sum = original + rev;
        System.out.println("Original Number: " + original);
        System.out.println("Reversed Number: " + rev);
        System.out.println("Sum of Original and Reverse: " + sum);

        // Check if the sum is even or odd
        if (sum % 2 == 0) {
            System.out.print("Even sum detected! Even digits: ");
            printEvenDigits(original);
        } else {
            System.out.print("Odd sum detected! Odd digits: ");
            printOddDigits(original);
        }
    }

    // Function to print even digits of a number
    public static void printEvenDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + "");
            }
            num /= 10;
        }
        System.out.println();
    }

    // Function to print odd digits of a number
    public static void printOddDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            num /= 10;
        }
        System.out.println();
    }
}
