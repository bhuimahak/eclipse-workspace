package com.randomStuff;


    

    public class Car extends Vehicle {

       public static void main(String args[]) {

          Car a = new Car();
          boolean result =  a instanceof Vehicle;
          System.out.println( result );
       }
    }
    
    class Vehicle {}


