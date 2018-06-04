package Objects;

public class CargoShip extends Ship {
	double cargoValue;
	double cargoVolume; 
	double cargoWeight;
	
	public CargoShip(String name, int index, int parent,
			double weight,double length, double width,double draft,
			double cargoVal, double cargoVol, double cargoWeight) {
		super(name, index, parent, weight, length, width, draft);
		this.cargoValue= cargoVal;
		this.cargoVolume=cargoVol;
		this.cargoWeight= cargoWeight;
	}

	public String toString(){
		return "Cargo Ship: "+this.name+" "+this.index+"\n";
	}
}
