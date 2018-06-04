package Objects;

public class PassengerShip extends Ship {
	int numberOfOccupiedRooms;
	int numberofPassengers; 
	int numberOfRooms;

	public PassengerShip(String name, int index, int parent,
			double weight,double length, double width,double draft,
			int numPassengers, int numberRooms, int numberOcc) {
		super(name, index, parent, weight, length, width, draft);
		this.numberofPassengers= numPassengers;
		this.numberOfRooms = numberRooms;
		this.numberOfOccupiedRooms = numberOcc;
	}
	public String toString(){
		return "Passenger Ship: "+this.name+" "+this.index+"\n";
	}
}
