package com.jspider.program.src.stringAdvance;

public class LengthWithoutLengthMethod {
    public static void main(String[] args) {
        String s1 = "MohanKumarSingh";
        getLength(s1);

    }
    //By using toCharArray();
    public static  void getLength(String s1){
        char [] c1= s1.toCharArray();
        System.out.println(c1.length);
    }

    public static  int  tryCatch(String s1) {
        int length = 0;
        try {
            for (int i = 0; ; i++) {
                s1.charAt(i);
                length++;
            }
        } catch (Exception e) {
            return length;
        }
    }
}
