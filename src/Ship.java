import java.util.ArrayList;

public class Ship extends Thing {
	PortTime arrivalTime, dockTime;
	double draft, length, weight, width;
	ArrayList<Job> jobs;
	
	public Ship(String name, int index, int parent) {
		super(name, index, parent);
		// TODO Auto-generated constructor stub
	}
}
