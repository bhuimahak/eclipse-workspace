package toughArrayProblems;

//How to find the smallest positive integer value that cannot be represented as sum of any subset of a given array? 

public class ArrayProblem {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7 };
		//find(arr);
		System.out.println(finaSmallest(arr));
	}

	public static int finaSmallest(int[] arr) {
		int smallNum = 1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] <= smallNum){
				smallNum = smallNum+ arr[i];
			}
			else{
				break;
			}
		}
		return smallNum;
	}

	private static int find(int[] arr) {
		int sum = 0;
		int diff = arr[1] - arr[0];
		if (diff != 1) {
			sum = arr[0] + 1;
		} else {
			sum = arr[1] + 1;// sum = arr[1]
		}
		return sum;
	}
}
