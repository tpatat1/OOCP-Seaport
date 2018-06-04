package Objects;

public class Dock extends Thing {
	Ship ship;
	public Dock(String name, int index, int parent, int shipRef) {
		super(name, index, parent);
	}
	
	public void setShip(Ship ship){
		this.ship=ship;
	}
	
	public String toString(){
		String out="Dock: "+this.name+" ID: "+this.index+" Holding Ship: "+this.ship.name+"\n";
		if(this.ship!=null)
			return out+"\tShip: "+this.ship.name+"  "+this.ship.index;
		else
			return out;
	}
}
