

package com.jspider.program.src.string.ashok;
import java.util.HashMap;
import java.util.Map;
public class FindFirstNonRepeatedChar {
    public static void main(String[] args) {

        // Approach-1
        //Without using Collection
        /*
        for (int i = 0; i <s1.length() ; i++) {
            boolean unique=true;
            for (int j = 0; j < s1.length(); j++) {
                if (i!=j && s1.charAt(i)== s1.charAt(j)){
                    unique=false;
                }
            }
            if (unique){
                System.out.println(s1.charAt(i));
                break;
            }
        }

         */

        // Approach-2
        //Using Collection
        String s1 ="AABCDBEE";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)){
                map.put(ch,map.get(ch) +1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entrySet:map.entrySet()){
            if(entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
                break;
            }
        }


    }
}
