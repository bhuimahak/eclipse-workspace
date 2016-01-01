package generics.sorting;

public class Book {

	private int pages;
	private String author;

	public Book(int pages, String author) {
		this.author = author;
		this.pages = pages;

	}
	
	public int getPages(){
		return pages;
	}
	
	public String getAuthor(){
		return author;
	}

	@Override
	public String toString() {
		return "Book [pages=" + pages + ", author=" + author + "]";
	}
	

}
