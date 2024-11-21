package command;

import models.TouristsManager;
import service.TicketServices;
import utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class Menu implements Command{
    protected TicketServices ticketServices;
    protected TouristsManager touristsManager;

    protected Map<Integer, Command> commandMap = new HashMap<>();

    public Menu(TicketServices ticketServices, TouristsManager touristsManager) {
        this.ticketServices = ticketServices;
        this.touristsManager = touristsManager;
        init();
    }

    protected void init(){
        commandMap.put(1, new TicketsManagerMenuCommand(ticketServices, touristsManager));
        commandMap.put(2, new TouristsManagerMenuCommand(touristsManager));
    }

    @Override
    public void execute() {
        while (true) {
            dMenu();
            int choice = Utils.enterIntValue("Select an option: ", 0, commandMap.size());
            if (choice == 0) {
                System.out.println("Exiting...");
                return;
            }
            commandMap.get(choice).execute();
        }
    }

    @Override
    public String getDesc() {
        return "Main menu";
    }

    protected void dMenu(){
        System.out.println("MENU :");
        for (var elem : commandMap.entrySet()){
            System.out.println(elem.getKey() + ". " + elem.getValue().getDesc());
        }
        System.out.println("0. Exit");
    }


}
