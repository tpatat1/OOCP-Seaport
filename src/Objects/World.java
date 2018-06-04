package Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class World extends Thing {
	
	ArrayList<SeaPort> ports;
	HashMap<Integer, SeaPort> hs; 
	PortTime time;
	
	public World(String name, int index, int parent) {
		super(name, index, parent);
		// TODO Auto-generated constructor stub
		this.ports = new ArrayList<SeaPort>();
		this.hs= new HashMap<Integer, SeaPort>();
	}
	
	public boolean addPort(SeaPort port){
		 hs.put(port.index,port);
		 return true;
	}
	
	public Dock getDock(int index){
		Collection<SeaPort> portCollection = this.hs.values();
		Dock targetDock;
		for(SeaPort port : portCollection){
			if((targetDock=port.getDock(index))!=null){
				return targetDock;
			}
		}
		
		return null;
	}
	
	public SeaPort getPort(int index){
		return this.hs.get(index);
	}
	
	public boolean addDock(Dock dock){
		int index = dock.parent; 
		SeaPort targetPort = this.getPort(index);
		targetPort.addDock(dock);
		return true;
	}
	
	public boolean addShip(Ship ship){
		int parentIndex = ship.parent;
		SeaPort parentPort;
		Dock parentDock;
		if((parentPort = this.getPort(parentIndex))!=null){
			parentPort.addShip(ship);
		} else if((parentDock=this.getDock(parentIndex))!=null){
			parentDock.setShip(ship);
		}
		return true;
	}
	
	public boolean addPerson(Person person){
		SeaPort parentPort = this.getPort(person.parent);
		parentPort.addPerson(person);
		return true;
	}
	
	public boolean addJob(Job job){
		return true;
	}
}
