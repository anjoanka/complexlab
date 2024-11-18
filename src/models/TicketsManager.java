package models;

import utils.Utils;
import java.util.ArrayList;

public class TicketsManager {
	private ArrayList<TicketManager> ticketManagers;

	public void menu() {
		while (true) {
			System.out.println("\n --- Tickets manager menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Print available tickets");
			System.out.println(" 2. Add new ticket");
			System.out.println(" 3. Delete ticket");

			int menuSelect = Utils.enterIntValue("Select an item:", 0, 3);

			switch (menuSelect) {
				case 0 -> { return; }
				case 1 -> printAvailableTickets();
				case 2 -> addTicket();
				case 3 -> deleteTicket();
			}
		}
	}

	public void printAvailableTickets() {}

	public void addTicket() {}

	public void deleteTicket() {}
}
