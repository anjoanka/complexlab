import command.Menu;
import models.TouristsManager;
import service.TicketServices;

public class Main {
	public static void main(String[] args) {
		TicketServices ticketServices = new TicketServices();
		TouristsManager touristsManager = new TouristsManager(ticketServices);

		Menu menu = new Menu(ticketServices, touristsManager);
		menu.execute();
	}
}