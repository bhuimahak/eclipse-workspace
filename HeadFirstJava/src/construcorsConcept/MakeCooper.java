package construcorsConcept;

public class MakeCooper {

	public static void main(String[] args){
	
		MiniCooper m = new MiniCooper("cute");
		Car c = new Car();
		System.out.println(c.getName());
		c.setName("mehak");
		System.out.println(c.getName());
		Car d = new Car("Arslan");
		System.out.println(d.getName());
	}
}
