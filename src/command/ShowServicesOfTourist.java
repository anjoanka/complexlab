package command;

import models.TouristsManager;

public class ShowServicesOfTourist implements Command {
    private TouristsManager touristsManager;

    public ShowServicesOfTourist(TouristsManager touristsManager) {
        this.touristsManager = touristsManager;
    }

    @Override
    public void execute() {
        touristsManager.showServicesOfTourist();
    }

    @Override
    public String getDesc() {
        return "Show services of a tourist";
    }
}
