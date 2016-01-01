package generics.custom.classes;

public class Book {
	int pages;
	String author;
	
	public Book(int pages, String author){
		this.pages = pages;
		this.author = author;
	}
	
	public Book(){
		this.pages = 100;
		this.author = "Arslan";
	}

	@Override
	public String toString() {
		return "Book [pages=" + pages + ", author=" + author + "]";
	}
}
