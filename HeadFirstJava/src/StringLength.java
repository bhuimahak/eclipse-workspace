public class StringLength {

	public static void main(String[] args) {
		String s = "Vikram";

		int count = 0;
		int i = 0;
		try {
			while (s.charAt(i) != '\0') {
				count++;
				i++;
			}
		} catch (StringIndexOutOfBoundsException ex) {

		}

		System.out.println("count is: " + count);
	}
}
