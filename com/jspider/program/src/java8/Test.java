package com.jspider.program.src.java8;

import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
        // Crating Object
        Doctor d = new Doctor();

        //Creating object with the help of java8 features
        // Doctor::new represent only Zero parameter Constructor
        Supplier<Doctor> sd = Doctor::new;
//          Doctor doctor=sd.get();
//        System.out.println(doctor.hashCode());
        System.out.println(sd.get().hashCode());


    }
}
    class Doctor{
       public Doctor(){
           System.out.println("Doctor Constructor.....");
        }
    }

