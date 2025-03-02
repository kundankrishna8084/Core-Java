
package com.jspider.program.src.java8;
import java.util.function.BiFunction;
import java.util.function.Function;
public class BiFunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f= (name)->name.length();
        System.out.println(f.apply("Krishna"));
        System.out.println(f.apply("Bihar"));
        System.out.println(f.apply("Ram"));

        BiFunction<Integer,Integer,Integer> biFunction=(a, b)->a+b;
        System.out.println(biFunction.apply(10,20));



    }


}
