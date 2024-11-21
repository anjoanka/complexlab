package command;

import models.TouristsManager;

public class ServicesManagerMenuCommand extends Menu {

    public ServicesManagerMenuCommand(TouristsManager touristsManager) {
        super(null, touristsManager);
    }

    @Override
    protected void init() {
        commandMap.put(1, new AddServiceToTourist(touristsManager));
        commandMap.put(2, new ShowServicesOfTourist(touristsManager));
    }

    @Override
    public String getDesc() {
        return "Open Services Manager Menu";
    }
}
