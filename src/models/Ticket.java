package models;

import java.util.ArrayList;

public class Ticket {
	private String name;
	private int price;
	private ArrayList<Service> services;

	public Ticket() {}

	public Ticket(String name, int price) {
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
