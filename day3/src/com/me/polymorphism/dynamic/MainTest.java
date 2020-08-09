package com.me.polymorphism.dynamic;

public class MainTest {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.eat();

        Bird myBird = new Bird();
        myBird.eat();
    }
}
