package com.jspider.program.src.java8;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        System.out.println("Enter User ID");
        int userId= scn.nextInt();

        User u = new User();
//        String userName= u.getUserNameById(userId);
//
//        if (userName!=null){
//            String msg=userName.toUpperCase()+",Hello";
//            System.out.println(msg);
//        }else {
//            System.out.println("Invalid Id");
//        }

        Optional<String> userName = u.getUserNameById(userId);
        if (userName.isPresent()){
            String name=userName.get();
            System.out.println(name.toUpperCase()+" ,Hello");

        }else {
            System.out.println("Np Data found");
        }

    }
}
