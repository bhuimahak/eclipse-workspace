package ProblemSolving;

import java.util.Arrays;

public class AnagramsUsingArrays {

	public static void main(String[] args) {
		String s1 = "groovy";
		String s2 = "orvgoy";
		char[] s1arr = s1.toCharArray();
		char[] s2arr = s2.toCharArray();
		
		Arrays.sort(s1arr);
		Arrays.sort(s2arr);
		
		if(Arrays.equals(s1arr, s2arr)){
			System.out.println("They are anagrams!");
		}
		else
			System.out.println("They are not anagrams!");
		

	}

	
	
}
