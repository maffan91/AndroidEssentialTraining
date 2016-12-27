package com.example;

/**
 * Created by maffan on 12/27/2016.
 */

public class ExtAbstractClass extends AbstractClass {

    // overriding methods of abstract class
    @Override
    void callMe() {

        System.out.println("Implementation of CallMe!");
    }


    // Trying to override a final method of base class
//    @Override
//    public void nonOverloadedMethod() { // Error
//        super.nonOverloadedMethod();
//    }
}
