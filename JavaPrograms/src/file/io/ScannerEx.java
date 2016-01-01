package file.io;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n - sum of n numbers");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;

		}
		System.out.println(sum);
		scan.close();
	}

}
