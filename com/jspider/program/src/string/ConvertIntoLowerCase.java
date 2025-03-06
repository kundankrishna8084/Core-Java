
package com.jspider.program.src.string;
public class ConvertIntoLowerCase {
    public static void main(String[] args) {
        String s1 = "KunHYUan";
        String result =lowerCase(s1);
        System.out.println(result);

    }
    public static String lowerCase(String s1){
//        char [] c1 = s1.toCharArray();
//        for (int i = 0; i <c1.length ; i++) {
//            if(c1[i]>=65 && c1[i]<=90){
//                c1[i]= (char) (c1[i]+32);
//
//            }
//        }
//        return String.valueOf(c1);

        String s2="";
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if(c1>=65 && c1<=90 ){
                s2=s2+ (char) (c1+32);
            }else {
                s2=s2+c1;
            }

        }
        return  s2;
    }
}
