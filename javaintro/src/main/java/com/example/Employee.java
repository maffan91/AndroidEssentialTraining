package com.example;



class Employee {

    // private variable
    private int age;

    // public variable
    public String name;

    // protected variable
    protected int salary;

    // static variable, same for all instances
    public static String employerName = "Folio3";

    // a constant, can't be modified
    public static final double PI = 3.14159;


    //constructor (default)
    public Employee(){

    }

    // this is also called constructor overloading
    // parametrized constructors

    public Employee(int age, String name, int salary){

        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int age, String name){

        this.age = age;
        this.name = name;
    }


    // passing object as a constructor
    public Employee(Employee employee){

        this.age = employee.getAge();
        this.name = employee.getName();
        this.salary = employee.getSalary();
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }


    public static String getEmployerName(){
        return employerName;
    }


}