package commands;

import models.TouristsManager;

public class TouristsManagerMenuCommand implements Command {
	private TouristsManager touristsManager;

	public TouristsManagerMenuCommand(TouristsManager touristsManager) {
		this.touristsManager = touristsManager;
	}

	@Override
	public void execute() {
		touristsManager.menu();
	}

	@Override
	public String getDesc() {
		return "Open Tourists Manager Menu";
	}
}
