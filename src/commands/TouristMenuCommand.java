package commands;

import models.Tourist;

public class TouristMenuCommand implements Command {
    private final Tourist tourist;

    public TouristMenuCommand(Tourist tourist) {
        this.tourist = tourist;
    }

    @Override
    public void execute() {
        tourist.menu();
    }
}
