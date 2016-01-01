package generics.custom.classes;

import java.util.Comparator;

public class BookPageComaparator implements Comparator<Book> {

	@Override
	public int compare(Book b1, Book b2) {
		return b1.pages - b2.pages;
	}

}
