package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class FilterDemo1 {
    public static void main(String[] args) {
        // Creation of Stream Api
        //First Way
        List<Integer> list = Arrays.asList(66, 32, 45, 12, 20);
		/*for (Integer i : list) {
			if (i > 20) {
				System.out.println(i);
			}
		}*/

		/*Stream<Integer> stream = list.stream();

		Stream<Integer> filteredStream = stream.filter(i -> i > 20);

		filteredStream.forEach(i -> System.out.println(i));*/

        list.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

    }
}
