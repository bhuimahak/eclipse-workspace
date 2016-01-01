package generics.custom.classes;

public class MaximumTest {
	// determines the largest of three Comparable objects

	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(z) > 0) {
			max = y;
		}
		if (z.compareTo(x) > 0) {
			max = z;
		}
		return max;
	}
	

	public static void main(String[] args) {
		Integer i = new Integer(2);
		int max = maximum(i,3,4);
		System.out.printf("Maximum of %d,%d,%d is %d\n\n",2,3,4, max);
		
		float f = maximum(1.2f,2.2f,3.3f);
		System.out.println("Max of 1.2f,2.2f,3.3f is"+ f);

	}

}
