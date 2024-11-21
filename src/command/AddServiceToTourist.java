package command;

import models.TouristsManager;

public class AddServiceToTourist implements Command {
    private TouristsManager touristsManager;

    public AddServiceToTourist(TouristsManager touristsManager) {
        this.touristsManager = touristsManager;
    }

    @Override
    public void execute() {
        touristsManager.touristChoosesService();
    }

    @Override
    public String getDesc() {
        return "Add service to tourist";
    }
}
