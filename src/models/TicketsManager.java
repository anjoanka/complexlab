package models;

import utils.Utils;
import java.util.ArrayList;
import java.util.List;

public class TicketsManager {
    private List<Ticket> tickets;

    public TicketsManager() {
        tickets = new ArrayList<>();
    }

    public void menu() {
        while (true) {
            System.out.println("--- Tickets Manager ---");
            System.out.println("1. Add Ticket");
            System.out.println("2. Show Tickets");
            System.out.println("0. Back");
            int choice = Utils.enterIntValue("Select an option: ", 0, 2);

            switch (choice) {
                case 1 -> addTicket();
                case 2 -> showTickets();
                case 0 -> { return; }
            }
        }
    }

    private void addTicket() {
        String destination = Utils.enterStringValue("Enter destination: ");
        double price = Utils.enterDoubleValue("Enter price: ");
        tickets.add(new Ticket(destination, price));
        System.out.println("Ticket added successfully!");
    }

    private void showTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
        } else {
            tickets.forEach(System.out::println);
        }
    }
}
