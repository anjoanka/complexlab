package TravelAgency.TicketsManager.TicketManager;

import TravelAgency.TicketsManager.TicketManager.ServicesManager.ServicesManager;
import java.util.ArrayList;

public class TicketManager {
	int availableCount;
	Ticket demoTicket;
	ArrayList<ServicesManager> availableServicesManager;
	ArrayList<Ticket> createdTickets;

	@Override
	public String toString() {
		String string = "\n --- Ticket --- \n";
		string += String.format("%dx  ", availableCount);
		string += demoTicket + "\n";

		for (ServicesManager servicesManager:availableServicesManager) {
			string += servicesManager + "\n";
		}

		string += " --- Ticket --- ";
		return string;
	}

	public Ticket getTicket() {
		return null;
	}

	public void deleteCreatedTicket(Ticket ticket) {

	}

	/* --- static methods --- */
	public static TicketManager newTicketManager() {
		return null;
	}
}
