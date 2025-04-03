package com.jspider.program.src.java8.interviewQuestion;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeData{
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));

        employeeList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));

        employeeList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));

        employeeList.add(new Employee(4, "Orlen", 28, "Male", "Development ", 2014, 32500.0));

        employeeList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));

        employeeList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));

        employeeList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));

        employeeList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));

        employeeList.add(new Employee (9, "Gita", 24, "Female", "Sales", 2016, 11500.0));

        employeeList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));

        employeeList.add(new Employee (11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));

        employeeList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));

        employeeList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));

        employeeList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5)); employeeList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));

        employeeList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

/*
        //1.How many male and female employees are there in the organization ?
        Map<String, Long> map1= employeeList
                .stream()
                .collect(Collectors
                        .groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(map1);


 */

/*
2.Print the name of all departments in the organization?

        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(name-> System.out.println(name));
 */



/*
3. What is the average age of male and female employees?

       Map<String, Double> map= employeeList
                .stream()
                .collect(Collectors
                        .groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
        System.out.println(map);
 */

        /*
        4. Get the details of the highest paid employee in the organization ?

        Optional<Employee> optional= employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        if (optional.isPresent()){
            Employee employee =optional.get();
            System.out.println(employee);
        }
         */

        /*
        5. Get the names of all employees who have joined after 2015?

        employeeList.stream().filter(e->e.yearOfJoining>2015)
                .map(e->e.name)
                .forEach(name-> System.out.println(name));
         */

        /*
       6. Count the number of employees in each department ?

        Map<String, Long> map2= employeeList
                .stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment
                                ,Collectors.counting()));
        System.out.println(map2);
        
         */


    }
}

 class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;
     // constructor
     public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
         this.id = id;
         this.name = name;
         this.age = age;
         this.gender = gender;
         this.department = department;
         this.yearOfJoining = yearOfJoining;
         this.salary = salary;
     }



    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }

     @Override
     public String toString() {
         return "Employee{" +
                 "age=" + age +
                 ", id=" + id +
                 ", name='" + name + '\'' +
                 ", gender='" + gender + '\'' +
                 ", department='" + department + '\'' +
                 ", yearOfJoining=" + yearOfJoining +
                 ", salary=" + salary +
                 '}';
     }
 }


