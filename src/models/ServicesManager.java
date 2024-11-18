package models;

import java.util.ArrayList;

public class ServicesManager {
	private String name;
	private ArrayList<Service> availableServices;

	@Override
	public String toString() {
		String string = "\n --- Services <" + name + "> --- \n";
		for (Service service : availableServices) {
			string += service + "\n";
		}
		string += " --- Services <" + name + "> --- ";
		return string;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
