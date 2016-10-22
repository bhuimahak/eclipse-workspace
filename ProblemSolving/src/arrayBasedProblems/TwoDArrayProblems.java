package arrayBasedProblems;

public class TwoDArrayProblems {
	// given a 2D matrix , get the value , given row and column number

	public static void main(String[] args) {
		int row = 1;
		int col = 2;
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		int noOfRows = arr.length;

		for (int i = 0; i < noOfRows; i++) {
			if (row == i) {
				int noOfCols = arr[0].length;
				for (int j = 0; j < noOfCols; j++) {
					if (col == j) {
						int val = arr[i][j];
						System.out.println("number is " + val);

					}

				}
			}

		}

	}

}
