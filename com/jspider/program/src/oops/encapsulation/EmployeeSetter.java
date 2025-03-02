
package com.jspider.program.src.oops.encapsulation;
public class EmployeeSetter {
    private  int id;
    private String name;
    private String address;
    private double salary;

    public void setId(int id){
        //Validation
        this.id=id;
    }

    public void setName(String name){
        //Validation
        this.name=name;
    }

    public void setAddress(String address){
        //validation
        this.address=address;
    }

    public void setSalary(Double salary){
        //validation
        this.salary=salary;
    }
}
