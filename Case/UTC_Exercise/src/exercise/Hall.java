package exercise;

import java.util.*;

public class Hall {
	private int hallNumber;
	private int capacity;
	private List<Showtime> showtimes = new ArrayList<Showtime>();
	
	public Hall(int hallNumber, int capacity) {
		this.hallNumber = hallNumber;
		this.capacity = capacity;
	}
	
	public int getHallNumber() {
		return hallNumber;
	}
	public void setHallNumber(int hallNumber) {
		this.hallNumber = hallNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public void addShowtime(Showtime showtime) {
		showtimes.add(showtime);
	}

	public List<Showtime> getShowtimes() {
		return showtimes;
	}

	public void setShowtimes(List<Showtime> showtimes) {
		this.showtimes = showtimes;
	}

	


	
	
	
	
}
