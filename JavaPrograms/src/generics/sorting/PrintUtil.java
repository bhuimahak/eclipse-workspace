package generics.sorting;

public class PrintUtil {
	public static <E> void printArray(E[] e) {
		for (E element : e) {
			System.out.print(element + "--");
		}
		System.out.println("\n**********");
	}
}
