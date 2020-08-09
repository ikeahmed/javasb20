package com.me.abstraction.interfaces;

public class MainTest {
    public static void main(String[] args) {
        Eagle myEagle = new Eagle();

        myEagle.eat();
        myEagle.sound();
        myEagle.fly();

        System.out.println("Number of legs: " + Bird.numberOfLegs); //could be myEagle.numberOfLegs
        System.out.println("Outer covering: " + Bird.outerCovering);
    }
}
