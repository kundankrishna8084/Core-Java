package com.jspider.program.src.java8.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class FirstDemo {
    public static void main(String[] args) {
        // Creation of Stream Api
        //First Way
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5);

        Stream<String> stream = Stream.of("Kundan","Krishna");
        System.out.println(stream);
        

        // Second Way
        ArrayList<String> names = new ArrayList<>();
        names.add("Kundan");
        names.add("Kunal");
        names.add("Krishna");
        names.add("Krish");
        names.add("Test");

        Stream<String> stream2 = names.stream();

    }
}
