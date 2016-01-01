package ProblemSolving;

public class StringReversal {

	public static void main(String[] args) {
		String s = "Hello hi";
		char[] arr = s.toCharArray();
		int j = s.length() - 1;
		
		for(int i = 0; i < j ; i++){
			char c =arr[i];
			arr[i] = arr[j];
			arr[j] = c;
			j--;
		}
		
		for(char c :arr){
			System.out.print(c);
		}

	}

}
