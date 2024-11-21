package command;

import service.TicketServices;

public class AddTicket implements Command{
    private TicketServices ticketServices;

    public AddTicket(TicketServices ticketServices){
        this.ticketServices = ticketServices;
    }

    @Override
    public void execute() {
        ticketServices.addTicket();
    }

    @Override
    public String getDesc() {
        return "Add tickets";
    }
}
