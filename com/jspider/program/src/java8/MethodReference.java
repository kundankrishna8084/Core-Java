
package com.jspider.program.src.java8;
import java.util.function.Consumer;
@FunctionalInterface
interface  MethodInterface{
    public void m1();
}
public class MethodReference {
    public   static void m2(){
        System.out.println("This is m2() method");
    }
    public static void main(String[] args) {
//       Consumer<String> consumer =(msg)-> System.out.println(msg);
//       consumer.accept("Hi");
        MethodInterface mi= MethodReference::m2;
        mi.m1();
    }
}
