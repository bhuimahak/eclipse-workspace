package arrayBasedProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Write an algorithm to find out a number from an array of numbers where 
//only one number occurs once and rest all occurs twice.
//Note: Without using extra O(n) space and in O(n).

public class FindNumberPresentOnlyOnce {
	int[] arr = { 1, 1, 2, 3, 3, 4, 5, 4, 5 };
	int length = arr.length;

	public static void main(String[] args) {
		FindNumberPresentOnlyOnce obj = new FindNumberPresentOnlyOnce();
		obj.UsingHashMap();
		obj.usingSortingArray();
	}

	// logic one
	public void UsingHashMap() {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < length; i++) {
			int key = arr[i];
			if (map.containsKey(key)) {
				int count = map.get(key);
				map.put(key, count + 1);
			} else {
				map.put(key, 1);
			}
		}
		Set<Integer> keys = map.keySet();
		for (int key : keys) {
			if (map.get(key) == 1) {
				System.out.println("Number is: " + key);
			}
		}
	}

	// logic 2
	// using sorting of array
	public void usingSortingArray() {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i = 0;
		int j = i + 1;

		while (i < length - 1) {

			if (arr[i] == arr[j]) {
				i = i + 2;
				j = i + 1;

			} else if (arr[i] != arr[j]) {
				System.out.println("Required no: " + arr[i]);
				break;
			}
		}
	}

}
