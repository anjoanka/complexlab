package models;

import utils.Utils;
import service.TicketServices;

import java.util.ArrayList;
import java.util.List;

public class TouristsManager {
	private List<Tourist> tourists;
	private TicketServices ticketServices;

	public TouristsManager(TicketServices ticketServices) {
		this.tourists = new ArrayList<>();
		this.ticketServices = ticketServices;
	}

	public void menu() {
		while (true) {
			System.out.println("--- Tourists Manager ---");
			System.out.println("1. Add Tourist");
			System.out.println("2. Show Tourists");
			System.out.println("3. Tourist Chooses Ticket");
			System.out.println("0. Back");
			int choice = Utils.enterIntValue("Select an option: ", 0, 3);

			switch (choice) {
				case 1 -> addTourist();
				case 2 -> showTourists();
				case 3 -> touristChoosesTicket();
				case 0 -> { return; }
			}
		}
	}

	private void addTourist() {
		String name = Utils.enterStringValue("Enter name: ");
		tourists.add(new Tourist(name));
		System.out.println("Tourist added successfully!");
	}

	private void showTourists() {
		if (tourists.isEmpty()) {
			System.out.println("No tourists available.");
		} else {
			tourists.forEach(System.out::println);
		}
	}

	private void touristChoosesTicket() {
		if (tourists.isEmpty()) {
			System.out.println("No tourists available to choose tickets.");
			return;
		}

		System.out.println("Select a tourist:");
		for (int i = 0; i < tourists.size(); i++) {
			System.out.println((i + 1) + ". " + tourists.get(i).getName());
		}
		int touristIndex = Utils.enterIntValue("Enter tourist number: ", 1, tourists.size()) - 1;
		Tourist selectedTourist = tourists.get(touristIndex);

		if (ticketServices.getTickets().isEmpty()) {
			System.out.println("No tickets available for selection.");
			return;
		}

		System.out.println("Available tickets:");
		List<Ticket> tickets = ticketServices.getTickets();
		for (int i = 0; i < tickets.size(); i++) {
			System.out.println((i + 1) + ". " + tickets.get(i));
		}
		int ticketIndex = Utils.enterIntValue("Enter ticket number: ", 1, tickets.size()) - 1;
		Ticket selectedTicket = tickets.get(ticketIndex);

		selectedTourist.addTicket(selectedTicket);
		System.out.println("Ticket successfully added to tourist!");
	}
}