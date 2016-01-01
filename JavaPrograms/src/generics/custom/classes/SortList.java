package generics.custom.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
		books.add(new Book(210, "A"));
		books.add(new Book(12, "C"));
		books.add(new Book(104, "E"));
		books.add(new Book(203, "D"));
		books.add(new Book(115, "B"));
		System.out.println(books);
		System.out.println("**************************");

//		books.add(<T extends Book);
//		<E super Book> = books.get(0);
		
		Comparator<Book> c = new Comparator<Book>() {
			@Override
			public int compare(Book b1, Book b2) {
				return b1.pages - b2.pages;
			}
		};
		
		Book bk = new Book() {
			String anotherName = "Mehak";
			
			public String toString() {
				return super.toString() + " Another Name: " + anotherName;
			}
		};
		
		System.out.println(bk);
		
		//BookPageComaparator bookPageComaparator = new BookPageComaparator();
		Collections.sort(books, c);
		System.out.println(books);

//		List<Integer> list = new ArrayList<>();
//		list.add(100);
//		list.add(150);
//		list.add(103);
//		list.add(50);
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
	}

}
