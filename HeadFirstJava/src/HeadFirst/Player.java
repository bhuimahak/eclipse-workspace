package HeadFirst;

public class Player {
	int number=0;
	
	int guessnumber(){
		this.number = (int)(Math.random()*10);
		System.out.println("I m guessing number: "+ number);
		return number;
	}

}
