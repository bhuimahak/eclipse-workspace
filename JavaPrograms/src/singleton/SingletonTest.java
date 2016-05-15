package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		System.out.println(single);
		Singleton two = Singleton.getInstance();
		System.out.println(two);

	}

}
