package models;

import utils.Utils;
import java.util.ArrayList;

public class TouristsManager {
	private ArrayList<Tourist> tourists;

	public void menu() {
		while (true) {
			System.out.println("\n --- Tourists manager menu --- ");
			System.out.println(" 0. Exit");
			System.out.println(" 1. Print tourists");
			System.out.println(" 2. Tourists menu");
			System.out.println(" 3. Add new tourist");
			System.out.println(" 4. Delete tourist");

			int menuSelect = Utils.enterIntValue("Select an item:", 0, 4);

			switch (menuSelect) {
				case 0 -> { return; }
				case 1 -> printTourists();
				case 2 -> touristsMenu();
				case 3 -> addTourist();
				case 4 -> deleteTourist();
			}
		}
	}

	public void printTourists() {}
	public void touristsMenu() {}
	public void addTourist() {}
	public void deleteTourist() {}
}
