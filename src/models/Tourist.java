package models;

import utils.Utils;
import java.util.ArrayList;

public class Tourist {
	private String name;
	private ArrayList<Ticket> tickets;

	public void menu() {
		while (true) {
			System.out.println("\n --- Tourist menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Print info");
			System.out.println(" 2. Add ticket");
			System.out.println(" 3. Delete ticket");

			int menuSelect = Utils.enterIntValue("Select an item:", 0, 3);

			switch (menuSelect) {
				case 0 -> { return; }
				case 1 -> printInfo();
				case 2 -> addTicket();
				case 3 -> deleteTicket();
			}
		}
	}

	public void printInfo() {}
	public void addTicket() {}
	public void deleteTicket() {}
}
