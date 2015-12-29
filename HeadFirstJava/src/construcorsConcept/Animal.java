package construcorsConcept;

public class Animal {
	
	private String name;
	
	public Animal(){
		System.out.println("In animal constructor");
	}
	
	public Animal(String theName){
		this.name = theName;
		
	}
	
	public String getName(){
		return name;
	}

}
