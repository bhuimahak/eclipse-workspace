package interfaceExample;

public class Home {
	
	Pet pet;
	
	public void doSomething(Pet g){
		g.eat();

	}
	
	public static void main(String[] args){
		Home home =  new Home();
		
		//dependency injection here
		Cat c = new Cat();
		home.pet = c;
		
		
		
	}

}
