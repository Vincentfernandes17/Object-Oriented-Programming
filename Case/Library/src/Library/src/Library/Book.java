package Library;

public class Book {
	public String title;
	public String code;
	Author author;
	
	public Book(String title, String code, Author author) {
		this.title = title;
		this.code = code;
		this.author = author;
	}
}
