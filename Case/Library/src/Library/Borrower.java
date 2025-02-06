package Library;
import java.util.ArrayList;

public class Borrower {
	private String name;
	ArrayList<Book> borrowed = new ArrayList<Book>();
	
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
		
		for (int i = 0; i < borrowed.size(); i++) {
//			System.out.println("-----------------------------------");
			System.out.println("Title: " + borrowed.get(i).title);
			System.out.println("ISBN: " + borrowed.get(i).code);
			System.out.println("Author: " + borrowed.get(i).author.name);
			System.out.println("Biography: " + borrowed.get(i).author.bio);
			System.out.println("-----------------------------------");
		}
	}
	public void removeBook(Book book) {
		borrowed.remove(book);
	}
	
}
