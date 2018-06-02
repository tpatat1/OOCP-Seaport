
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
		return 0;
	}

}
