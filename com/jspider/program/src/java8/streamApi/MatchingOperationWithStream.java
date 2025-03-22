package com.jspider.program.src.java8.streamApi;

import java.util.Arrays;
import java.util.List;

public class MatchingOperationWithStream {
    public static void main(String[] args) {
        Person p1 = new Person("Kundan","India");
        Person p2 = new Person("Krish","Usa");
        Person p3 = new Person("Kunal","China");
        Person p4 = new Person("Krishna","India");

        List<Person> personList= Arrays.asList(p1,p2,p3,p4);
        boolean status1 = personList.stream().anyMatch(p->p.country.equals("India"));
        System.out.println("Any Indian Available:: "+ status1);

        boolean status2 = personList.stream().anyMatch(p->p.country.equals("France"));
        System.out.println("Any Franciane Available:: "+ status2);

        boolean status3 = personList.stream().allMatch(p->p.country.equals("India"));
        System.out.println("All person from Indian:: "+ status3);

        boolean status4 = personList.stream().noneMatch(p->p.country.equals("Mexico"));
        System.out.println("No person from Mexican :: "+ status4);






    }
}
class Person{
    String name;
    String country;

    public Person(String name, String country){
        this.name=name;
        this.country=country;
    }
}
