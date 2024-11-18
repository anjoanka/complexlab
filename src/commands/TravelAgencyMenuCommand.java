package commands;

import models.TravelAgency;

public class TravelAgencyMenuCommand implements Command {
	private final TravelAgency travelAgency;

	public TravelAgencyMenuCommand(TravelAgency travelAgency) {
		this.travelAgency = travelAgency;
	}

	@Override
	public void execute() {
		travelAgency.menu();
	}
}
