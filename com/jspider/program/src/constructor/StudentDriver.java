package com.jspider.program.src.constructor;

import java.time.LocalDate;

public class StudentDriver {
    public static void main(String[] args) {
          Student s1= new Student();
          // if i call no arg constructor then output is null
        System.out.println("======================");
          s1.demo();
        System.out.println("======================");
          Student s2 = new Student("xyz",123,"abcd","Noida",1234567890L, LocalDate.parse("2002-09-15"));

          s2.demo();
    }
}
