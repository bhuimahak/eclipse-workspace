package interfaceAndPolymorphism;

public class Owner {

	public static void main(String[] args) {
		Vet myVet = new Vet();
		Dog myDog = new Dog();
		myVet.giveShot(myDog);

	}

}
