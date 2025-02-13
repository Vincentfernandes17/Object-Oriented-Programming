package library;
import java.util.*;

public class Borrower {
	private String name;
	HashSet<Book> borrowed = new HashSet<Book>();
	
	public Borrower(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void addBorrowedBooks(Book book) {
		borrowed.add(book);
	}
	public void displayBorrowedBooks() {
		System.out.println(this.name + "'s Borrowed book:");
		
		for (Book book : borrowed) {
			book.displayBook();
		}
	}
	public void removeBook(Book book) {
		borrowed.remove(book);
	}
	
}
