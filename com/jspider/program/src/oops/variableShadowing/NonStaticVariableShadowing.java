package com.jspider.program.src.oops.variableShadowing;

public class NonStaticVariableShadowing {
int x=90;
public  void test(){
    System.out.println("Test Method");
    int y =900;
    System.out.println("Local variable:"+y);
    // We can call non-static variable by using this keyword
    System.out.println("Non-static variable:"+this.x);
}

    public static void main(String[] args) {
        System.out.println("Main starts here:");
        // When we have to call test method we can call by using object reference(Object creation)
       NonStaticVariableShadowing nss= new NonStaticVariableShadowing();
       nss.test();
        System.out.println("Main ends Here:");
    }
}
