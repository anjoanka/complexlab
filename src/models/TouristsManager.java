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

	public void addTourist() {
		String name = Utils.enterStringValue("Enter name: ");
		tourists.add(new Tourist(name));
		System.out.println("Tourist added successfully!");
	}

	public void showTourists() {
		if (tourists.isEmpty()) {
			System.out.println("No tourists available.");
		} else {
			tourists.forEach(System.out::println);
		}
	}

	public void touristChoosesService() {
		if (tourists.isEmpty()) {
			System.out.println("No tourists available to choose services.");
			return;
		}

		System.out.println("Select a tourist:");
		for (int i = 0; i < tourists.size(); i++) {
			System.out.println((i + 1) + ". " + tourists.get(i).getName());
		}
		int touristIndex = Utils.enterIntValue("Enter tourist number: ", 1, tourists.size()) - 1;
		Tourist selectedTourist = tourists.get(touristIndex);

		String serviceName = Utils.enterStringValue("Enter service name: ");
		double servicePrice = Utils.enterDoubleValue("Enter service price: ");
		Service service = new Service(serviceName, servicePrice);

		selectedTourist.addService(service);
		System.out.println("Service successfully added to tourist!");
	}

	public void showServicesOfTourist() {
		if (tourists.isEmpty()) {
			System.out.println("No tourists available.");
			return;
		}

		System.out.println("Select a tourist to view services:");
		for (int i = 0; i < tourists.size(); i++) {
			System.out.println((i + 1) + ". " + tourists.get(i).getName());
		}
		int touristIndex = Utils.enterIntValue("Enter tourist number: ", 1, tourists.size()) - 1;
		Tourist selectedTourist = tourists.get(touristIndex);

		if (selectedTourist.getServices().isEmpty()) {
			System.out.println("No services available for this tourist.");
		} else {
			System.out.println("Services for " + selectedTourist.getName() + ":");
			selectedTourist.getServices().forEach(System.out::println);
		}
	}

}
