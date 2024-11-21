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

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void addTicket() {
        String destination = Utils.enterStringValue("Enter destination: ");
        double price = Utils.enterDoubleValue("Enter price: ");
        Ticket ticket = new Ticket(destination, price);
        tickets.add(ticket);
        System.out.println("Ticket added successfully!");
    }

    public void showTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available.");
        } else {
            tickets.forEach(System.out::println);
        }
    }
}