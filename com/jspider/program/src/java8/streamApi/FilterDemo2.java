package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
          names.stream().filter(i->i.startsWith("A")).
                  forEach(i-> System.out.println(i));


    }

}
