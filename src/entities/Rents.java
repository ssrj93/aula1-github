package entities;

public class Rents {
	
	private String name;
	private String email;
	private int room;
	
public Rents(String name, String email, int room) {
		this.name = name;
		this.email = email;
		this.room = room;
	}

	public int getRoom() {
		return room;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return name + ", " + email;
	}
}
