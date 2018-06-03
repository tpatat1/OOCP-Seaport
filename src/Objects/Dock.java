package Objects;

public class Dock extends Thing {
	Ship ship;
	public Dock(String name, int index, int parent, int shipRef) {
		super(name, index, parent);
	}
	
	public String toString(){
		return "Dock: "+this.name+" ID: "+this.index+" Holding Ship: "+this.ship.name;
	}
}
