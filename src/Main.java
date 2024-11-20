import models.TouristsManager;
import service.TicketServices;
import utils.Utils;

public class Main {
	public static void main(String[] args) {
		TicketServices ticketServices = new TicketServices();
		TouristsManager touristsManager = new TouristsManager(ticketServices);

		while (true) {
			System.out.println("--- Main Menu ---");
			System.out.println("1. Manage Tickets");
			System.out.println("2. Manage Tourists");
			System.out.println("0. Exit");
			int choice = Utils.enterIntValue("Select an option: ", 0, 2);

			switch (choice) {
				case 1 -> ticketServices.menu();
				case 2 -> touristsManager.menu();
				case 0 -> {
					System.out.println("Exiting...");
					return;
				}
			}
		}
	}
}
