package models;

import java.util.ArrayList;

public class TicketManager {
	private int availableCount;
	private Ticket demoTicket;
	private ArrayList<ServicesManager> availableServicesManager;
	private ArrayList<Ticket> createdTickets;

	@Override
	public String toString() {
		String string = "\n --- Ticket --- \n";
		string += String.format("%dx  ", availableCount);
		string += demoTicket + "\n";

		for (ServicesManager servicesManager : availableServicesManager) {
			string += servicesManager + "\n";
		}

		string += " --- Ticket --- ";
		return string;
	}
}
