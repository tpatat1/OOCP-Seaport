package Objects;
import java.util.ArrayList;

public class SeaPort extends Thing {
	public SeaPort(String name, int index, int parent) {
		super(name, index, parent);
	}
	ArrayList<Dock> docks;
	ArrayList<Ship> que;
	ArrayList<Ship> ships;
	ArrayList<Person> people;
	
	public void addDock(Dock dock){
		docks.add(dock);
	}
	public void addShip(Ship ship){
		ships.add(ship);
	}
	public void addPerson(Person person){
		people.add(person);
	}
}
