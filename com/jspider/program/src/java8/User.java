package com.jspider.program.src.java8;

import java.util.Optional;

public class User {

//    public String getUserNameById(Integer id) {
//        if (id == 100) {
//            return "Radha";
//        } else if (id == 101) {
//            return "Krishna";
//        } else if (id == 102) {
//            return "Rani";
//        } else {
//            return null;
//        }
//    }
        public Optional<String> getUserNameById(Integer id){
            String name=null;

            if (id==100){
                name= "Radha";
            } else if (id==101) {
                name= "Krishna";
            } else if (id==102) {
                name= "Rani";
            }
               return Optional.ofNullable(name);
            }

       }


