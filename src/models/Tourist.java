package models;

import java.util.ArrayList;
import java.util.List;

public class Tourist {
	private String name;
	private List<Ticket> tickets;

	public Tourist(String name) {
		this.name = name;
		this.tickets = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}

	@Override
	public String toString() {
		return "Tourist: " + name + ", Tickets: " + tickets;
	}
}