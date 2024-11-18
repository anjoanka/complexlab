package models;

public class Tourist {
	private String name;

	public Tourist(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tourist: " + name;
	}
}
