package static_test;

public class A {
	int i = 0;
	static int s;
	
	public void fun() {
		i++;
		System.out.println("FUN: " + i);
	}
	
	public static void stfun() {
		s++;
		System.out.println("Static FUN: " + s);
	}
	public static void main(String args[]) {
		A a = new A();
		a.fun();
		a.stfun();
		A b = new A();
		b.fun();
		b.stfun();
	}
}