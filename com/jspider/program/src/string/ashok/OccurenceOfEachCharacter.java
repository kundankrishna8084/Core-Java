
package com.jspider.program.src.string.ashok;
import java.util.HashMap;
import java.util.Map;
public class OccurenceOfEachCharacter {
    public static void main(String[] args) {
        String s1 ="Hello";
        Map<Character, Integer> map = new HashMap<>();
        char [] arr = s1.toCharArray();
        for (char ch:arr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }else{
                int value=map.get(ch);
                map.put(ch,value+1);
            }
        }
        System.out.println(map);
    }
}
