package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("india","usa","uk","japan");
//        for (String name:names){
//            System.out.println(name.toUpperCase());
//        }

//        names.stream().map(name->name.toUpperCase())
//                .forEach(n-> System.out.println(n));

        names.stream().mapToInt(name->name.length()).
                forEach(i-> System.out.println(i));

    }
}
