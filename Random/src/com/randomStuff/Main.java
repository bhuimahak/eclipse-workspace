package com.randomStuff;
import com.randomStuff.OuterClass.InnerClass;
import com.randomStuff.OuterClass.InnerStatic;
public class Main {

	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		//InnerClass innerObj = outer.new InnerClass();
		
		OuterClass.InnerStatic innerStaticObject = new InnerStatic();
		innerStaticObject.foo();
		

	}

}
