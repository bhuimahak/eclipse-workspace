package numberSystem;

import java.util.ArrayList;
import java.util.List;

public class FindingFactorsForANumber {

	public static void main(String[] args) {
		int number = 28;
		List<Integer> list = findFactors(number);
		for (Integer i : list) {
			System.out.print(i + "--");
		}
	}

	private static List findFactors(int number) {
		List<Integer> list = new ArrayList<>();
		int i = 2;
		while (number >= i) {
			if (number % i == 0) {
				list.add(i);
				number = number / i;
			} else {
				i++;
			}
		}
		return list;
	}
}
