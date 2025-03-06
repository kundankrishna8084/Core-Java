package com.jspider.program.src.string;

public class CountWords2 {
    public static void main(String[] args) {
        String str = "Hello  world! This  is a  test.";
        System.out.println("Total words: " + countWords(str));

    }
        public static int countWords(String str) {
            int count = 0;
            boolean isWord = false;

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);

                // Check if character is not a space
                if (ch != ' ') {
                    if (!isWord) {
                        count++; // A new word starts
                        isWord = true;
                    }
                } else {
                    isWord = false; // Reset flag when space is found
                }
            }
            return count;
        }


    }

