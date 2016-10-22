package toughArrayProblems;

//A property of an array is that it has adjacent elements as either +1 of the current or -1 of the current,find the element in mininmun comparsions

public class AmazonQuestion {

	public static void main(String[] args) {
		int number = 5;
		int[] arr = { 3, 2, 1, 2, 3, 4, 5, 6 };
		int i = 0;
		int noOfComparisons = 0;
		while (i < arr.length) {
			noOfComparisons++;
			if(arr[i]==number){
				System.out.println(i);
				break;
			}
			else{
				int diff = number-arr[i];
				Math.abs(diff);
				i = i + diff;
			}
			
		}
		System.out.println("comparison: "+noOfComparisons);
	}

}
