package TravelAgency.TicketsManager;

import Main.Main;
import TravelAgency.TicketsManager.TicketManager.*;
import java.util.ArrayList;

public class TicketsManager {
	ArrayList<TicketManager> ticketManagers;

	public void menu() {
		while (true) {
			int menu_select = 0;

			System.out.println("\n --- Tickets manager menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Print available tickets");
			System.out.println(" 2. Add new ticket");
			System.out.println(" 3. Delete ticket");

			menu_select = Main.enterIntValue("Select an item:", 0, 3);
			System.out.println(" --- Tickets manager menu --- ");

			switch (menu_select) {
				case 0:
					return;
				case 1:
					printAvailableTickets();
					break;
				case 2:
					addTicket();
					break;
				case 3:
					deleteTicket();
					break;
			}
		}
	}

	public void printAvailableTickets() {

	}

	public void addTicket() {

	}

	public void deleteTicket() {

	}

	public Ticket getTicket() {
		return null;
	}

	public void deleteCreatedTicket(Ticket ticket) {

	}
}
