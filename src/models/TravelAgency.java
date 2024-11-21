import models.TouristsManager;
import service.TicketServices;

public class TravelAgency {
	public static void main(String[] args) {
		TicketServices ticketServices = new TicketServices();
		TouristsManager touristsManager = new TouristsManager(ticketServices);
	}
}