package com.jspider.program.src.constructor;

public class Employee {
    int id;
    String name;
    String dept;
    double salary;

    Employee(){
        System.out.println("No-arg Constructor");
    }

    Employee(int id, String name,String dept,double salary){
        this.id=id;
        this.name=name;
        this.dept=dept;
        this.salary=salary;

    }
    public void getDetails(){
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Department:"+dept);
        System.out.println("Salary:"+salary);
        System.out.println(this);
    }
}
