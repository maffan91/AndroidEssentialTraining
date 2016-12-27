package com.example;

/**
 * Created by maffan on 12/27/2016.
 */

public abstract class AbstractClass {

    //every subclass of Vehicle will extend it
    abstract void callMe();

    void callMeToo(){

        System.out.println("This is a concrete method");
    }

    public final void nonOverloadedMethod(){

        System.out.println("You Can't Override Me!!!");
    }


}
