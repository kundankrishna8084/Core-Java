//package com.jspider.program.src.stringAdvance;
//public class Program21 {
//    public static void main(String[] args) {
//        String s1 = "mohan and sohan are here";
//        convertStringToUpperCaseEachCharcaterFirst(s1);
//    }
//    private static void convertStringToUpperCaseEachCharcaterFirst(String s1) {
//        String s2 = "";
//        for (int i = 0; i < s1.length(); i++) {
//            char c1 = s1.charAt(i);
//            if (s2.isEmpty()) {  // If it's the first character of a word
//                s2 =s2+ Character.toUpperCase(c1);
//            } else {
//                s2 = s2+c1;
//            }
//
//            if (c1 == ' ' || i == s1.length() - 1) {  // When a word ends
//                System.out.print(s2 + " ");
//                s2 = "";  // Reset for the next word
//            }
//        }
//    }
//}


package com.jspider.program.src.stringAdvance;
public class Program21 {
    public static void main(String[] args) {
        String s1 = "mohan and sohan are here";
        upperCase(s1);
    }
    private static void upperCase(String s1) {
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            // Convert first letter of the string to uppercase
            if (i == 0 && c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            }
            // Convert first letter after a space to uppercase
            else if (i > 0 && s1.charAt(i - 1) == ' ' && c >= 'a' && c <= 'z') {
                result += (char) (c - 32);
            }
            // Keep other characters as they are
            else {
                result += c;
            }
        }

        System.out.println(result);
    }
}
