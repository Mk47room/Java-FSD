package com.main;

import com.beans.Customer;

public class HeapDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"harry potter", 21);

        Customer c2 = new Customer();
        c2.setId(2);
        c2.setName("Ronald weasley");
        c2.setAge(22);

        // JVM :- Java Virtual Machine : JDK + JRE
        Customer c3 = c1;

        System.out.println(c1.getName());
        System.out.println(c3.getName());

        c1.setName("hermione granger");
        System.out.println(c3.getName());

        // As soon as the main method ends, its main_stack gets deleted
        // after this, at any point, JVM would initiate garbage collector
        // System.gc();

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
