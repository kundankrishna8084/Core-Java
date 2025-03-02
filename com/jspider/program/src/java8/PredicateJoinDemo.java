package com.jspider.program.src.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee{
    String name;
    String location;
    String dept;
    Employee(String name, String location, String dept){
        this.name=name;
        this.location=location;
        this.dept=dept;
    }
}
public class PredicateJoinDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Krishna","Bihar","Software");
        Employee e2 = new Employee("Krish","Delhi","DevOps");
        Employee e3 = new Employee("Abhishek","UP","Testing");

        List<Employee> emp = Arrays.asList(e1,e2,e3);
        Predicate<Employee> p1 = (e) ->e.location.equals("Bihar");
        Predicate<Employee> p2 = (e) ->e.dept.equals("Software");

        // Predicate Joining
        Predicate<Employee> p = p1.and(p2);
        for (Employee e: emp){
            if (p.test(e)){
                System.out.println(e.name);
            }
        }



    }
}
