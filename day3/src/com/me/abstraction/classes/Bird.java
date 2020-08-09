package com.me.abstraction.classes;

class Bird extends Animal {
// both methods need to be implemented. otherwise you will see errors
    void move() {
        System.out.println("Moves by flying.");
    }
    void eat() {
        System.out.println("Eats birdfood.");
    }
}