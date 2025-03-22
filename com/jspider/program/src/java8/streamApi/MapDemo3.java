package com.jspider.program.src.java8.streamApi;

import java.util.List;
import java.util.stream.Stream;

public class MapDemo3 {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 35, 55000.00);
        Employee e2 = new Employee("David", 25, 45000.00);
        Employee e3 = new Employee("Buttler", 35, 35000.00);
        Employee e4 = new Employee("Steve", 45, 65000.00);
         Stream<Employee> stream = Stream.of(e1,e2,e3,e4);

         stream.filter(e->e.salary>=50000.00)
                 .forEach(e-> System.out.println(e));
    }
}
class Employee{
    String name;
    int age;
    double salary;

    Employee(String name, int age , double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
