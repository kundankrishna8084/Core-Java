package com.jspider.program.src.exceptionHandling;

public class UnderAgeException  extends Exception{

    UnderAgeException(){
    }
    UnderAgeException(String msg){
        super(msg);
    }
}
