package com.jspider.program.src.constructor;

import java.time.LocalDate;

public class Student {
    String name;
    int id;
    String fatherName;
    String address;
    Long phone;
    LocalDate dob;

    public Student(){
        System.out.println("no-arg constructor");
    }


    //Parameterized Constructor
    public Student(String name, int id,String fatherName, String address, Long phone, LocalDate dob){
        this.name=name;
        this.id=id;
        this.fatherName=fatherName;
        this.address=address;
        this.phone=phone;
        this.dob=dob;

        System.out.println("Parameterized constructor");
    }
    
    public void demo(){
        System.out.println("Name is: " +name);
        System.out.println("Father name is: " +fatherName);
        System.out.println("Address is: " +address);
        System.out.println("Phone number is: " +phone);
        System.out.println("Date of Birth is: "+dob);

   }
}

