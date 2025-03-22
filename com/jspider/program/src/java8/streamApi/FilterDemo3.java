package com.jspider.program.src.java8.streamApi;

import java.util.stream.Stream;

public class FilterDemo3 {
    public static void main(String[] args) {
        User u1 = new User("Anushka", 25);
        User u2 = new User("Smith", 30);
        User u3 = new User("Raju", 15);
        User u4 = new User("Rani", 10);
        User u5 = new User("Charles", 35);
        User u6 = new User("Ashok", 30);

        Stream<User> stream= Stream.of(u1,u2,u3,u4,u5,u6);

       // stream.filter(u->u.age>=18).
        // forEach(u-> System.out.println(u));

//        stream.filter(u->u.age>=18 &&
//                u.name.startsWith("A")).
//                forEach(u -> System.out.println(u));



    }
}
    class User{
        String name;
        int age;
        User(String name, int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "User{" +"age=" + age + ", name='" + name + '\'' + '}';
        }
    }

