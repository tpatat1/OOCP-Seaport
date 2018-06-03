package Objects;

public class Thing implements Comparable<Thing> {
	
	int index;
	String name; 
	int parent;
	
	public Thing(String name, int index, int parent){
		this.name=name;
		this.index=index;
		this.parent=parent;
	}
	@Override
	public int compareTo(Thing arg0) {
		// TODO Auto-generated method stub
		if(this.index==arg0.index&&
				this.name==arg0.name&&
				this.parent==arg0.parent){
			return 1;
		} else return -1;
			
	}

}
