package generics.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparable {

	public static void main(String[] args) {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car(2000,"Renault"));
		cars.add(new Car(1999,"Honda"));
		cars.add(new Car(2004,"Merc"));
		cars.add(new Car(2010,"Audo"));
		
		System.out.println(cars);
		System.out.println("*******************************************");
		Collections.sort(cars);
		System.out.println(cars);
		System.out.println("*******************************************");
		
		Comparator<Car> comp = new Comparator<Car>() {
			@Override
			public int compare(Car o1, Car o2) {
				return o1.getModel().compareTo(o2.getModel());
			}
		};
		Collections.sort(cars, comp);
		System.out.println(cars);
		

	}

}
