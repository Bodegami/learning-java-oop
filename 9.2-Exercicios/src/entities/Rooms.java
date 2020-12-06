package entities;

public class Rooms {

	private int room;
	private double rent;
	private String name;
	private String email;
	
	
	public Rooms(int room, double rent, String name, String email) {
		super();
		this.room = room;
		this.rent = rent;
		this.name = name;
		this.email = email;
	}


	public int getRoom() {
		return room;
	}


	public void setRoom(int room) {
		this.room = room;
	}


	public double getRent() {
		return rent;
	}


	public void setRent(double rent) {
		this.rent = rent;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "Room: "
				+ room
				+ ", Name: "
				+ name
				+ ", Email: "
				+ email
				+ ", Rent: "
				+ String.format("%.2f", rent);
	}
	
	
	
	
}
