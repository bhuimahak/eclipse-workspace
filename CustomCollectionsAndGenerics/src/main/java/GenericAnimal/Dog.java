package GenericAnimal;

public class Dog implements Animal, Pet {

	@Override
	public void roam() {
		System.out.println("Dog is roaming");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping.");
	}
}
