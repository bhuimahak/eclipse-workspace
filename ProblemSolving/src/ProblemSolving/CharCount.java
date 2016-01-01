package probelmSolving;

import java.util.HashMap;
import java.util.Set;

public class CharCount {
//How To Count Occurrences Of Each Character In String In Java?
	
	
	public static void main(String[] args) {
		String s = "JavaJ2EE";
		HashMap<Character, Integer> map = new HashMap<>();
		char[] arr = s.toCharArray();
		
		for(int i = 0; i<arr.length; i++){
			char c = arr[i];
			if(map.containsKey(c)){
				map.put(c, (map.get(c)) +1);
			}
			else{
				map.put(c, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for(Character c :keys){
			int count = map.get(c);
			System.out.println(c +": " +count);
		}
		
		
		
		
		
		
		
		

	}

}
