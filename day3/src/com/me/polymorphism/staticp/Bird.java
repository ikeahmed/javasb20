package com.me.polymorphism.staticp;
/*
the Bird() class below has three fly() methods.
 */
public class Bird {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.fly(10000);
        myBird.fly("eagle", 10000);
        //myBird.fly(10000, "eagle");
    }
    public void fly() {
        System.out.println("The bird is flying.");
    }
    public void fly(int height) {
        System.out.println("The bird is flying " + height + " feet high.");
    }
    public void fly(String name, int height) {
        System.out.println("The " + name + " is flying " + height + " feet high.");
    }
}
