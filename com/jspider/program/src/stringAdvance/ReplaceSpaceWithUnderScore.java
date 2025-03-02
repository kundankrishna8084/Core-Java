
package com.jspider.program.src.stringAdvance;
public class ReplaceSpaceWithUnderScore {
    public static void main(String[] args) {
//        String s1 = "Radha Krishna ";
//        // By Using Replace Method
//         String s2= s1.replace(' ','_');
//        System.out.println(s2);
//
//
        // By Using Without replace Method
        String s1 = "Radha Krishna";
        String s2 ="";
        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            if(c1==' ')
                s2=s2+'_';
            else
                s2=s2+c1;
        }
        System.out.println("Modify String:"+s2);

    }
}
