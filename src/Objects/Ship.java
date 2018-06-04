package Objects;
import java.util.ArrayList;

public class Ship extends Thing {
	PortTime arrivalTime, dockTime;
	double draft, length, weight, width;
	ArrayList<Job> jobs;
	
	public Ship(String name, int index, int parent,
			double weight,double length, double width,double draft) {
		super(name, index, parent);
		this.weight=weight;
		this.length=length;
		this.width=width;
		this.draft=draft;
	}
	
	public void addJob(Job job){
		jobs.add(job);
	}
	
}
