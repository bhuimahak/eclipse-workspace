package arrayBasedProblems;

import java.util.HashMap;
import java.util.Map;

//There is an array with every element repeated twice except one. Find that element? 

public class FindSingleElement {

	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 3, 4, 5, 2, 5, 1 };
		System.out.println(usingXorOperation(arr));
		// System.out.println(usingMap(arr));
	}

	public static Integer usingMap(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		for (int j = 0; j < arr.length; j++) {
			if (map.get(arr[j]) == 1) {
				return arr[j];
			}
		}
		return null;
	}

	public static int usingXorOperation(int[] arr) {
		int xor = 0;
		for (int i = 0; i < arr.length; i++) {
			xor = xor ^ arr[i];
		}
		return xor;
	}
}
