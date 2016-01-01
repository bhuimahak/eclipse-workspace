package probelmSolving;

public class ArrayProblem1 {

	public static void main(String[] args) {
		// to arrange a array in which all 0s are on left and all 1s are on the
		// right

		int[] a = { 0, 0, 1, 0, 1, 0, 0, 1 };

		int i = 0;
		int j = a.length - 1;
		System.out.println(j);

		while (i < j) {
			System.out.println("in while");
			if ((a[i] != 0) && (a[j] != 1)) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}

			if (a[i] == 0) {
				i++;
			}
			if (a[j] == 1) {
				j--;
			}

		}
		for (int k : a) {
			System.out.print(k + " ");
		}
	}

}
