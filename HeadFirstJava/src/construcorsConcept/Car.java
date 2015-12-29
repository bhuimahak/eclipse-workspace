package construcorsConcept;

public class Car {

	private String name;
	
	public Car(){
		this.name = "defaultName";
	}
	
	public Car(String theName){
		this.name = theName;
		
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
		
	}
}
