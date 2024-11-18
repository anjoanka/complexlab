package commands;

import models.TouristsManager;

public class TouristsManagerMenuCommand implements Command {
	private final TouristsManager touristsManager;

	public TouristsManagerMenuCommand(TouristsManager touristsManager) {
		this.touristsManager = touristsManager;
	}

	@Override
	public void execute() {
		touristsManager.menu();
	}
}
