package command;

import models.TouristsManager;

public class ShowTourists implements Command{
    private TouristsManager touristsManager;

    public ShowTourists(TouristsManager ticketManager){
        this.touristsManager = ticketManager;
    }

    @Override
    public void execute() {
        touristsManager.showTourists();
    }

    @Override
    public String getDesc() {
        return "Show tourists";
    }
}
