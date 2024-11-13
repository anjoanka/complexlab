package TravelAgency.TicketsManager.TicketManager.ServicesManager;

public class Service {
	public String name;
	public int price;

	Service() {}

	public Service(String name, int price) {
		setName(name);
		setPrice(price);
	}

	public Service cloneObject() {
		return new Service(getName(), getPrice());
	}

	@Override
	public String toString() {
		return String.format("%-10s - %d", getName(), getPrice());
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	/* --- static methods --- */
	public static Service newService() {
		return null;
	}
}
