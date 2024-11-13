package TravelAgency.TicketsManager.TicketManager;

import TravelAgency.TicketsManager.TicketManager.ServicesManager.Service;
import java.util.ArrayList;

public class Ticket {
	String name;
	int price;
	ArrayList<Service> services;

	Ticket() {}

	Ticket(String name, int price) {
		setName(name);
		setPrice(price);
	}

	public Service cloneObject() {
		return new Service(getName(), getPrice());
	}

	@Override
	public String toString() {
		return String.format("%-10s - %d", getName(), getPrice());
	}

	public void addService(ArrayList<Service> service) {

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	/* --- static methods --- */
	public static Ticket newTicket() {
		return null;
	}
}
