package commands;

import models.TicketsManager;

public class TicketsManagerMenuCommand implements Command {
	private TicketsManager ticketsManager;

	public TicketsManagerMenuCommand(TicketsManager ticketsManager) {
		this.ticketsManager = ticketsManager;
	}

	@Override
	public void execute() {
		ticketsManager.menu();
	}

	@Override
	public String getDesc() {
		return "Open Tickets Manager Menu";
	}
}
