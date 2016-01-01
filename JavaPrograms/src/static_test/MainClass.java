package static_test;

public class MainClass {

	public static void main(String[] args) {
		Animal a = new Dog();

		a.someFun(a); // this will invoke method in Animal class why?although in
						// dog class someFun(Dog d) is sub type of animal type
		a.sample(); // here I have given return type in Animal class as 'Animal'
					// and in 'Dog' class as Dog, and it runs dog class method

	}

}
