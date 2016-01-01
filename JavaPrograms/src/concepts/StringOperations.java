package concepts;

public class StringOperations {

	public static void main(String[] args) {
		String a = "I live in lIndia";
		String b = "I live in the US";
		int index = a.indexOf('z');
		System.out.println(index);

		// to checl second occurence of l

		System.out.println(a.indexOf('l', 4));

		System.out.println(a.substring(2));

		// to convert int to String
		int e = 2;
		Integer ex = new Integer(e);
		String tostring = ex.toString();
		System.out.println("********");
		System.out.println(tostring);

		String es = "" + e;

		String s = String.valueOf(1);
		System.out.println(s);

		// converting primitive to Object..Wrapping and unwrapping
		boolean bo = true;

		Boolean boo = Boolean.valueOf(bo);
		boolean bool = boo.booleanValue();
		Boolean t = bool;
		System.out.println(boo);

		// wrapping an integer
		Integer r = new Integer(e);
		r++;
		int f = r;
		System.out.println(r + "######");
		System.out.println(f);
		System.out.println(r instanceof Integer);

		// unwrapping
		int d = r.intValue();

	}

}
