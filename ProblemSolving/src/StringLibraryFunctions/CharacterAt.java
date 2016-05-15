package StringLibraryFunctions;

public class CharacterAt {

	public static void main(String[] args) {
		String s = "Mango";
		int i = 1;
		try {
			char c = characterAt(s, i);
			System.out.println("Charcter at " + i + " position is: " + c);
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}
	}

	public static char characterAt(String s, int index) throws Exception {
		if (s == null) {
			throw new Exception("Pass valid String");
		}
		if (index < 0 || index >= s.length()) {
			throw new Exception("index out of bound");
		}
		char[] arr = s.toCharArray();
		return arr[index];
	}
}
