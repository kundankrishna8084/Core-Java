
package com.jspider.program.src.constructor.chaining;
public class Employee {
    String name;
    int id;

    public Employee(){
        System.out.println("This is default Constructor");
    }
    public Employee(String name){
        this();// Calling default constructor
        this.name=name;
    }
    public Employee(String name, int id){
        this(name);// Calling single-parameter constructor
        this.id=id;
        System.out.println("Employee Name: " + name + ", ID: " + id);
    }
}
