package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
        // Print name with its length which are starting with
        // 'A' using Stream API
        // Ashok--5
        //Anil --4
        //Akash--5

        names.stream().filter(name->name.startsWith("A"))
                .map(name->name+"-"+name.length())
                .forEach(name-> System.out.println(name));


    }
}
