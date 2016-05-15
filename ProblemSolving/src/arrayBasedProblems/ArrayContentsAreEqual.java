package arrayBasedProblems;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//TO check whether two arrays has same contents or not

public class ArrayContentsAreEqual {
	int[] arr1 = { 2, 4, 6, 8 };
	int[] arr2 = { 8, 6, 4, 2 };

	public static void main(String[] args) {
		ArrayContentsAreEqual obj = new ArrayContentsAreEqual();
		obj.hashMapLogic();
	}

	public void hashMapLogic() {
		boolean equal = true;

		if (arr1.length == arr2.length) {

			Map<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < arr1.length; i++) {
				int key = arr1[i];
				if (map.containsKey(key)) {
					int count = map.get(key);
					map.put(key, count + 1);
				} else {
					map.put(key, 1);
				}
			}
			// System.out.println(map);
			// int[] arr2 = { 8, 6, 4, 2 };
			for (int j = 0; j < arr2.length; j++) {

				if (map.containsKey(arr2[j])) {
					int value = map.get(arr2[j]);
					map.put(arr2[j], value - 1);
					// System.out.println(map);
				} else {
					// System.out.println("not equal");
					equal = false;
					break;
				}
			}

			Collection<Integer> values = map.values();

			for (int i : values) {
				if (i != 0) {
					// System.out.println("values not Zero-not equal");
					equal = false;
					break;
				}
			}

			if (equal) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("not equal");
			}

		} else {
			System.out.println("Arrays are not of equal size");
		}

	}
}
