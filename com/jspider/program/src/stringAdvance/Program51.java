
package com.jspider.program.src.stringAdvance;
public class Program51 {
    public static void main(String[] args) {
        String s1 = "Ashmit90547";
        int result=largestNumeric(s1);
        System.out.println(result);
    }
    private static int largestNumeric(String s1) {
        int biggest=-1;
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(ch>='0' && ch<='9'){
                int num= ch-'0';
                if (num>biggest)
                    biggest=num;
            }
        }
        return biggest;
    }
}
