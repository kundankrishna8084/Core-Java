
package com.jspider.program.src.constructor.chaining;
public class Student {
    String name;
    int roll_no;
    Student(){
        System.out.println("Default Constructor");
        System.out.println("New Student registration");
    }
    Student(String name){
        this();
        this.name=name;
    }
    Student(String name, int roll_no){
        this(name);
        this.roll_no=roll_no;
        System.out.println("Student: " + name + ", Roll Number: " +roll_no);
    }
}
