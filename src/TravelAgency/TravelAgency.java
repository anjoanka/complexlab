package TravelAgency;

import Main.Main;
import TravelAgency.TicketsManager.*;
import TravelAgency.TouristsManager.*;

public class TravelAgency {
	TicketsManager ticketsManager;
	TouristsManager touristsManager;

	public TravelAgency() {
		ticketsManager = new TicketsManager();
		touristsManager = new TouristsManager();
	}

	public void menu() {
		while (true) {
			int menu_select = 0;

			System.out.println("\n --- Travel agency menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Tickets manager menu");
			System.out.println(" 2. Tourists manager menu");

			menu_select = Main.enterIntValue("Select an item:", 0, 2);
			System.out.println(" --- Travel agency menu --- ");

			switch (menu_select) {
				case 0:
					return;
				case 1:
					ticketsManagerMenu(ticketsManager).execute();
					break;
				case 2:
					touristsManagerMenu(touristsManager).execute();
					break;
			}
		}
	}

	public Command ticketsManagerMenu(TicketsManager ticketsManager) {
		TicketsManagerMenuCommand ticketsManagerMenuCommand = new TicketsManagerMenuCommand(ticketsManager);

		return ticketsManagerMenuCommand;
	}

	public Command touristsManagerMenu(TouristsManager touristsManager) {
		TouristsManagerMenuCommand touristsManagerMenuCommand = new TouristsManagerMenuCommand(touristsManager);

		return touristsManagerMenuCommand;
	}
}
