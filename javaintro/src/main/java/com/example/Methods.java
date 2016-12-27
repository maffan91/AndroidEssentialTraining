package com.example;


public class Methods{



    // method declaration with no arguments and no return type
    public void justPrint(){

        System.out.println("Hello World!");
    }

    // method declaration with argument and return type

    public double calculateArea(double radius){

        //some logic
        return Employee.PI*radius*radius;
    }

    // method with more than one arguments
    public double calculateVolume(int length,int breadth,int height){

        return length*breadth*height;
    }


}