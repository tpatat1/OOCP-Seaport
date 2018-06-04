package utils;

import java.util.ArrayList;
import Objects.*;
public class ContentParser{
	
	public Dock makeDock(String[] input){
		String dockName = input[1];
		int dockIndex = Integer.parseInt(input[2]);
		int dockPort= Integer.parseInt(input[3]);
		int shipRef = Integer.parseInt(input[4]);
		return new Dock(dockName, dockIndex, dockPort, shipRef);
	}
	
	public SeaPort makePort(String[] input) {
		String portName = input[1];
		int portIndex = Integer.parseInt(input[2]);
		int parent= Integer.parseInt(input[3]);
		return new SeaPort(portName, portIndex, parent);
	}
	
	public Ship makeShip(String[] input){
		String shipName = input[1];
		int shipIndex = Integer.parseInt(input[2]);
		int parentPortDock= Integer.parseInt(input[3]);
		double weight = Double.parseDouble(input[4]);
		double length = Double.parseDouble(input[5]);
		double width = Double.parseDouble(input[6]);
		double draft = Double.parseDouble(input[7]);
		return new Ship(shipName, 
				shipIndex, 
				parentPortDock,
				weight, 
				length,
				width, 
				draft);
	}
	public CargoShip makeCargoShip(String[] input){
		String shipName = input[1];
		int shipIndex = Integer.parseInt(input[2]);
		int parentPortDock= Integer.parseInt(input[3]);
		double weight = Double.parseDouble(input[4]);
		double length = Double.parseDouble(input[5]);
		double width = Double.parseDouble(input[6]);
		double draft = Double.parseDouble(input[7]);
		double cargoWeight = Double.parseDouble(input[8]);
		double cargoVol = Double.parseDouble(input[9]);
		double cargoVal = Double.parseDouble(input[10]);
		return new CargoShip(shipName, 
				shipIndex, 
				parentPortDock,
				weight, 
				length,
				width, 
				draft, 
				cargoWeight,
				cargoVol, 
				cargoVal);
	}
	public PassengerShip makePassengerShip(String[] input ){
		String shipName = input[1];
		int shipIndex = Integer.parseInt(input[2]);
		int parentPortDock= Integer.parseInt(input[3]);
		double weight = Double.parseDouble(input[4]);
		double length = Double.parseDouble(input[5]);
		double width = Double.parseDouble(input[6]);
		double draft = Double.parseDouble(input[7]);
		int numPassengers = Integer.parseInt(input[8]);
		int numRooms= Integer.parseInt(input[9]);
		int numOcc = Integer.parseInt(input[10]);
	
		return new PassengerShip(shipName, 
				shipIndex, 
				parentPortDock,
				weight, 
				length,
				width, 
				draft, 
				numPassengers,
				numRooms, 
				numOcc);
	}
	
	public Person makePerson(String[] input){
		String personName = input[1];
		int personIndex = Integer.parseInt(input[2]);
		int parent= Integer.parseInt(input[3]);
		String skill  = input[4];

		return new Person(
				personName, 
				personIndex, 
				parent, 
				skill);
	}
	public Job makeJob(String[] input){
		String jobName = input[1];
		int jobIndex = Integer.parseInt(input[2]);
		int parent= Integer.parseInt(input[3]);
		double duration  = Double.parseDouble(input[4]);
		ArrayList<String> skills = new ArrayList<String>();
		for(int i=1; i<=input.length-5; i++){
			skills.add(input[i+4]);
		}

		return new Job(
				jobName, 
				jobIndex, 
				parent,
				duration,
				skills);
	}
	public String[] parseFileLine(String line){
		if(line.startsWith("//")){
			return null;
		} else {
			return line.split(" ");
		}
	}
		
}
