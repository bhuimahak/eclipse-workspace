package generics.custom.classes;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodTest {

	public static void main(String[] args) {
		List<? extends Number> l = getNumberList(4);
		for (Number n : l) {
			System.out.println(n);
		}
	}

	static List<? extends Number> getNumberList(Integer t) {
		if (t < 5) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(5);
			list.add(10);
			list.add(15);
			return list;
		} else {
			List<Number> list = new ArrayList<Number>();
			list.add(5.00);
			list.add(10.10);
			list.add(15.15);
			return list;
		}
	}

}
