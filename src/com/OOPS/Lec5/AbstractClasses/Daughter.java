package com.OOPS.Lec5.AbstractClasses;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I'm going to be a doctor");

    }

    @Override
    void partner() {
        System.out.println("I love Ironman");
    }
}
