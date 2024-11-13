package TravelAgency;

public class TravelAgencyMenuCommand implements Command{
	TravelAgency travelAgency;

	public TravelAgencyMenuCommand(TravelAgency travelAgency) {
		this.travelAgency = travelAgency;
	}

	@Override
	public void execute() {
		travelAgency.menu();
	}
}
