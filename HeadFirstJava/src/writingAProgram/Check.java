package writingAProgram;
import java.util.Scanner;

public class Check {
private static Scanner scan; 
	public static void main(String[] args) {
		try{
		String inputLine = null;
		System.out.println("enter input");
		scan = new Scanner(System.in);
		inputLine = scan.nextLine();
		System.out.println(inputLine);
		int x = Integer.parseInt(inputLine);
		System.out.println("parsed integer is: " +x);
		
		}
		
		finally{
			scan.close();
		}



	}

}
