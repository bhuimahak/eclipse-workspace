package generics.cube;

public class CubeTester {

	public static void main(String[] args) {
		//Circle c = new Circle();
		//Cube<Circle> ci = new Cube<>(c);
		Cube<Double> obj = new Cube<>(5.0);
		System.out.println(obj.volume());

	}

}
