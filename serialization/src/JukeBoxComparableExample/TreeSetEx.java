package JukeBoxComparableExample;
import java.util.Comparator;
import java.util.TreeSet;


public class TreeSetEx {
	
	public static void main (String[] args){
		new TreeSetEx().go();
		}

	private void go() {
	Book b1 = new Book("Shawn");
	Book b2 = new Book("Jay");
	Book b3 = new Book("see");
	
	TreeSet<Book> bookSet  = new TreeSet<>();
	bookSet.add(b1);
	bookSet.add(b2);
	bookSet.add(b3);
	System.out.println(bookSet);
	}
	
	
	class Book implements Comparable<Book>{
		String title;
		public Book(String t){
			this.title = t;
		}
		@Override
		public int compareTo(Book otherBook) {
			return title.compareTo(otherBook.title);
		}
		
		public String toString(){
			return "Book [title=" + title + "]";
		}
		
	}

}
