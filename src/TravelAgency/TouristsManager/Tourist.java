package TravelAgency.TouristsManager;

import Main.Main;
import TravelAgency.TicketsManager.TicketManager.Ticket;
import java.util.ArrayList;

public class Tourist {
	String name;
	ArrayList<Ticket> tickets;

	@Override
	public String toString() {
		return getName();
	}

	public void menu() {
		while (true) {
			int menu_select = 0;

			System.out.println("\n --- Tourist menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Print info");
			System.out.println(" 2. Add ticket");
			System.out.println(" 3. Delete ticket");

			menu_select = Main.enterIntValue("Select an item:", 0, 3);
			System.out.println(" --- Tourist menu --- ");

			switch (menu_select) {
				case 0:
					return;
				case 1:
					printInfo();
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

	public void printInfo() {

	}

	public void addTicket() {

	}

	public void deleteTicket() {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	/* --- static methods --- */
	public static Tourist newTourist() {
		return null;
	}
}
