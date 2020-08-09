package com.me.abstraction.classes;

class Fish extends Animal {
    // both methods need to be implemented. otherwise you will see errors
    void move() {
        System.out.println("Moves by swimming.");
    }
    void eat() {
        System.out.println("Eats seafood.");
    }
}