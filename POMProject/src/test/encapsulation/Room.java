package test.encapsulation;

public class Room {
	
	private int space;
	
	public Room(){
		System.out.println("Inside Room class constructor");
	}
	
	public int getSpace(){
		return this.space;
	}

	
	public void setSpace(int space){
		this.space = space;
	}
}
