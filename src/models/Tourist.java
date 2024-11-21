package models;

import java.util.ArrayList;
import java.util.List;

public class Tourist {
	private String name;
	private List<Ticket> tickets;
	private List<Service> services;

	public Tourist(String name) {
		this.name = name;
		this.tickets = new ArrayList<>();
		this.services = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public List<Service> getServices() {
		return services;
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	public void addService(Service service) {
		services.add(service);
	}

	@Override
	public String toString() {
		return "Tourist: " + name +
				", Tickets: " + tickets +
				", Services: " + services;
	}
}
