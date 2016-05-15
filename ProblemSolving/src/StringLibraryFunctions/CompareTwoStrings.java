package StringLibraryFunctions;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String a = "Mango";
		String b = "Mango";
		try {
			int result = compare(a, b);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Invalid String");
			e.printStackTrace();
		}
	}

	public static int compare(String a, String b) throws Exception {
		if (a == null || b == null) {
			throw new Exception("Please pass a valid String");
		}
		int value = 0;
		int i = 0;
		while (i < a.length() && i < b.length()) {
			if (a.charAt(i) != b.charAt(i)) {
				if (a.charAt(i) > b.charAt(i)) {
					value = 1;
					break;
				} else {
					value = -1;
					break;
				}
			}
			i++;
		}
		if (value == 0) {
			if (a.length() < b.length()) {
				value = -1;
			} else if (a.length() > b.length()) {
				value = 1;
			}
		}
		return value;
	}
}
