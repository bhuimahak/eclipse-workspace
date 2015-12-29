package interfaceAndPolymorphism;

public class Vet {
	String name;
	
	public void vet(){
		String name = "VetDoctor";
	}
	
	public void giveShot(Animal a){
		System.out.println("Giving a shot to Animal");
		a.makeNoise();
	}

}
