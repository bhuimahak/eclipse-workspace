package toughArrayProblems;

import java.util.HashMap;
import java.util.Map;

public class findFourElements {
	// find four elements in an array such as a+b = c+d

	public static void main(String[] args) {
		int[] a = { 5, 3, 2, 4, 6 };
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (map.containsKey(sum)) {
					int number = map.get(sum);
					int otherNumber = sum-number;
					System.out.println(" pairs are: "+a[i] + ","+a[j]+ "and "+number+ "," +otherNumber);

				} else {
					map.put(sum, a[i]);
				}
			}
		}

	}

}
