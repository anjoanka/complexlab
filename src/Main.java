import commands.*;
import models.*;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		TicketsManager ticketsManager = new TicketsManager();
		TouristsManager touristsManager = new TouristsManager();

		TravelAgency travelAgency = new TravelAgency(List.of(
				new TicketsManagerMenuCommand(ticketsManager),
				new TouristsManagerMenuCommand(touristsManager),
				new ExitCommand()
		));

		travelAgency.menu();
	}
}
