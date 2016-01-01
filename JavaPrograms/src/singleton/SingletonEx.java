package singleton;

public class SingletonEx {
	private static SingletonEx obj;

	private SingletonEx() {
	}

	public static SingletonEx getInstance() {
		if (obj == null) {
			obj = new SingletonEx();
			return obj;
		} else {
			return obj;
		}
	}

}
