
package com.jspider.program.src.non_primitive_typeCasting.upCasting;
public class Mango extends Fruit {
    int price;
    int weight;
    String color;
    Mango(){
        System.out.println("No-arg Constructor");
    }
    Mango(int price,int weight,String color){
        this.price=price;
        this.weight=weight;
        this.color=color;
    }
}
