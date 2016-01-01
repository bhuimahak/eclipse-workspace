package generics.custom.classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(100, "A"));
		books.add(new Book(101, "B"));
		books.add(new Book(102, "C"));
		books.add(new Book(103, "D"));
		books.add(new Book(104, "E"));
		
		Iterator<Book> iter = books.iterator();
		while(iter.hasNext()) {
			Book book = iter.next();
			if(book.author == "C") {
				System.out.println(book);
				break;
			}
		}
		while(iter.hasNext()) {
			Book book = iter.next();
			System.out.println(book);
		}
		
		System.out.println("**************************");

		int i = 0;
		while(i < books.size()) {
			Book book = books.get(i);
			if(book.author == "C") {
				System.out.println(book);
				break;
			}
			i++;
		}
		
		while(i < books.size()) {
			Book book = books.get(i);
			i++;
			System.out.println(book);
		}
	}
}
