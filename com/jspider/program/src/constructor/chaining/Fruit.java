package com.jspider.program.src.constructor.chaining;

public class Fruit {
    String name;
    int price;
    double weight;
    String color;

    Fruit(){
        System.out.println("No-arg constructor");
    }
    Fruit(String name){
        this();
        this.name=name;
    }

    Fruit(String name,int price){
        this(name);
        this.price=price;
    }

    Fruit(String name, int price , double weight){
        this(name, price);
        this.weight=weight;

    }

    Fruit(String name, int price , double weight,String color){
        this(name, price, weight);
        this.color=color;

    }
}
