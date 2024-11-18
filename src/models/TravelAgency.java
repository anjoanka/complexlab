package models;

import utils.Utils;

public class TravelAgency {
	private TicketsManager ticketsManager;
	private TouristsManager touristsManager;

	public TravelAgency() {
		ticketsManager = new TicketsManager();
		touristsManager = new TouristsManager();
	}

	public void menu() {
		while (true) {
			System.out.println("\n --- Travel agency menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Tickets manager menu");
			System.out.println(" 2. Tourists manager menu");

			int menuSelect = Utils.enterIntValue("Select an item:", 0, 2);

			switch (menuSelect) {
				case 0 -> { return; }
				case 1 -> ticketsManager.menu();
				case 2 -> touristsManager.menu();
			}
		}
	}
}
