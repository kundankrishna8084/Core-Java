package com.jspider.program.src.constructor;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee(123,"Kundan ","Computer",566778.90);
        System.out.println(e1);
        System.out.println(e2);
        e1.getDetails();
        e2.getDetails();

    }
}
