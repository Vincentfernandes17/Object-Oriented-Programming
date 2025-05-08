package exercise;

import java.text.NumberFormat;
import java.util.*;

public class Cinema {
	private String name;
	private String location;
	List<Employee> employees = new ArrayList<Employee>();
	List<Hall> halls = new ArrayList<Hall>();
	
	public Cinema(String name, String location) {
		this.location = location;
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}


	public void addHall(Hall hall) {
		halls.add(hall);		
	}


	public void displayCinemaInfo() {
//		Cinema: Grand Theater
//		Location: Downtown
//
//		Employees:
//		- Name: Alice, Role: Manager
//		- Name: Bob, Role: Cashier
//
//		Halls:
//		Hall 1 (Capacity: 100)
//		  Showtimes:
//		    - Movie: Avengers: Endgame
//		      Time: 18:00, Date: 2025-03-15
//		      Tickets:
//		        * Ticket ID: 101, Price: $10.0, Customer: John Doe, Payment Status: Paid
//
//		Hall 2 (Capacity: 80)
//		  Showtimes:
//		    - Movie: Inception
//		      Time: 20:00, Date: 2025-03-15
//		      Tickets: No tickets booked yet.
//
//		Customers:
//		- Name: John Doe, Age: 25
//		  Tickets:
//		    * Ticket ID: 101, Movie: Avengers: Endgame, Showtime: 18:00, Date: 2025-03-15, Price: $10.0, Status: Paid
		System.out.printf("Cinema: %s\n", this.name);
		System.out.printf("Location: %s\n", this.location);
		System.out.println();
		System.out.println("Employees:");
		for (Employee employee : employees) {
			System.out.printf("- Name: %s, Role: %s\n", employee.getName(), employee.getRole());
		}
		System.out.println();
		System.out.println("Halls:");
		for (Hall hall: halls) {
			List<Showtime> showtimes = hall.getShowtimes();
			System.out.printf("Hall %d (Capacity: %d)\n", hall.getHallNumber(), hall.getCapacity());
			System.out.printf("  Showtimes:\n");
			for (Showtime showtime : showtimes) {
				System.out.printf("    - Movie: %s\n", showtime.getMovie().getTitle());
				System.out.printf("      Time: %s, Date: %s\n", showtime.getTime(), showtime.getDate());
				System.out.printf("      Tickets:");
				List<Ticket> tickets = showtime.getTickets();
				if(tickets.isEmpty()) {
					System.out.println(" No tickets booked yet.");
				}else {
					System.out.println();
					for (Ticket ticket : tickets) {
						System.out.printf("        * Ticket ID: %d,", ticket.getId());
						System.out.printf(" Price: '$'%.2f,", ticket.getPrice());
						System.out.printf(" Customer: %s,", ticket.getCustomer().getName());
						System.out.printf(" Payment Status: %s\n", (ticket.isPaymentStatus())?"Paid":"Not Paid");
					}
				}
				System.out.println();
			}		
		}
		
		HashSet<Customer> customers = new HashSet<>();
		
		System.out.println("Customers");
		for(Hall hall :halls) {
			for(Showtime showtime : hall.getShowtimes()) {
				for(Ticket ticket : showtime.getTickets()) {
					customers.add(ticket.getCustomer());
				}
			}
		}
		
		for(Customer customer : customers) {
			System.out.println("- Name: " + customer.getName() + ", Age: " + customer.getAge());
			System.out.println("  Tickets:");
			for(Hall hall :halls) {
				for(Showtime showtime : hall.getShowtimes()) {
					for(Ticket ticket: customer.getTickets()) {
						if(showtime.getTickets().contains(ticket)) {
							System.out.println("   * Ticket ID: " + ticket.getId() + ", Movie: " +  showtime.getMovie().getTitle() + ", Showtime: " + showtime.getTime());
						}
					}
				}
			}
		}
	}

}
