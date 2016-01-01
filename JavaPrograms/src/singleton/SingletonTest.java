package singleton;

public class SingletonTest {

	public static void main(String[] args) {
		SingletonEx single = SingletonEx.getInstance();
		System.out.println(single);
		SingletonEx two = SingletonEx.getInstance();
		System.out.println(two);

	}

}
