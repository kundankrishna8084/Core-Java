package com.jspider.program.src.constructor.copyConstrutor;

public class Fruit {
        String name;
        int price;
        double weight;
        String color;

        Fruit(double x){
            System.out.println("No-arg constructor");
        }

        Fruit(String name, int price , double weight){
            this.name=name;
            this.price=price;
            this.weight=weight;

        }
        Fruit(Fruit p){
            //name=mango
            this.name=p.name;

            //Price=110
            this.price=p.price;

            //weight=3.8
            this.weight=p.weight;
        }
}
