package GenericAnimal;

import java.util.ArrayList;

public class ZooClient {

	public static void main(String[] args) {
		Zoo<Dog> dogZoo = new Zoo<>();
		Zoo<Lion> lionZoo = new Zoo<>();
		
		ArrayList<Dog> dogsList = new ArrayList<>();
		ArrayList<Lion> lionList = new ArrayList<>();
		dogZoo.doSomething(dogsList);
		dogZoo.doSomething(lionList);
		
	}

}
