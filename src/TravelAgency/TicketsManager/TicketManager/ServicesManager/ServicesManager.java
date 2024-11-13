package TravelAgency.TicketsManager.TicketManager.ServicesManager;

import java.util.ArrayList;

public class ServicesManager {
	String name;
	int availableCount;
	ArrayList<Service> availableServices;
	ArrayList<Service> createdServices;

	@Override
	public String toString() {
		String string = "\n --- Services <" + name + "> --- \n";

		for (Service service:availableServices) {
			string += service + "\n";
		}

		string += " --- Services <" + name + "> --- ";
		return string;
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public Service getService() {
		return null;
	}

	/* --- static methods --- */
	public static ServicesManager newServicesManager() {
		return null;
	}
}
