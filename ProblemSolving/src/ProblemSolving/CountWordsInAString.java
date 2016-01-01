package ProblemSolving;

import java.util.Scanner;

public class CountWordsInAString {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("enter sentence");
		String sentence = scan.nextLine();
		
//		String[] words = sentence.split(" ");
//		System.out.println("Total words: " +words.length);
		int count = 1;
		for(int i = 0; i<sentence.length(); i++){
			if((sentence.charAt(i) == ' ') && sentence.charAt(i+1) != ' '){
				count++;
			}
		}
		System.out.println("cout is: "+ count);
		
		
	}

}
