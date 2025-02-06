package Library;

import java.util.ArrayList;

public class Library {
	ArrayList<Book> library = new ArrayList<Book>();
	
	
	public void addBook(Book book) {
		library.add(book);
		System.out.println("Book added to library: " + book.title);
	}
	
	public void borrowBook(Borrower borrower, Book book) {
		System.out.println(borrower.getName() + " borrowed: " + book.title);
		borrower.addBorrowedBooks(book);
		removeBook(book);
	}
	
	public void removeBook(Book book) {
		library.remove(book);
	}
	public void returnBook(Borrower borrower, Book book) {
		System.out.println(borrower.getName() + " returned: "+ book.title);
		library.add(book);
		borrower.removeBook(book);
	}
	public void displayLibraryBooks() {
		System.out.println("Books in library:");
		for (int i = 0; i < library.size(); i++) {
//			System.out.println("-----------------------------------");
			System.out.println("Title: " + library.get(i).title);
			System.out.println("ISBN: " + library.get(i).code);
			System.out.println("Author: " + library.get(i).author.name);
			System.out.println("Biography: " + library.get(i).author.bio);
			System.out.println("-----------------------------------");
		}
	}
}
