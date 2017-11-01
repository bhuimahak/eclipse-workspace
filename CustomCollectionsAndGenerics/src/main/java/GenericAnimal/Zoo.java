package GenericAnimal;

import java.util.ArrayList;

public class Zoo<E extends Animal> {
	ArrayList<E> animalList = new ArrayList<E>();

	public void feed(E o) {
		System.out.println("Animal is eating");
	};

	public void addToList(E o) {
		animalList.add(o);
	}

	public <T extends Pet> void doSomething(ArrayList<T> object) {

	}
	
	public <T extends Pet> void doAgain(T object) {

	}

}
