package exercise;

public class Ticket {
	private int id;
	private double price;
	private boolean paymentStatus = false;
	private Customer customer;
	
	public Ticket(int id, double price, Customer customer) {
		this.id = id;
		this.price = price;
		this.setCustomer(customer);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
}
