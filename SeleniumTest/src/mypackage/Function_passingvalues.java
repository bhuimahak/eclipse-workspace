package mypackage;
import java.util.Scanner;

public class Function_passingvalues {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int s = scan.nextInt();
		int randomNumber = generateRandomNumber(s);
		System.out.println(randomNumber);

	}
	
	public static int generateRandomNumber(int n){
		int random;
		random = (int) (Math.random()*n);
		return random;
	}

}
