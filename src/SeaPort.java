import java.util.ArrayList;

public class SeaPort extends Thing {
	public SeaPort(String name, int index, int parent) {
		super(name, index, parent);
		// TODO Auto-generated constructor stub
	}
	ArrayList<Dock> docks;
	ArrayList<Ship> que;
	ArrayList<Ship> ships;
	ArrayList<Person> people;
}
