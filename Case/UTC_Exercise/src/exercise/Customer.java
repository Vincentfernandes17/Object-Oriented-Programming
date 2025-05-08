package exercise;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private String name;
	private int age;
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void addTicket(Ticket ticket) {
		ticket.setPaymentStatus(true);
		tickets.add(ticket);
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
	
}
