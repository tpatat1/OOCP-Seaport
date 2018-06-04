package Objects;
import java.util.ArrayList;

public class Job extends Thing {
	double duration;
	ArrayList<String> requirements;
	public Job(String name, int index, int parent, 
			double duration, ArrayList<String> requirements) {
		super(name, index, parent);
		this.duration= duration; 
		this.requirements= requirements;
	}
}
