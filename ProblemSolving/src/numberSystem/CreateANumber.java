package numberSystem;

//given an array of ints, combine and create a number out of it
public class CreateANumber {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		createNumber(arr);
		createReverseNumber(arr);
}
	private static void createNumber(int[] arr) {
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			int position = arr.length - 1 - i;
			int multiplier = (int) Math.pow(10, position);
			number = number + arr[i] * multiplier;
		}
		System.out.println("Number is: " + number);
	}


	private static void createReverseNumber(int[] arr) {
		int number = 0;
		for (int i = 0; i < arr.length; i++) {
			int multiplier = (int) Math.pow(10, i);
			number = number + arr[i] * multiplier;
		}
		System.out.println("Required number is: " + number);
	}

	
}
