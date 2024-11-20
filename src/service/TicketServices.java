package service;

import models.Ticket;
import utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class TicketServices {
    private List<Ticket> tickets;

    public TicketServices() {
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

    public List<Ticket> getTickets() {
        return tickets;
    }

    private void addTicket() {
        String destination = Utils.enterStringValue("Enter destination: ");
        double price = Utils.enterDoubleValue("Enter price: ");
        Ticket ticket = new Ticket(destination, price);
        tickets.add(ticket);
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
