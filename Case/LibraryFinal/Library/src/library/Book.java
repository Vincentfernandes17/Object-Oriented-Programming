package library;

public class Book {
	private String title;
	private String code;
	Author author;
	
	public Book(String title, String code, Author author) {
		this.title = title;
		this.code = code;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void displayBook() {
		System.out.println("Title: " + this.title);
		System.out.println("ISBN: " + this.code);
		System.out.println("Author: " + author.getName());
		System.out.println("Biography: " + author.getBio());
		System.out.println("-----------------------------------");
	}
	
}
