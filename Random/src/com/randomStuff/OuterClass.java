package com.randomStuff;

public class OuterClass {
 
	private int x;
	private static int y;

	public void createObject() {
		InnerClass s = new InnerClass();
		InnerClass i = new InnerClass();
		i.go();
	}

	class InnerClass {
		public void go() {
			x = 2;
			createObject();
		}
	}

	static class InnerStatic {
		public void foo() {
			y = 4;
		}
	}
}
