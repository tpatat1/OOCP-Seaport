import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JFrame;

public class SeaPortProgram extends JFrame {
	public String iconFileLoc;
	
	public static Thing parseFileLine(String line){
		if(line.startsWith("//")){
			return null;
		} else if(line.startsWith("dock")){
			String[] input = line.split(" ");
			try{
				String dockName = input[1];
				int dockIndex = Integer.parseInt(input[2]);
				int dockPort= Integer.parseInt(input[3]);
				int shipRef = Integer.parseInt(input[4]);
				return new Dock(dockName, dockIndex, dockPort, shipRef);
			} catch( Exception e) {
				System.out.println("Invalid Line arugment");
			}
		} else if (line.startsWith("port")){
			String[] input = line.split(" ");
			try{
				String portName = input[1];
				int portIndex = Integer.parseInt(input[2]);
				int parent= Integer.parseInt(input[3]);
				return new SeaPort(portName, portIndex, parent);
			} finally {
				System.out.println("Invalid Line arugment");
			}
		} else if (line.startsWith("ship")){
			String[] input = line.split(" ");
			try{
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
			} finally {
				System.out.println("Invalid Line arugment");
			}
		}
		 else if (line.startsWith("cship")){
				String[] input = line.split(" ");
				try{
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
				} finally {
					System.out.println("Invalid Line arugment");
				}
			}
		 else if (line.startsWith("pship")){
				String[] input = line.split(" ");
				try{
					String shipName = input[1];
					int shipIndex = Integer.parseInt(input[2]);
					int parentPortDock= Integer.parseInt(input[3]);
					double weight = Double.parseDouble(input[4]);
					double length = Double.parseDouble(input[5]);
					double width = Double.parseDouble(input[6]);
					double draft = Double.parseDouble(input[7]);
					int numPassengers = Integer.parseInt(input[8]);
					int numRooms= Integer.parseInt(input[9]);
				
					return new PassengerShip(shipName, 
							shipIndex, 
							parentPortDock,
							weight, 
							length,
							width, 
							draft, 
							numPassengers,
							numRooms);
				} finally {
					System.out.println("Invalid Line arugment");
				}
			}
		 else if (line.startsWith("person")){
				String[] input = line.split(" ");
				try{
					String personName = input[1];
					int personIndex = Integer.parseInt(input[2]);
					int parent= Integer.parseInt(input[3]);
					String skill  = input[4];

					return new Person(
							personName, 
							personIndex, 
							parent, 
							skill);
				} finally {
					System.out.println("Invalid Line arugment");
				}
			}
		 else if (line.startsWith("job")){
				String[] input = line.split(" ");
				try{
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
				} finally {
					System.out.println("Invalid Line arugment");
				}
			}
		return null;
	}
//	public static int main(int argv, String[] args){
//		return 1;
//	}
}
