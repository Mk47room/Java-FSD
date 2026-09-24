package com.main;

import com.beans.Account;
import com.beans.Current;
import com.beans.Dmat;
import com.beans.Savings;

public class InterfaceDemo {
    public static void main(String[] args) {
        // Polymorphism
        Account account = new Savings(); //this creates savings account
        System.out.println(account.getInterestRate());
        // account.myMethod();

    }
}
/*
interface Account{} //super
class Savings implements Account{ //sub
    void m1(){}
}
Account account = new Savings(); // super ref = obj of sub

* */