package commands;

import models.TicketsManager;

public class TicketsManagerMenuCommand implements Command {
	private final TicketsManager ticketsManager;

	public TicketsManagerMenuCommand(TicketsManager ticketsManager) {
		this.ticketsManager = ticketsManager;
	}

	@Override
	public void execute() {
		ticketsManager.menu();
	}
}
