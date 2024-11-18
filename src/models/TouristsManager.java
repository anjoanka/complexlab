package models;

import utils.Utils;
import java.util.ArrayList;
import java.util.List;

public class TouristsManager {
	private List<Tourist> tourists;

	public TouristsManager() {
		tourists = new ArrayList<>();
	}

	public void menu() {
		while (true) {
			System.out.println("--- Tourists Manager ---");
			System.out.println("1. Add Tourist");
			System.out.println("2. Show Tourists");
			System.out.println("0. Back");
			int choice = Utils.enterIntValue("Select an option: ", 0, 2);

			switch (choice) {
				case 1 -> addTourist();
				case 2 -> showTourists();
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
}
