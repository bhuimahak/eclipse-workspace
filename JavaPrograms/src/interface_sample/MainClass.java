package interface_sample;

public class MainClass {
	
	public static void main(String[] args) {
		InterfaceEx lib1 = new ConLib1();
		InterfaceEx lib2 = new ConLib2();
		
		MyClass my = new MyClass(lib1);
		my.myMethod1();
		my.myMethod2();
		
		MyClass myObj = new MyClass(lib2);
		myObj.myMethod1();
		myObj.myMethod2();
		
		//lib = new ConLib2();
		
	}

}
