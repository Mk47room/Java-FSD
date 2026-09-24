package com.beans;

public class Savings implements Account {
    @Override
    public double getInterestRate() {
        return 4.0;
    }
    /*
    //You can't create your own method while implementing.

    public void myMethod(){
        System.out.println("my logic");
    }
    */

}