package static_test;

public class Animal {
	public static void someStaticFun() {
		System.out.println("Animal : someStaticFun");
	}

	public void someFun(Animal a) {
		System.out.println("Animal : someFun");
	}
	
	public Animal sample(){
		System.out.println("animal sample method");
		return new Animal();
	}
}
