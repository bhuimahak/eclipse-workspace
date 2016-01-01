package generics.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator {

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();
		books.add(new Book(48, "Ashu"));
		books.add(new Book(13, "Vikram"));
		books.add(new Book(155, "Mike"));
		books.add(new Book(25, "William"));
		books.add(new Book(44, "Sheldon"));
		System.out.println(books);
		Comparator<Book> comparator = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				return (o1.getPages() - o2.getPages());

			}

		};

		Collections.sort(books, comparator);
		System.out.println(books);
	}
}
