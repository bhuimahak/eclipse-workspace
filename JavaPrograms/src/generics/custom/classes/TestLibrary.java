package generics.custom.classes;

import java.util.ArrayList;
import java.util.List;

public class TestLibrary {

	public static void main(String[] args) {

		// List of Books
		List<Book> books = new ArrayList<Book>();
		Book a = new Book(11, "Mehak");
		Book b = new Book(12, "Vikram");
		Book c = new Book(13, "Mehak");
		books.add(a);
		books.add(b);
		books.add(c);

		// List of CDs
		List<CD> CDcollection = new ArrayList<CD>();
		CD songs = new CD("Songs");
		CD movies = new CD("Movies");
		CDcollection.add(songs);
		CDcollection.add(movies);

		// Book library using custom generic Library class
		Library<Book> bookLibrary = new Library<>(books);
		Book book = bookLibrary.issueItem();
		System.out.println(book);
		bookLibrary.returnItem(book);
		System.out.println(bookLibrary);
		System.out.println("***********************");

		// CD library using custom generic Library class
		Library<CD> CdLibrary = new Library<>(CDcollection);
		CD myCD = CdLibrary.issueItem();
		System.out.println(myCD);

	}

}
