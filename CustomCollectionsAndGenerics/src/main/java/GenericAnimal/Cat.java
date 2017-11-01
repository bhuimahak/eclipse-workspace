package GenericAnimal;

public class Cat implements Animal, Pet {

	@Override
	public void roam() {
     System.out.println("Cat is roaming");		
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping.");
	}
}
