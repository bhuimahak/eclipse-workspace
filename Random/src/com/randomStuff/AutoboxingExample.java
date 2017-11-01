package com.randomStuff;

public class AutoboxingExample {
	
	//this code will give nullpointer exception..this isan implication of autoboxing
	Integer i;
	int j;

	public static void main(String[] args) {
		AutoboxingExample obj = new AutoboxingExample();
		obj.go();
	}

	public void go(){
		j = i;
		System.out.println(j);
		System.out.println(i);
		
	}
}
