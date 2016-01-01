package concepts;
public class Autoboxing {
	Integer i = 5;
	int j;

	public static void main(String[] args) {
		Autoboxing  a= new Autoboxing();
		a.go();
		//go();
	}
	
	public void go(){
		System.out.println(i);
		System.out.println(j);
		System.out.println("********************");
		j = i;
		System.out.println(j);
		System.out.println(i);
	}
}
