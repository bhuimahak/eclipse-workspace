package interfaceAndPolymorphism;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		Animal d = new Dog();
		Animal c = new Cat();
		Animal l = new Lion();
		Animal h = new Hippo();
		animals.add(d);
		animals.add(c);
		animals.add(l);
		animals.add(h);
		ArrayListExample obj = new ArrayListExample();
		obj.makeSound(animals);
	}
	
	
	public void makeSound(ArrayList<Animal> ani){
		for(Animal a : ani){
			a.makeNoise();
		}
		
	}

}
