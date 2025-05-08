package exercise;

import java.util.*;

public class Showtime {
	private String time;
	private String date;
	private Movie movie;
	private List<Ticket> tickets = new ArrayList<Ticket>();
	
	public Showtime(String time, String date, Movie movie) {
		this.time = time;
		this.date = date;
		this.setMovie(movie);
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
		
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	
}
