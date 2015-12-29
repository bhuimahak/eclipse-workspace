package HeadFirst;

public class InterfaceTest extends AbstractTest implements InterfaceEx, Interface2 {

	public static void main(String[] args) {
		
	InterfaceTest interobj = new InterfaceTest();
	interobj.method1();
	interobj.start();
	interobj.method();
	System.out.println(interobj.inter2());

	}

	@Override
	public void method1() {
		System.out.println("In method1");
		
	}

	@Override
	public void method2() {
		System.out.println("In method2");
		
	}

	@Override
	public String inter2() {
		
		return "hello";
	}

	@Override
	public void inter22() {
	System.out.println("I am in inter 22");	
		
	}

	
	@Override
	void method() {
		System.out.println("In method-- InterfaceTest class");
		
	}

}
