package generics.method;
//generic method and comparable interface Example

public class CuboidCompareTester {

	public static void main(String[] args) {
		Cuboid c1 = new Cuboid(10, 5, 2);
		Cuboid c2 = new Cuboid(5, 5, 3);
		Cuboid c3 = new Cuboid(5, 5, 5);
//		System.out.println(c1.getVolume());
//		System.out.println(c2.getVolume());
//		System.out.println(c3.getVolume());
//		System.out.println("********************");
		
		Cuboid c = maximum(c1, c2, c3);
		System.out.println(c);
		
		System.out.println("********************");
		
		Integer i = maximum(10, 4, 11);
		System.out.println(i);
	}
	//generic method example
	private static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x; //int max = c;
		if(y.compareTo(x)>0){
			max = y;
		}
		else if(z.compareTo(x)>0){
			max = z;
		}
		return max;
		
		
	}

}
