package test.encapsulation;

public class School extends Institution{
	
	public Room r = null;
	
	public School(){
		System.out.println("inside School constructor");
	}
	
	public School(Room r){
		
		this.r = r;
		System.out.println("inside School constructor-acceptin room");
	}

}
