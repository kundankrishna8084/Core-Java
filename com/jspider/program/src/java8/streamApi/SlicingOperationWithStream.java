package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class SlicingOperationWithStream {
    public static void main(String[] args) {
        List<String> javacourses = Arrays.asList("coreJava", "advjava", "SpringBoot","RestApi","Microservice");
       // javacourses.stream().limit(3).forEach(c-> System.out.println(c));

        // javacourses.stream().skip(3).forEach(c-> System.out.println(c));

        List<String> names = Arrays.asList("Java", "Java", "Krishna","Test","Test");

        names.stream().distinct().forEach(name-> System.out.println(name));
    }
}
