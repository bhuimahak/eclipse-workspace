package concepts;

public class Arrays {

	public static void main(String[] args) {

		int[][] arr = new int[4][3];
		System.out.println("number of rows are " + arr.length);
		System.out.println("number of columns are " + arr[0].length);

		// insertion of elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = i + j;

			}
		}
		// printing out array elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "---");

			}
			System.out.println("");
		}

		Object[][] arra = new Object[5][];
		arra[0] = new Object[3];
		arra[1] = new Object[2];

	}

}
