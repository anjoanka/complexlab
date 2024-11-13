package TravelAgency.TouristsManager;

import TravelAgency.Command;

public class TouristsManagerMenuCommand implements Command {
	TouristsManager touristsManager;

	public TouristsManagerMenuCommand(TouristsManager touristsManager) {
		this.touristsManager = touristsManager;
	}

	@Override
	public void execute() {
		touristsManager.menu();
	}
}
