package TravelAgency.TouristsManager;

import Main.Main;
import TravelAgency.TicketsManager.TicketManager.Ticket;
import java.util.ArrayList;

public class TouristsManager {
	ArrayList<Tourist> tourists;

	public void menu() {
		while (true) {
			int menu_select = 0;

			System.out.println("\n --- Tourists manager menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Print tourists");
			System.out.println(" 2. Tourists menu");
			System.out.println(" 3. Add new tourist");
			System.out.println(" 4. Delete tourist");

			menu_select = Main.enterIntValue("Select an item:", 0, 4);
			System.out.println(" --- Tourists manager menu --- ");

			switch (menu_select) {
				case 0:
					return;
				case 1:
					printTourists();
					break;
				case 2:
					touristsMenu();
					break;
				case 3:
					addTourist();
					break;
				case 4:
					deleteTourist();
					break;
			}
		}
	}

	public void printTourists() {

	}

	public void touristsMenu() {

	}

	public void addTourist() {

	}

	public void deleteTourist() {

	}

	public Ticket getTourist() {
		return null;
	}
}
