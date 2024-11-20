package command;

import service.*;

public class TicketsManagerMenuCommand implements Command {
	private TicketServices ticketServices;

	public TicketsManagerMenuCommand(TicketServices ticketServices) {
		this.ticketServices = ticketServices;
	}

	@Override
	public void execute() {
		ticketServices.menu();
	}

	@Override
	public String getDesc() {
		return "Open Tickets Manager Menu";
	}
}
