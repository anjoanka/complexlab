package models;

import commands.Command;
import utils.Utils;

import java.util.List;

public class TravelAgency {
	private List<Command> commands;

	public TravelAgency(List<Command> commands) {
		this.commands = commands;
	}

	public void menu() {
		while (true) {
			System.out.println("--- Travel Agency Menu ---");
			for (int i = 0; i < commands.size(); i++) {
				System.out.println((i + 1) + ". " + commands.get(i).getDesc());
			}
			System.out.println("0. Exit");

			int choice = Utils.enterIntValue("Select an option: ", 0, commands.size());

			if (choice == 0) {
				System.out.println("Exiting...");
				break;
			}

			commands.get(choice - 1).execute();
		}
	}
}
