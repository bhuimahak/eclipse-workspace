package numberSystem;

//find if a number belong to the fibonacci series or not
public class FindFibonnaciOf {

	public static void main(String[] args) {
		int givenNumber = 4;
		int fib = findFibonnaciOf(givenNumber);
		System.out.println("Fibonnaci of " + givenNumber + "is :" + fib);
	}

	public static int findFibonnaciOf(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		int fibonnaci = findFibonnaciOf(n - 1) + findFibonnaciOf(n - 2);
		return fibonnaci;
	}
}
