package com.randomStuff;

public class Dog extends Animal {

    public Dog(int size) {
        super(size);
        System.out.println("in dog constructor");
    }

    public void someMethod(Dog d) {

        size = 5;
        int sizeOfdog = d.getSize();
        d.getSize();
        System.out.println("Dog's size is " + sizeOfdog);
        d.eat();
    }

    public static void main(String[] args) {
        Dog f = new Dog(4);
        System.out.println(f.getSize());
        f.someMethod(f);
    }
}
