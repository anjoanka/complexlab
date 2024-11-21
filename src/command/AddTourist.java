package command;

import models.TouristsManager;

public class AddTourist implements Command{
    private TouristsManager touristsManager;

    public AddTourist(TouristsManager ticketManager){
        this.touristsManager = ticketManager;
    }

    @Override
    public void execute() {
        touristsManager.addTourist();
    }

    @Override
    public String getDesc() {
        return "Add tourists";
    }
}
