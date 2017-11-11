package com.randomStuff;
//Exercise: checking visibilty of superclass variables in subclass
public class Animal {
     protected int size;
     public String name;
     protected int age;
     
     public Animal(int size){
         System.out.println("in parametrised constructor");
         this.size = size;
     }
     public Animal(){
         System.out.println("in default constructor");
         //can set default size here..but will not get size set from Dog's class
     }
     
    
    public void eat(){
        System.out.println("Animal is eating and size: " + size);
    }
    
    public int getSize(){
        return this.size;
    }

}
