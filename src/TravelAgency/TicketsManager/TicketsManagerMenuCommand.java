package TravelAgency.TicketsManager;

import TravelAgency.Command;

public class TicketsManagerMenuCommand implements Command {
	TicketsManager ticketsManager;

	public TicketsManagerMenuCommand(TicketsManager ticketsManager) {
		this.ticketsManager = ticketsManager;
	}

	@Override
	public void execute() {
		ticketsManager.menu();
	}
}
