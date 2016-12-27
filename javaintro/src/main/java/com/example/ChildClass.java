package com.example;

/**
 * Created by maffan on 12/27/2016.
 */

public class ChildClass extends BaseClass {



    // Method Overriding
    @Override
    public void who() {
        System.out.println("I am a ChildClass object");
    }

    public void accessMe(){

        System.out.println("I am only accessible with ChildClass object/reference");

    }
}
