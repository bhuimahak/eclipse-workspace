package ProblemSolving;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "  I am here";
		StringBuffer str = new StringBuffer("I am here");
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ' '){
				str.deleteCharAt(i);
			}
		}
		System.out.println(str);
		

	}

}
