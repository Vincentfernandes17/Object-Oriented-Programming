package library;

import java.util.*;

public class Library {
	HashSet<Book> library = new HashSet<Book>();
	
	
	public void addBook(Book book) {
		library.add(book);
		System.out.println("Book added to library: " + book.getTitle());
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
		borrower.addBorrowedBooks(book);
		removeBook(book);
	}
	
	public void removeBook(Book book) {
		library.remove(book);
	}
	public void returnBook(Borrower borrower, Book book) {
		System.out.println(borrower.getName() + " returned: "+ book.getTitle());
		library.add(book);
		borrower.removeBook(book);
	}
	public void displayLibraryBooks() {
		System.out.println("Books in library:");
		for (Book book : library) {
			book.displayBook();
		}
	}
}
