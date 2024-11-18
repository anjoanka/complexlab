package models;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
	private String destination;
	private double price;
	private List<Service> services;

	public Ticket(String destination, double price) {
		this.destination = destination;
		this.price = price;
		this.services = new ArrayList<>();
	}

	public void addService(Service service) {
		services.add(service);
	}

	public String getDestination() {
		return destination;
	}

	public double getPrice() {
		return price;
	}

	public List<Service> getServices() {
		return services;
	}

	@Override
	public String toString() {
		return "Ticket to " + destination + " - " + price + " USD, Services: " + services;
	}
}
