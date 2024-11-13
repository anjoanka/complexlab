package TravelAgency.TouristsManager;

import TravelAgency.Command;

public class TouristMenuCommand implements Command {
	Tourist tourist;

	public TouristMenuCommand(Tourist tourist) {
		this.tourist = tourist;
	}

	@Override
	public void execute() {
		tourist.menu();
	}
}
