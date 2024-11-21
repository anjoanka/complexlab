package command;

import models.TouristsManager;

public class TouristsManagerMenuCommand extends Menu {

	public TouristsManagerMenuCommand(TouristsManager touristsManager) {
		super(null, touristsManager);
	}

	@Override
	protected void init() {
		commandMap.put(1, new AddTourist(touristsManager));
		commandMap.put(2, new ShowTourists(touristsManager));
		commandMap.put(3, new ServicesManagerMenuCommand(touristsManager));
	}


	@Override
	public String getDesc() {
		return "Open Tourists Manager Menu";
	}
}
