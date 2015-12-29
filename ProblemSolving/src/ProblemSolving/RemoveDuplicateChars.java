package ProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateChars {

	public static void main(String[] args) {
		String s = "aabbccdd"; // output required: abcd 

		List<Character> l = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!(l.contains(c))) {
				l.add(c);
			}
		}
		
		for(char k : l){
			System.out.print(k);
		}

	}

}
