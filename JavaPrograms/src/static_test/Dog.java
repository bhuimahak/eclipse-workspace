package static_test;

public class Dog extends Animal {
	public static void someStaticFun() {
		//super.someStaticFun();
		System.out.println("Dog : someStaticFun");
	}

	public void someFun(Dog d) {// change Dog d with Animal a and then run main class once again..it looks like in inheritance argument type also must be same jus the return type has to be compatible
		System.out.println("Dog : someFun");
		
		}
	
	public Dog sample(){
		System.out.println("Dog sample method");
		return new Dog();
	}
}
