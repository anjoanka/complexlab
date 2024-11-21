package models;

public class Ticket {
	private String destination;
	private double price;

	public Ticket(String destination, double price) {
		this.destination = destination;
		this.price = price;
	}

	public String getDestination() {
		return destination;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Destination: " + destination + ", Price: $" + price;
	}
}