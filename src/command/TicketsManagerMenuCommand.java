package command;

import models.TouristsManager;
import service.*;

public class TicketsManagerMenuCommand extends Menu {

	public TicketsManagerMenuCommand(TicketServices ticketServices, TouristsManager touristsManager) {
        super(ticketServices, touristsManager);
	}

	@Override
	protected void init() {
		commandMap.put(1, new AddTicket(ticketServices));
		commandMap.put(2, new ShowTickets(ticketServices));
	}

	@Override
	public String getDesc() {
		return "Open Tickets Manager Menu";
	}
}
