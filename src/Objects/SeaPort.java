package Objects;
import java.util.ArrayList;
import java.util.HashMap;

public class SeaPort extends Thing {
	public SeaPort(String name, int index, int parent) {
		super(name, index, parent);
	}
	ArrayList<Ship> que;
	HashMap<Integer, Dock> docks;
	HashMap<Integer, Ship> ships;
	HashMap<Integer, Person> people;
	
	public void addDock(Dock dock){
		docks.put(dock.index, dock);
	}
	public void addShip(Ship ship){
		ships.put(ship.index,ship);
	}
	public void addPerson(Person person){
		people.put(person.index, person);
	}
	
	public Dock getDock(int index){
		return docks.get(index);
	}
}
