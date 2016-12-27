package com.example;

public class MyClass {


    public static void main(String[] args){


        System.out.println("Welcome To Android Essential Training!");


        // Variables in Java

        //1. Integer variable

//        // primitive data type
//        int myIntVar = 15;
//
//
//        // object data type
//        Integer myIntObject = new Integer(10);
//
//        System.out.println(myIntObject);
//        System.out.println(myIntVar);
//
//
//        //2. String variable
//        String myStringVar = "AbCd";
//        System.out.print(myStringVar);
//
//        // converting an string to uppercase
//        System.out.print(myStringVar.toUpperCase());
//
//        // converting an string to lowercase
//        System.out.print(myStringVar.toLowerCase());
//
//
//        //3. Boolean Variable
//        boolean myBooleanVar = true;
//        System.out.println(myBooleanVar);

//        //4. Character Variable
//        char myCharVariable = 'A';
//        System.out.println(myCharVariable);
//
//        //Increment is possible with chars
//        System.out.println(myCharVariable+1);
//
//
//        //5. Double Variable
//        double myDoubleVar = 12.55;


//        // Control Statements
//
//        // 1. If statement
//
//        // 1. comparing variables
//
//        // if statement with an else block
//        int var1 = 5;
//        int var2 = 3;
//        if (var1 == var2){
//
//            System.out.println("They Are Equal");
//        }else {
//
//            System.out.println("They Are Different");
//        }
//
//        // 2. working on booleans
//
//        // if statement without an else block
//
//        boolean condition = true;
//
//        if(condition){
//            System.out.println("Condition is true");
//        }
//
//
//        // 2. Switch statement
//
//        int controlValue = 1;
//
//        switch (controlValue){
//
//            case 1: {
//
//                System.out.println("First Case!");
//
//                // a break statement is necessary
//                break;
//            }
//            case 2: {
//
//                System.out.println("First Case!");
//                break;
//
//            }
//            default: {
//                System.out.println("Default Case!");
//
//            }
//
//        }



        //Loops


        // 1. For Loop
//        for (int i=0;i < 10;i++){
//
//            System.out.println("Iteration: " + (i+1) + "!");
//
//            //breaking a loop
//            if(i == 5){
//                System.out.println("Escaping!!!");
//                break;
//            }
//
//        }


        // 2. While Loop

//        int i = 0;
//        while (i != 5){
//
//            System.out.println("Iteration: " + (i+1) + "!");
//            i++;
//        }



        // 3. Do-While Loop


        // it will execute the body first and then check the condition
//        int n = 10;
//        do{
//            System.out.println("Print it anyway!");
//
//        }while (n == 0);


        // Methods overview
        Methods m = new Methods();


        // calling a method that neither takes arguments, nor returns anything
        m.justPrint();

        // calling a method that takes argument, and returns a value
        System.out.println(m.calculateArea(4.5));




        // Object Oriented Introduction
//        // creating object of Employee class
//        Employee emp1 = new Employee(20,"John Doe",20000);
//
//        // accessing private member data
//        System.out.print(emp1.age); // error: can't access private variable directly
//
//        // accessing private member with getter
//        System.out.print(emp1.getAge()); // now OK!
//
//

//        // access static data with static method
//        System.out.print(Employee.getEmployerName());
//
//
//        // trying to modify the final variable
//        Employee.PI = 3.5; // error, can't modify the final variable

//        // Initializing an object with another object
//        Employee emp2 = new Employee(emp1);
//
//        // now emp2 have same values as emp1
//        System.out.print(emp2.getName());



//        //Dynamic Method Dispatch Example
//
//        BaseClass baseReference;
//        BaseClass baseObject = new BaseClass();
//        ChildClass childObject = new ChildClass();
//
//        // assigning the base object to base reference
//        baseReference = baseObject;
//        // will execute the method in the base class
//        baseReference.who();
//
//        baseReference = childObject;
//        // will execute the method in the child class
//        baseReference.who();
//
//        // base reference will only access the overridden methods, for example:
//        baseReference.accessMe(); // Error: Can't refer to non overridden methods


        // Abstract Class Demo
//        ExtAbstractClass obj = new ExtAbstractClass();
//        obj.callMe();
//        obj.callMeToo();


    }

    // Extending a final class
//    class ExtFinalClass extends FinalClass{ // will show error
//
//    }

}
