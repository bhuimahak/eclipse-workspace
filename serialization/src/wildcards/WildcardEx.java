package wildcards;

import java.util.ArrayList;

public class WildcardEx {

	public static void main(String[] args) {
	ArrayList<Animal> animalList = new ArrayList<>();
	animalList.add(new Dog());
	ArrayList<Dog> dogList = new ArrayList<>();
	dogList.add(new Dog());
	takeAnimals(dogList);
	}

	private static void takeAnimals(ArrayList<?extends Animal> animalList) {
		for(Animal a : animalList){
			a.eat();
		}
		
	}

}
