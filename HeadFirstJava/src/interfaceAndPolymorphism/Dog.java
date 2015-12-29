package interfaceAndPolymorphism;

public class Dog  extends Canine{
	String name ;
	
	
	public Dog(){
		 this.name = "Fido";
		}
	
	
	public void makeNoise(){
		System.out.println( this.name + " making noise");
	}
	
	public void eat(){
		System.out.println("Dog eating");
	}
	

}
