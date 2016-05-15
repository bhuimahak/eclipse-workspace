
public class ObjectMethods {
	
	public void vvv() throws Exception{
		throw new Exception();
	}

	public static void main(String[] args) {
		Animal a = new Cat();
		Animal d = new Animal();
		Cat c = new Cat();
		Animal myCat = a;
		
		//getClass method
		System.out.println(a.getClass());
		System.out.println(d.getClass());
		System.out.println(c.getClass());
		System.out.println("-----");
		
		//equals method
		System.out.println(a.equals(c));
		System.out.println(myCat.equals(a));
		System.out.println("-----");
		
		//hashCode method
		System.out.println(a.hashCode());
		System.out.println(myCat.hashCode());
		System.out.println(c.hashCode());
		System.out.println("-----");
		
		//toString method
		System.out.println(a.toString());
		System.out.println(myCat.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
	}

}
