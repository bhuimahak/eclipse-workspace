import java.util.ArrayList;
import java.util.List;


public class Dog {
	
	public static void main(String[] args){
	
	List<Object> myList = new ArrayList<Object>();
	Dog d = new Dog();
	myList.add(d);
	Dog myDog = (Dog)myList.get(0);//need to typecast since method is returning object reference type
	//Object myDog = myList.get(0);
	myDog.bark(); //this wont work as myDog is of object reference type
	System.out.println(myDog.hashCode());
	System.out.println(myDog);
	System.out.println();
	}
	
	public void bark(){
		System.out.println("Dog is barking");
	}
}
