package StringLibraryFunctions;

public class IndexOf {

	public static void main(String[] args) {
		String s = "Mango";
		char givenChar = 'o';
		try {
			int i = indexOf(s, givenChar);
			System.out.println("index of '"+ givenChar + "' is: "+i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static int indexOf(String s, char givenChar) throws Exception {
		if (s == null) {
			throw new Exception("Pass a valid arg");
		}
		int value = -1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == givenChar) {
				value = i;
				break;
			}
		}
		return value;
	}
}
