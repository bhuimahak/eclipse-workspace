package generics.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BubbleSortTest {
	public static void main(String[] args) {
		// Integer[] arr = { 2, 4, 1, 5, 3 };
		// PrintUtil.printArray(arr);
		// BubbleSort.bubbleSort(arr); // calling sorting fun
		// PrintUtil.printArray(arr);
		//
		// // Generic type
		// Car[] cars = new Car[3];
		// cars[0] = new Car(2016, "Merc");
		// cars[1] = new Car(2003, "Audi");
		// cars[2] = new Car(2010, "Jaguar");
		//
		// PrintUtil.printArray(cars);
		// BubbleSort.bubbleSort(cars);
		// PrintUtil.printArray(cars);
		Book[] books = new Book[3];
		books[0] = new Book(11, "A");
		books[1] = new Book(9, "C");
		books[2] = new Book(3, "B");
		PrintUtil.printArray(books);

		Comparator<Book> c = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return (o1.getAuthor()).compareTo(o2.getAuthor()); // on the basis of Author for int substraction wil do
			}

		};
		BubbleSort.bubbleSort(books, c);
		PrintUtil.printArray(books);
	}
}
