package Objects;
import java.util.ArrayList;
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
	
	public void addPort(SeaPort port){
		hs.put(port.index,port);
	}
	
	public SeaPort getPort(int index){
		return this.hs.get(index);
	}
}
