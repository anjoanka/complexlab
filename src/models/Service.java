package models;

public class Service {
	private String name;
	private int price;

	public Service() {}

	public Service(String name, int price) {
		setName(name);
		setPrice(price);
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
}
