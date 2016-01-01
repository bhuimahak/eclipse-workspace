package polymorphism;

public class DemoMain {

	public static void main(String[] args) {
		Animal a = new Dog();
		Dog d = new Dog();
		
		Xyz x = new Xyz();
		x.someFun(a); 
		x.someFun(d);//y is this working, u said it wont work!
		
		System.out.println("-----");
		
		Abc abc = new Abc();
		abc.someFun(a);
		abc.someFun(d);

	}

}
