package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapFunction {
    public static void main(String[] args) {
        List<String > java = Arrays.asList("core java","adv java","springBoot");

        List<String> ui = Arrays.asList("html","css","bs","js");

        List<List<String>> courses = Arrays.asList(java,ui);
        //Collections courses = (Collections) Arrays.asList(java,ui);

        //courses.stream().forEach(c-> System.out.println(c));

        Stream<String> flatMap =courses.stream().flatMap(s->s.stream());
        flatMap.forEach(c-> System.out.println(c));


    }
}
