package generics.cube;

public class SampleTest {

	public static void main(String[] args) {
		Number n = getNumber();
		Class<? extends Number> cl = n.getClass();
		System.out.println(cl);

	}

	private static Number getNumber() {
		return new Integer(5);
	}

}
