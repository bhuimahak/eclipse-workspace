import java.util.ArrayList;


public class TypeCastExample {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		Dog d = new Dog();
		myList.add(d);
		Object o = myList.get(0);
		System.out.println(o instanceof Dog);
		if(o instanceof Dog){
			Dog myDog = (Dog) o; //typecasting the reference type to Dog because I know its a dog Object.
			myDog.bark();
			}
		else
			System.out.println("object is not of class Dog");
		

	}

}
