package command;

import service.TicketServices;

public class ShowTickets implements Command{
    private TicketServices ticketServices;

    public ShowTickets(TicketServices ticketServices){
        this.ticketServices = ticketServices;
    }

    @Override
    public void execute() {
        ticketServices.showTickets();
    }

    @Override
    public String getDesc() {
        return "Show Tickets";
    }
}
