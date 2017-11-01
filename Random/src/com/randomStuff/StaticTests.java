package com.randomStuff;

 class StaticSuper {
	 
	 static{
		 System.out.println("Super static block");
	 }
	 
	 public StaticSuper() {
		 System.out.println("super constructor");
	 }

}

 public class StaticTests extends StaticSuper {
	 static int rand;
	 
	 static{
		 rand = (int)(Math.random() * 6);
		 System.out.println("static block" + rand);
	 }
	 
	 StaticTests(){
		 System.out.println("constructor");
	 }
	 public static void main(String[] args){
		 System.out.println("In main");
		 StaticTests st = new StaticTests();
	 }
 }